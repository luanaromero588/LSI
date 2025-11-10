/**
 * @author Romero Ingrid Luana
 * @version 1. 11/10/2025
 */
import java.util.HashSet;
import java.util.Calendar;
public abstract class Visitante{
    private String nombre;
    private Calendar fechaVisita;
    
    public Visitante(String p_nombre, Calendar p_fechaVisita){
        this.setNombre(p_nombre);
        this.setFechaVisita(p_fechaVisita);
    }
    
    private void setNombre(String p_nombre){ 
        this.nombre = p_nombre; 
    }
    public String getNombre(){
        return this.nombre;
    }
    private void setFechaVisita(Calendar p_fechaVisita){ 
        this.fechaVisita = p_fechaVisita; 
    }
    public Calendar getFechaVisita(){
        return this.fechaVisita;
    }
    /**
     * Métodos abstactos
     */
    public abstract void mostrar();
    public abstract double entrada();
    public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);
    public abstract String tipoVisitante();
    public abstract HashSet<Persona> listarPersonas();
}