/**
 * Clase que modela una localidad. 
 * 
 * @author Romero Ingrid Luana 
 * @version 1
 */
public class Localidad{
    private String nombre;
    private String provincia;
    
    /**
     * Constructor que instancia un objeto localidad con su nombre y provincia a la que pertenece
     */
    public Localidad(String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getProvincia(){
        return this.provincia;
    }
    
    /**
     * Muestra por pantalla una cadena con el nombre de la localidad y provincia 
     * @return devulve un String
     */
    public String mostrar(){
        return ("Localidad: " +this.getNombre() +"\t" +"Provincia: " +this.getProvincia());
    }
}