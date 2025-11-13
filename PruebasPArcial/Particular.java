
/**
 * Write a description of class Particular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Particular extends Categoria
{
    public Particular(double p_costo){
        super(p_costo);
    }
    
    public String tipoCategoria(){
        return "Particular";
    }
    
    public double costoTotal(){
        return this.getCosto();
    }
    
    public String leyendaCategoria(){
        return "Particular - Tarifa base";
    }
}