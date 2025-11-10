
/**
 * Clase que modela servicios
 * 
 * @author Romero Ingrid Luana 
 * @version 1. 13/10/2025
 */
public class Servicio{
    private String descripcion;
    private double precio;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_descripcion
    *@param double p_precio
    */
    public Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio);
    }
    
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    public double getPrecio(){
        return this.precio;
    }
}