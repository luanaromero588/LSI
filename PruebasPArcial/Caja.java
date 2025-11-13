import java.util.*;
/**
 * Write a description of class Caja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caja
{
    private int nroCaja;
    private Cajero cajero;
    
    private ArrayList <Ticket> tickets;
    
    public Caja(int p_nroCaja, Cajero p_cajero, Ticket p_ticket){
        this.setNroCaja(p_nroCaja);
        this.setCajero(p_cajero);
        this.setTickets(new ArrayList());
        
        agregarTicket(p_ticket);
    }
    
    private void setNroCaja(int p_nroCaja){
        this.nroCaja = p_nroCaja;
    }
    
    private void setCajero(Cajero p_cajero){
        this.cajero = p_cajero;
    }
    
    private void setTickets(ArrayList <Ticket> p_tickets){
        this.tickets = p_tickets;
    }
    
    public int getNroCaja(){
        return this.nroCaja;
    }
    
    public Cajero getCajero(){
        return this.cajero;
    }
    
    public ArrayList <Ticket> getTickets(){
        return this.tickets;
    }
    
    public double recaudacion(){
        double recaudacion = 0;
        
        for(int i = 0; i < this.getTickets().size(); i++){
            recaudacion += this.getTickets().get(i).calcularPeaje();
        }
        
        return recaudacion;
    }
    
    public int contarPorCategoria(String tipo){
        int contador = 0;
        
        for(int i = 0; i < this.getTickets().size(); i++){
            if(this.getTickets().get(i).getCategoria().tipoCategoria().equals(tipo)){
                contador++;
            }
        }
        
        return contador;
    }
    
    public int contarPorTurno(String tipo){
        int contador = 0;
        
        for(int i = 0; i < this.getTickets().size(); i++){
            if(this.getTickets().get(i).getTurno().equals(tipo)){
                contador++;
            }
        }
        
        return contador;
    }
    
    public boolean agregarTicket(Ticket p_ticket){
        return this.getTickets().add(p_ticket);
    }
    
    public boolean quitarTicket(Ticket p_ticket){
        return this.getTickets().remove(p_ticket);
    }
    
    public void cierreCaja(){
        System.out.println("Caja Numero: " + this.getNroCaja());
        System.out.println("Recaudacion" + recaudacion());
        System.out.println("Vehiculos Oficiales " + contarPorCategoria("Oficial"));
        System.out.println("Vehiculos turno nocturno: " + contarPorTurno("Nocturno"));
    }
}