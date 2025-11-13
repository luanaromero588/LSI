import java.util.*;
/**
 * Write a description of class Peaje here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peaje
{
    private String nombrePeaje;
    private ArrayList <Caja> cajas;
    
    public Peaje(String p_nombrePeaje, Caja p_caja){
        this.setNombrePeaje(p_nombrePeaje);
        this.setCajas(new ArrayList());
        
        agregarCaja(p_caja);
    }
    
    private void setNombrePeaje(String p_nombrePeaje){
        this.nombrePeaje = p_nombrePeaje;
    }
    
    private void setCajas(ArrayList <Caja> p_cajas){
        this.cajas = p_cajas;
    }
    
    public String getNombrePeaje(){
        return this.nombrePeaje;
    }
    
    public ArrayList <Caja> getCajas(){
        return this.cajas;
    }
    
    public boolean agregarCaja(Caja p_caja){
        return this.getCajas().add(p_caja);
    }
    
    public boolean quitarCaja(Caja p_caja){
        if(this.getCajas().size() > 1){
            return this.getCajas().remove(p_caja);
        } else {
            return false;
        }
    }
    
    public double totalRecaudado(){
        double total = 0;
        
        for(int i = 0; i < this.getCajas().size(); i++){
            total += this.getCajas().get(i).recaudacion();
        }
        
        return total;
    }
}