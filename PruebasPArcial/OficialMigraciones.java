
/**
 * Write a description of class OficialMigraciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OficialMigraciones
{
    private String usuario;
    private String nombre;
    
    public OficialMigraciones(String p_usuario, String p_nombre){
        this.setUsuario(p_usuario);
        this.setNombre(p_nombre);
    }
        public String getUsuario() {
        return this.usuario;
    }
    public void setUsuario(String p_usuario) {
        this.usuario = p_usuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    public String toString(){
        return "-Cajero: "+this.getUsuario() +" -Nombre:" +this.getNombre() ;
    }
}