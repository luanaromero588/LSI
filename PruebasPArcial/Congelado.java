
/**
 * Write a description of class Congelado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Congelado
{
    private double precio_unitario;
    private String descripcion;
    
    public Congelado(double p_PU, String p_descripcion){
        this.setPU(p_PU);
        this.setDescripcion(p_descripcion);
    }
    
    public double getPU() {
    return precio_unitario;
    }
    public void setPU(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String toString(){
        return (this.getDescripcion() +"  PU: " +this.getPU() );
    }
    
    public abstract double precio(int p_cantidad);
    
}