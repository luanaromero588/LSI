/**
 * @author Romero Ingrid Luana
 * @version 1. 16/10/2025
 */
import java.util.Calendar;
import java.util.HashSet;
public class Individuo extends Visitante{
    private Persona persona;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param Persona p_persona
    *@param String p_nombre 
    *@param Calendar p_fechaVisita
    */
    public Individuo(Persona p_persona, Calendar p_fechaVisita){
        super(p_persona.getNombre(),p_fechaVisita);
        this.setPersona(p_persona);
    }
    //setters y getters
    private void setPersona(Persona p_persona){
        this.persona = p_persona;
    }
    public Persona getPersona(){
        return this.persona;
    }
    /**
     * Devuelve una cadena que indica que tipo de visitante es
     * @return devuelve un String
    */
    public String tipoVisitante(){
        return "Visitante";
    }
    /**
    * Lista por fecha los visitantes
    */
    public void listarPorFecha(Calendar p_fecha, String p_visitante){
         if(super.getFechaVisita().equals(p_fecha) && this.tipoVisitante().equalsIgnoreCase(p_visitante)){
             this.mostrar();
         }
    }
    /**
    * Muestra por pantalla los datos de la persona
    */
    public void mostrar(){
        this.getPersona().mostrar();
    }
    /**
    *Devuelve el valor de la entrada
    *@return devuelve un double
    */
    public  double entrada(){
        return 10.00;
    }
    /**
     * Lista al individuo.
     * @return un conjunto de Personas compuesto por el individuo
     */
    public HashSet<Persona> listarPersonas(){
       HashSet<Persona> personas = new HashSet<>(); 
       personas.add(this.getPersona());
       return personas;
    }
}