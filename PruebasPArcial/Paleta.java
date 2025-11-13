
/**
 * Write a description of class Paleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paleta extends Congelado
{
    private int tipo;
    
    public Paleta(double p_PU, String p_descripcion, int p_tipo){
        super(p_PU, p_descripcion);
        this.setTipo(p_tipo);
    }
    
    public int getTipo() {
    return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        if(this.getTipo() == 0){
            return super.toString() +" Agua" ;
        }else{
            return super.toString() +" Crema" ;
        }
    }
    
    public double precio(int p_cantidad){
        double precioAgua = super.getPU();
        double precioFinal = 0.0;
        if(this.getTipo() == 0){
            precioFinal = precioAgua;
        }else{
            precioFinal = precioAgua * 2 ;
        }
        
        if (p_cantidad > 20){
            precioFinal = precioFinal - (precioFinal * 0.20) ;
        }
        
        return p_cantidad * precioFinal;
    }
}