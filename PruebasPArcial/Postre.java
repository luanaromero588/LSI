
/**
 * Write a description of class Postre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Postre extends Congelado
{
    private boolean enCaja;
    
    public Postre(double p_PU, String p_descripcion, boolean p_enCaja){
        super(p_PU, p_descripcion);
        this.setEnCaja(p_enCaja);
    }
    
    public boolean getEnCaja() {
    return enCaja;
    }
    public void setEnCaja(boolean enCaja) {
        this.enCaja = enCaja;
    }
    
    public String toString(){
        if(this.getEnCaja() == true){
            return super.toString() +"En caja";
        }else{
            return super.toString();
        }
    }
    
    public double precio(int p_cantidad){
        if(this.getEnCaja()){
            double precioR = p_cantidad * (super.getPU() + (super.getPU() * 0.05));
            return precioR;
        }else{
            double porcCantDoc = (p_cantidad / 12) * 0.10;
            double cantTotal = (p_cantidad * super.getPU());
            return (cantTotal - (cantTotal * porcCantDoc));
        }
    }
}