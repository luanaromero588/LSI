/**
 * Clase que modela una Facultad
 * 
 * @author Romero Ingrid Luana
 * @version 1. 06/10/2025
 */
import java.util.ArrayList;

public class Facultad{
    
    private String nombre;
    private ArrayList <Profesor> listaProfesores;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param Profesor p_profesor
    */
    public Facultad(String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.añadirProfesor(p_profesor);
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param ArrayList<Profesor> p_profesores
    */
    public Facultad(String p_nombre, ArrayList <Profesor> p_listaProfesores){
        this.setNombre(p_nombre);
        this.setListaProfesores(p_listaProfesores);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setListaProfesores(ArrayList<Profesor> p_listaProfesores){
        this.listaProfesores = p_listaProfesores;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Profesor> getListaProfesores(){
        return this.listaProfesores;
    }
    
    /**
     * Permite agregar un Profesor a la lista.
     * @param Profesor p_Profesor
     * @return devuelve un boolean
    */
    public boolean añadirProfesor(Profesor p_profesor){
           return this.getListaProfesores().add(p_profesor);
    }
    
    /**
     * Permite quitar un Profesor a la lista solo si actualmente tiene mas de 1.
     * @param Profesor p_Profesor
     * @return devuelve un boolean
    */
    public boolean quitarProfesor(Profesor p_profesor){
        if(this.getListaProfesores().size() > 1){
           return this.getListaProfesores().remove(p_profesor);
        }else{
            return false;
        }
    }
    public void nominaProfesores(){
        System.out.println("*************** Nómina Facultad: "+this.getNombre() +"\n---------------------------------------------------------------");
        for(Profesor unProfe : this.getListaProfesores()){
            System.out.println(unProfe.mostrarLinea());
        }
        System.out.println("----------------*****-----------\n");
    }
    
    /*este metodo esta en profesor;
    public double totalAPagar(){
        
    }*/
    
    public void listarProfesorCargos(){
        System.out.println("----------------*****-----------\n***** Detalle de Profesores y cargos de Facultad: %s *****" +this.getNombre() +"\n --------------------------------------------------------------------------------\n");
        for(Profesor unProfe : getListaProfesores()){
            unProfe.mostrar();
        }
        System.out.printf("Hay %d profesores " , this.getListaProfesores().size());
    }
}