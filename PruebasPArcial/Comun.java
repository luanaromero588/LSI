/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comun extends Etiqueta
{
    private double plus; 
    
    public Comun(double p_costo, double p_plus){
        super(p_costo);
        this.setPlus(p_plus);
    }
    
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    public double getPlus(){
        return this.plus;
    }
    
    public double precio(int q){
        return (super.getCosto() - (super.getCosto() * descuento(q)) ) * q;
    }
    
    private double descuento(int q){
        if( q >= 1 && q <=10){
            return 0;
        }else if( q <= 50){
            return 0.02;
        }else if(q <= 100){
            return  0.05;
        }else{
            int cant = (q - 100) / 10 ;
            return  0.05 + (cant * 0.01) ;
        }        
    }
    
    protected String tipo(){
        return " Comun";
    }
    
    public String toString(){
        return super.toString() +"- Diseño: $" +this.getPlus() ; 
    }
    
}
