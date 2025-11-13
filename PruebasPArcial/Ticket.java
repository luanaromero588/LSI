import java.util.*;

/**
 * Write a description of class Ticke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ticket
{
    private String turno;
    private String patente;
    private Calendar fecha;
    
    private Categoria categoria;
    
    public Ticket(String p_turno, String p_patente, Calendar p_fecha, Categoria p_categoria){
        this.setTurno(p_turno);
        this.setPatente(p_patente);
        this.setFecha(p_fecha);
        this.setCategoria(p_categoria);
    }
    
    private void setTurno(String p_turno){
        this.turno = p_turno;
    }
    
    private void setPatente(String p_patente){
        this.patente = p_patente;
    }
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCategoria(Categoria p_categoria){
        this.categoria = p_categoria;
    }
    
    public String getTurno(){
        return this.turno;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public Categoria getCategoria(){
        return this.categoria;
    }
    
    public double calcularPeaje(){
        double tarifa = this.getCategoria().costoTotal();
        
        if(this.getTurno().equals("Nocturno") || this.getTurno().equals("nocturno")){
            tarifa += tarifa * 0.10;
        }
        return tarifa;
    }
    
    public void imprimirTicket(){
        System.out.println("Fecha: " + this.getFecha());
        System.out.println("Categoria: " + this.getCategoria().tipoCategoria());
        System.out.println("Patente: " + this.getPatente() + " - Turno: " + this.getTurno());
        System.out.println("Total: " + calcularPeaje()); 
    }
}