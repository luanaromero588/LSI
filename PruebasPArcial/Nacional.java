
/**
 * Write a description of class Nacioanal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nacional extends CategoriaViajero
{
    public Nacional(double p_costoBase){
        super(p_costoBase);
    }
    
    public  double multiplicadorCategoria(){
        return 1;
        //return p_costoBase; 
    }
    public  String tipoCategoria(){
        return "Nacional";
    }
    public  String descripcion(){
        return "Categoria: " +tipoCategoria();
    }
}