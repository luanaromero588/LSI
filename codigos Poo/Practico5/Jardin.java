
/**
 * Clase que modela un jardin con la cantidad de litros que necesita para pintarlo.
 * 
 * @author Romero Ingrid Luana
 * @version 10-10-2025
 */
import java.util.ArrayList;
public class Jardin
{
    private String nombre;
    private ArrayList <FiguraGeometrica> listaFiguras;
    
    /**
    * Constructor para una colección de figuras geometricas.(*...n)
    * @param p_nombre Nombre del Comercio de tipo String.
    */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_listaFiguras ){
        this.setNombre(p_nombre);
        this.setListaFiguras(p_listaFiguras);
    }
    
    /**
    * Constructor para una colección de empleados vacia.(0..*)
    * @param p_nombre Nombre del Comercio de tipo String.
    */
    public Jardin(String p_nombre ){
        this.setNombre(p_nombre);
        this.setListaFiguras(new ArrayList<FiguraGeometrica> ());
    } 
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    private void setListaFiguras(ArrayList<FiguraGeometrica> p_listaFigus){
        this.listaFiguras = p_listaFigus;
    }
    public ArrayList <FiguraGeometrica> getListaFiguras(){
        return this.listaFiguras;
    }
    
    /**
     * Permite agregar una figura a la lista de figuras
     * @param FiguraGeometrica p_figura
     * @return devuelve un boolean
    */
    public boolean añadirFigu( FiguraGeometrica p_figura){
        return this.listaFiguras.add(p_figura);
    }
    /**
     * Permite eliminar una figura de la lista de figuras
     * @param FiguraGeometrica p_figura
     * @return devuelve un boolean
    */
    public boolean quitarFigu(FiguraGeometrica p_figura){
        return this.listaFiguras.remove(p_figura);
    }
    
    /**
     * Calcula la cantidad de litros necesarios a partir del calculo de latas
     * @return devuelve un double
    */
    private double cuantosLitros(){
        return this.cuantasLatas() * 4;
    }
    /**
     * Calcula la cantidad de latas necesarias a partir del calculo de m2.
     * @return devuelve un int
    */
    public int cuantasLatas(){
        //redonde con ceil que redondea hacia arriba porque si sobra aunque sea un poco, necesito otra lata entera
        //casteo el resultado de la division(double) a int
       int cantLatas = (int) Math.ceil(( 1 * this.cuantosMetros()) / 20);
       return cantLatas;
    }
    
    /**
     * Calcula la cantidad de m2 a cubrir
     * @return devuelve un double
    */
    public double cuantosMetros(){
        double totalSuperficie = 0.0;
        for(FiguraGeometrica figu : this.getListaFiguras()){
            totalSuperficie = totalSuperficie + figu.superficie();
        }
        return totalSuperficie;
    }
    
    /**
     * Muestra por pantalla los datos del presupuesto
    */
    public void detalleFiguras(){
        System.out.println("Presupuesto: " +this.getNombre() +"\n");
        for(FiguraGeometrica figu : this.getListaFiguras()){
            figu.mostrarSuperficie();
        }
        System.out.println("----------------------------------");
        System.out.printf("   Total a cubir: %.2f m2 \n   Comprar %d latas \n", +this.cuantosMetros(), +this.cuantasLatas());
    }
}