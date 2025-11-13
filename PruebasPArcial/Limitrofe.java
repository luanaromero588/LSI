
/**
 * Write a description of class Limitrofe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Limitrofe extends CategoriaViajero
{
    public Limitrofe(double p_costoBase){
        super(p_costoBase);
    }
    
    public  double multiplicadorCategoria(){
        return 0.30; //porcentaje
    }    
    public  String tipoCategoria(){
        return "Limitrofe";
    }
    public  String descripcion(){
        return "Categoria: " +tipoCategoria();
    }
}