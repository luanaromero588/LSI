
/**
 * Clase que modela un persona mujer
 * 
 * @author Romero Ingrid Luana
 * @version 1
 */
public class Mujer
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    /**
     * Constructor con datos de la mujer.
     * @param String p_nombre
     * @param Strin p_apellido
     * @param in p_edad 
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(null);
    }
    /**
     * Constructor con los datos de la muje 
     * @param String p_nombre
     * @param Strin p_apellido
     * @param in p_edad 
     * @param Hombre esposo
     */
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
        if(p_esposo != null){
         this.setEstadoCivil("Casada");
        }else{
           this.setEstadoCivil("Soltera");
        }
    }
    
    private void setNombre(String p_nombre){ 
        this.nombre = p_nombre; 
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    /**
     * Asigna una esposo a la mujer actual y cambia su estado civil a "casada"
     */
    public void casarseCon(Hombre p_hombre){
        if((this.getEstadoCivil().equalsIgnoreCase("Soltera") || this.getEstadoCivil().equalsIgnoreCase("Divorciada") )
            && ( (p_hombre.getEstadoCivil().equals("Soltera") || p_hombre.getEstadoCivil().equalsIgnoreCase("Divorciada")))){
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada") ;
            System.out.println("Se casaron con exitos");
        }else{
            System.out.println("Error ");
        }
    }
    /**
     * Asigna null al atributo esposo y cambia su estado civil a divorciado
     */
    public void divorcio(){
        if(this.estadoCivil.equals("Casada") && this.getEsposo() != null){
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
        System.out.println("Se ha divorciado");
        }else{
            System.out.println("No se puede divorciar");
        }
    }
    /**
     * Devuelve una cadena con los datos de la mujer
     * @return cadena de datos
     */
    public String datos(){
        return (this.getNombre() +" " +this.getApellido() +" de " +this.getEdad() +" años"); 
    }
    /**
     * Muesta los datos más el estado civil de la mujer
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos() +"-" +this.getEstadoCivil());
    }
    /**
     * Muestra los datos de la mujer y con quien esta casada
     */
    public void casadaCon(){
        System.out.println(this.datos() +" esta casada con " +this.getEsposo().datos()); 
    }
}