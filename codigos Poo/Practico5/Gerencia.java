
/**
 * Superclase que modela Gerencia
 * 
 * @author Romero Ingrid Luana
 * @version 1 11/10/2025
 */
import java.util.ArrayList;
public class Gerencia{
    private String nombre;
    private ArrayList<Alojamiento> listaAlojamientos;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase, con lista de alojamientos vacia(0..*)
    *@param String p_nombre
    */
    public Gerencia(String p_nombre){
        this.setNombre(p_nombre);
        this.setListaAlojamientos(new ArrayList<Alojamiento> ());
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase, con una lista de alojaminetos(*..N)
    *@param String p_nombre
    */
    public Gerencia(String p_nombre, ArrayList<Alojamiento> p_listaAlojamientos){
        this.setNombre(p_nombre);
        this.setListaAlojamientos(p_listaAlojamientos);
    }
    
    //setters y getters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    //manejo de la coleccion
    private void setListaAlojamientos(ArrayList<Alojamiento> p_listaAlojamientos){
        this.listaAlojamientos = p_listaAlojamientos;
    }
    public ArrayList <Alojamiento> getListaAlojamientos(){
        return this.listaAlojamientos;
    }
    public boolean agregarAlojamiento(Alojamiento p_alojamiento){
        return this.listaAlojamientos.add(p_alojamiento);
    }
    public boolean quitarAlojamiento(Alojamiento p_alojamiento){
        return this.listaAlojamientos.remove(p_alojamiento);
    }
    
    /**
     * Metodo publico, devuelve la cantidad de alojamientos
     * @param String p_tipoAlojamiento
     * @return devuelve un int
    */
    public int contarAlojamiento(String p_tipoAlojamiento){
        int totalAlo = 0;
        for(Alojamiento unAlojamiento: getListaAlojamientos()){
            totalAlo = totalAlo + unAlojamiento.contar(p_tipoAlojamiento);
        }
        return totalAlo;
    }
    
    /**
     * Metodo publico, muestra por pantalla los datos del alojamiento
    */
    public void liquidar(){
        for(Alojamiento unAlojamiento: this.getListaAlojamientos()){
           unAlojamiento.liquidar();
           System.out.println("");
       }        
    }
    
    /**
     * Metodo publico, muestra la liquidacion
     */
    public void mostrarLiquidacion(){
        System.out.println("\n Gerencia " +this.getNombre() +"\nLiquidación-------------------\n");
        this.liquidar();
        System.out.println("Alojamiento tipo Cabaña ---->"+this.contarAlojamiento("Cabaña"));
        System.out.println("Alojamiento tipo Hotel ---->"+this.contarAlojamiento("Hotel"));
    }
}