/**
 * @author Romero Ingrid Luana
 * @version 1. 16/10/2025
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Calendar;
public class Delegacion extends Visitante{
    private ArrayList<Individuo> integrantes;
    /**
    *Constructor con parametros, instancia un objeto de la clase, con una lista de integrantes preexistente.(*...n)
    *@param String p_nombre
    *@param Calendar p_fecha
    *@param ArrayList<Individuo> p_integrantes
    */
    public Delegacion(String p_nombre, Calendar p_fechaVisita,ArrayList<Individuo> p_integrantes){
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(p_integrantes);
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase con una lista de integrantes vacia(0..*)
    *@param String p_nombre
    *@param Calendar p_fecha
    *@param Individuo p_individuo
    */
    public Delegacion(String p_nombre, Calendar p_fechaVisita){
        super(p_nombre,p_fechaVisita);
        this.setIntegrantes(new ArrayList<Individuo>());
    }
    //setters y getters
    private void setIntegrantes(ArrayList<Individuo> p_integrantes){
        this.integrantes = p_integrantes;
    }
    private ArrayList<Individuo> getIntegrantes(){
        return this.integrantes;
    }
    
    /**
     * Devuelve una cadena que indica que tipo de visitante es
     * @return devuelve un String
    */
    public  String tipoVisitante(){
        return "Delegacion";
    }
    /**
     * Agrega un individuo a la delegación.
     * @param p_individuo El individuo a agregar.
     */
    public void inscribirIndividuo(Individuo p_individuo){
        if(this.getIntegrantes().contains(p_individuo)){
            System.out.println("Ya ingreso este individuo");
        }else{
            this.getIntegrantes().add(p_individuo);
            System.out.println("Individuo agregado con exito");
        }
    }
     /**
     * Elimina un individuo de la delegación.
     * @param p_individuo El individuo a eliminar.
     */
    public boolean quitarIntegrante(Individuo p_individuo){
        if(cantidadIntegrantes() > 1){
            return this.getIntegrantes().remove(p_individuo);
        }else{
            return false;
        }
    }    
    /**
    * Metodo publico, devuelve la cantidad de integrantes
    * @return devuelve un int
    */
    public int cantidadIntegrantes(){
        return this.getIntegrantes().size();
    }
    /**
    * Metodo publico, muestra por pantalla los datos de la delegacion
    */
    public void mostrar(){
        System.out.println("-------------------------------------------");
        System.out.println("Integrantes");
        System.out.println("Delegacion " +this.getNombre());
        for(Individuo unIndividuo: this.getIntegrantes()){
           unIndividuo.mostrar();
        }
        System.out.println("-------------------------------------------");
    }
    
    /**
     * Calcula el costo de la entrada de la delegación con un descuento del 10%.
     * @return El costo total de la entrada.
     */
    public double entrada(){
        double precio = this.cantidadIntegrantes() * 10;
        return precio - (precio * 0.10);
    }
    /**
    * Metodo publico, lista por fecha los datos de la delegacion
    */
    public  void listarPorFecha(Calendar p_fecha, String p_visitante){
        if(this.getFechaVisita().equals(p_fecha)  && this.tipoVisitante().equalsIgnoreCase(p_visitante)){
            this.mostrar();
        }
    }
    /**
     * Devuelve un conjunto con todas las personas que forman parte de la delegación.
     * 
     * Recorre la lista de integrantes (ArrayList de objetos Individuo) y agrega al conjunto(HashSet)
     * la Persona asociada a cada uno de ellos.
     *
     * @return un  HashSet<Persona> que contiene todas las personas integrantes de la delegación.
     */
    public  HashSet<Persona> listarPersonas(){
       HashSet<Persona> personas = new HashSet<>(); 
       for(Individuo unIndividuo: this.getIntegrantes()){
           personas.add(unIndividuo.getPersona());
       }
       return personas;
    }
}