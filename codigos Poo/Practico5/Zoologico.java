/**
 * 
 * @author Romero Ingrid Luana
 * @version 1. 16/10/2025
 */
import java.util.Calendar;
import java.util.HashSet;
import java.util.ArrayList;
public class Zoologico{
    private String nombre;
    private ArrayList<Visitante> visitantes;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase con una coleccion de visitantes vacia.(0..*)
    *@param String p_nombre
    */
    public Zoologico(String p_nombre){
        this.setNombre(p_nombre);
        this.setVisitantes( new ArrayList<Visitante> ());
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase con una lista de visitantes preexistente.(*...n)
    *@param String p_nombre
    *@param ArrayList<Visitante> p_visitantes
    */
    public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes){
        this.setNombre(p_nombre);
        this.setVisitantes(p_visitantes);
    }
    
    //setters y getters
    private void setVisitantes(ArrayList<Visitante> p_visitantes){
        this.visitantes = p_visitantes;
    }
    public ArrayList<Visitante> getVisitantes(){
        return this.visitantes;
    }
    private void setNombre(String p_nombre){ 
        this.nombre = p_nombre; 
    }
    public String getNombre(){
        return this.nombre;
    }
    
    //quitar agregar visitante
    public void nuevoVisitante(Visitante p_visitante){
        this.getVisitantes().add(p_visitante);
    }
    public boolean quitarVisitante(Visitante p_visitante){
        return this.getVisitantes().remove(p_visitante);
    }

    /**
     * Lista los visitantes de un tipo específico que asistieron en una fecha determinada.
     * @param p_fecha La fecha de la visita.
     * @param p_tipoVisitante El tipo de visitante ("Individuo" o "Delegación").
     */
    public void listarTipoVisitantePorFecha(Calendar p_fecha, String p_tipoVisitante){
         for(Visitante unVisitante : getVisitantes()){
            if(unVisitante.getFechaVisita().equals(p_fecha) && unVisitante.tipoVisitante().equalsIgnoreCase(p_tipoVisitante)){
                unVisitante.mostrar();
            }
        }
    }
    /**
     * Muestra todos los visitantes que asistieron en una fecha determinada.
     * @param p_fecha La fecha de la visita.
     */
    public void listarVisitantePorFecha(Calendar p_fecha){
        for(Visitante unVisitante : getVisitantes()){
            if(unVisitante.getFechaVisita().equals(p_fecha)){
                unVisitante.mostrar();
            }
        }  
    }
    /**
     * Metodo publico, devuelve la recaudacion total en un rango de fechas.
     * @param Calendar p_fechaDesde
     * @param Calendar p_fechaHasta
     * @return devuelve un double
    */
    public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta){
        double total = 0.0;
        for(Visitante unVisitante : getVisitantes()){
                 //La fecha de visita es igual o posterior a la fecha desde”.
            if( (unVisitante.getFechaVisita().compareTo(p_fechaDesde) >= 0) 
                 //“La fecha de visita es igual o anterior a la fecha hasta”.
                 && (unVisitante.getFechaVisita().compareTo(p_fechaHasta) <= 0) ){
                total = total + unVisitante.entrada();
            }
        }
        return total;
    }
    
    /**
     * Devuelve un conjunto con todas las personas que visitaron el zoológico desde su apertura (sin repetir cada persona).
     *
     * @return un  HashSet<Persona> que contiene todas las personas que
     *         visitaron el zoológico al menos una vez.
     */
    public HashSet<Persona> listarPersonasQueVisitaronElZoo(){
       HashSet<Persona> personas = new HashSet<>(); 
       for(Visitante unVisitante: this.getVisitantes()){
           personas.addAll(unVisitante.listarPersonas());//agrega todas las personas
       }
       return personas;
    }
    
}