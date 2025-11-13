
/**
 * Write a description of class NoLimitrofe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoLimitrofe extends CategoriaViajero
{
    public NoLimitrofe(double p_costoBase){
        super(p_costoBase);
    }
    
    public  double multiplicadorCategoria(){
        return 1.60;
    }
    public  String tipoCategoria(){
        return "No limitrofe";
    }
    public  String descripcion(){
        return "Categoria: " +tipoCategoria();
    }
}