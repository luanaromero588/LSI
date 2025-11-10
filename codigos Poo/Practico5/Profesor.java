/**
 * Subclase profesor que extiende ser la superclase Persona.
 * Un profesor es una persona que puede tenes hasta tres cargos.
 * 
 * @author Romero Ingrid Luana
 * @version 1. 06/10/2025
 */
import java.util.ArrayList;
import java.util.Calendar;
public class Profesor extends Persona{
    private String titulo;
    private ArrayList <Cargo> listaCargos;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_dni
    *@param String p_nombre
    *@param String p_apellido
    *@param int p_anio
    *@param String p_titulo
    *@param ArrayList<Cargo> p_cargos
    */
    public Profesor(int p_dni , String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList <Cargo> p_listaCargos){
        super( p_dni , p_nombre, p_apellido,p_anio);
        this.setTitulo(p_titulo);
        this.setListaCargos(p_listaCargos);
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_dni
    *@param String p_nombre
    *@param String p_apellido
    *@param Calendar p_fecha
    *@param String p_titulo
    *@param ArrayList<Cargo> p_cargos
    */
    public Profesor(int p_dni , String p_nombre, String p_apellido, Calendar p_fechaNacimiento, String p_titulo, ArrayList <Cargo> p_listaCargos){
        super( p_dni , p_nombre, p_apellido, p_fechaNacimiento);
        this.setTitulo(p_titulo);
        this.setListaCargos(p_listaCargos);
    }
    
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    private void setListaCargos(ArrayList <Cargo> p_listaCargos){
        this.listaCargos = p_listaCargos;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public ArrayList <Cargo> getListaCargos(){
        return this.listaCargos;
    }
    
    /**
     * Permite agregar un cargo a la lista si actualmente tiene menos de 3.
     * @param Cargo p_cargo
     * @return devuelve un boolean
    */
    public boolean añadirCargo(Cargo p_cargo){
        if(this.getListaCargos().size() < 3){
           return this.getListaCargos().add(p_cargo);
        }else{
            return false;
        }
    }
    
    /**
     * Permite quitar un cargo a la lista solo si actualmente tiene mas de 1.
     * @param Cargo p_cargo
     * @return devuelve un boolean
    */
    public boolean quitarCargo(Cargo p_cargo){
        if(this.getListaCargos().size() > 1){
           return this.getListaCargos().remove(p_cargo);
        }else{
            return false;
        }
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: "+getTitulo() +"\n"); 
        this.listarCargos();
        System.out.printf("**Sueldo Total: %.2f **" , this.sueldoTotal());

    }
    /**
    * Muestra por pantalla los datos de los cargos
    */
    public void listarCargos(){
     System.out.println("-***** Cargos Asignados *****-" +"\n --------------------------------------- ");
     for(Cargo unCargo : getListaCargos()){
         unCargo.mostrarCargo();
         System.out.println(" ");
     }
    }
     /**
     * Calcula el sueldo del profesor sumando el sueldo de sus tres cargos.
     * @return devuelve un double
    */
    public double sueldoTotal(){
        double sueldoTotal = 0.0;
        for(Cargo unCargo : getListaCargos()){
            sueldoTotal = sueldoTotal + unCargo.sueldoDelCargo(); 
        }
        return sueldoTotal;
    }
    /**
    * Devuelve una cadena con los datos del profesor
    * @return devuelve un String
    */
    public String mostrarLinea(){
        return "DNI:" +super.getDNI() +"- Nombre: " +super.nomYApe() +"- Sueldo Total: " +this.sueldoTotal(); 
    }
}
