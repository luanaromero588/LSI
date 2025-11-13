
/**
 * Write a description of class Oficial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oficial extends Categoria
{
    private String porte;
    
    public Oficial(String p_porte, double p_costo){
        super(p_costo);
        this.setPorte(p_porte);
    }
    
    private void setPorte(String p_porte){
        this.porte = p_porte;
    }
    
    public String getPorte(){
        return this.porte;
    }
    
    public String tipoCategoria(){
        return "Oficial";
    }
    
    public double costoTotal(){
        double costo = 0;
        
        if(this.getPorte().equals("Pequeño")){
            costo = this.getCosto() - (this.getCosto() * 0.30);
        } else {
            costo = this.getCosto() - (this.getCosto() * 0.10);
        }
        
        return costo;
    }
    
    public String leyendaCategoria(){
        return "Vehiculo oficial - Porte: " + this.getPorte();
    }
}