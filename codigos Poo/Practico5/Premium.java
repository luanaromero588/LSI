/**
 * Clase que modela una etiqueta de tipo premium
 * 
 * @author Romero Ingrid Luana
 * @version 1. 17/10/2025
 */
public class Premium extends Etiqueta{

    private int colores;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param double p_costo
    *@param int p_colores
    */
    public Premium(double p_costo,int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }
    
    private void setColores(int p_colores){
        this.colores = p_colores;
    }
    public double getColores(){
        return this.colores;
    }
    
    /**
     * Metodo privado, calcula el precio de la etiqueta
     * @return devuelve un double
    */
    public double precio(int q){
        return (super.getCosto() + (super.getCosto() * plus()) )* q;
    }
    
     /**
     * Metodo privado, calcula el adicional del precio
     * @return devuelve un double
    */
    private double plus(){
        if(this.getColores() == 0){
            return 0;
        }else if(this.getColores() == 2){
            return 0.05;
        }else if(this.getColores() == 3){
            return  0.07;
        }else{
            return  0.07 + (this.getColores() - 3) *  0.03 ;
        }
    }
    /**
     * Metodo publico, devuelve una cadena con los datos de la etiqueta
     * @return devuelve un String
    */
    public String toString(){
        return (super.toString()) + " - Colores: " + this.getColores();
    }
    
    /**
     * Metodo publico, devuelve una cadena con el tipo de la etiqueta
     * @return devuelve un String
    */
    protected  String tipo(){
        return "Premium";
    }
}
