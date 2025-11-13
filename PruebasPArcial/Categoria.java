/**
 * Write a description of class Categoria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Categoria
{
    private double costo;
    
    public Categoria(double p_costo){
        this.setCosto(p_costo);
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public abstract String tipoCategoria();
    
    public abstract double costoTotal();
    
    public abstract String leyendaCategoria();
}