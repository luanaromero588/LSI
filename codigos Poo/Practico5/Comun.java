
/**
 * Clase que modela una etiqueta de tipo comun
 * 
 * @author Romero Ingrid Luana
 * @version 1. 17/10/2025
 */
public class Comun extends Etiqueta
{
    private double plus;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param double p_costo
    *@param double p_plus
    */
    public Comun(double p_costo,double p_plus){
        super(p_costo);
        this.setPlus(p_plus);
    }
    
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    public double getPlus(){
        return this.plus;
    }
    
    /**
     * Metodo privado, calcula el precio de la etiqueta
     * @return devuelve un double
    */
    public double precio(int q){
        return (super.getCosto() - (super.getCosto() * descuento(q)) ) * q;
    }
    
     /**
     * Metodo privado, calcula el descuento del precio
     * @return devuelve un double
    */
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
    /**
     * Metodo publico, devuelve una cadena con los datos de la etiqueta
     * @return devuelve un String
    */
    public String toString(){
        return (super.toString()) +"Diseño:$ " +this.getPlus() ;
    }
    
    /**
     * Metodo publico, devuelve una cadena con el tipo de la etiqueta
     * @return devuelve un String
    */
    protected  String tipo(){
        return "Comun";
    }
}