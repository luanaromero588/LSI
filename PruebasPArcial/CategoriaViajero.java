
/**
 * Write a description of class CategoriaViajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CategoriaViajero
{
    private double costoBase;
    
    public CategoriaViajero(double p_costoBase){
        this.setCostoBase(p_costoBase);
    }
    
    private void setCostoBase(double p_costoBase){
        this.costoBase = p_costoBase;
    }
    public double getCostoBase(){
        return costoBase;
    }
    public abstract double multiplicadorCategoria();
    public abstract String tipoCategoria();
    public abstract String descripcion(); 
}