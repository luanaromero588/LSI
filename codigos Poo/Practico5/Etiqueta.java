
/**
 * Clase que modela etiquetas para packaging.
 * 
 * @author Romero Ingrid Luana
 * @version 1. 17/10/2025
 */
public abstract class Etiqueta
{
    private double costo;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param double p_costo
    */
    public Etiqueta(double p_costo){
        this.setCosto(p_costo);
    }
    
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Metodo publico,devuelve una cadena con los datos de la etiqueta
     * @return devuelve un String
    */
    public String toString(){
      return ("Tipo " +this.tipo()  +"- Costo: $ " +this.getCosto());
    }
    
    /**
     * Metodos Abstractos
    */
    public abstract double precio(int q);
    protected abstract String tipo();
}