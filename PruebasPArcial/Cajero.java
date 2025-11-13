
/**
 * Write a description of class Cajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cajero
{
    private String usuarioCajero;
    private String nombre;
    
    public Cajero(String p_usuario, String p_nombre){
        this.setUsuarioCajero(p_usuario);
        this.setNombre(p_nombre);
    }
    
    private void setUsuarioCajero(String p_usuario){
        this.usuarioCajero = p_usuario;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getUsuarioCajero(){
        return this.usuarioCajero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String toString(){
        return "Cajero: " + this.getUsuarioCajero() + " - nombre: " + this.getNombre();
    }
}