
/**
 * Clase que modela un paciente 
 * 
 * @author Romero Ingri Luana 
 * @version 1
 */
public class Paciente
{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }
    
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    public String getNombre(){
        return this.nombre;
    }    
    public String getDomicilio(){
        return this.domicilio;
    }
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    /**
     * Muestra los datos del paciente por pantalla
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " +this.getNombre() +"\t" +"Historia clínica: " +this.getHistoriaClinica() +"\t" +"Domicilio: " +this.getDomicilio());
        System.out.println(this.getVive().mostrar()); //mostrar() en localidad solo retorna, por lo cual aca debo mostrar por pantalla
    }
    
    /**
     * Cadena con los datos del paciente
     * @return retorna un String
     */
    public String cadenaDeDatos(){
        return (this.getNombre() +"....." +this.getHistoriaClinica() +"....." +this.getDomicilio() +"-" +this.getVive().getNombre() +"-" +this.getVive().getProvincia());
    }
}