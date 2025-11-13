
/**
 * Write a description of class VisadoEspecial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VisadoEspecial extends CategoriaViajero
{
    public VisadoEspecial(double p_costoBase){
        super(p_costoBase);       
    }
    
    public  double multiplicadorCategoria(){
        return 2.0;
        /// pagan un incremento del 100% sobre la tarifa base.
    }
    public  String tipoCategoria(){
        return "Visado especial";
    }
    public String descripcion(){
        return "Categoría: " +tipoCategoria();
     }
    //atencion!! retornan un string!!
}