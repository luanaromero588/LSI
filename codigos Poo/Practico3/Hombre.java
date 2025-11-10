/**
 * Clase que modela un persona Hombre
 * 
 * @author Romero Ingrid Luana
 * @version 1
 */
public class Hombre
{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(null);
    }
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
        if (p_esposa != null) {
        this.setEstadoCivil("Casado");
    } else {
        this.setEstadoCivil("Soltero");
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    /**
     * Asigna una esposa al hombre actual y cambia su estado civil a "casado"
     */
    public void casarseCon(Mujer p_mujer){
        if((this.getEstadoCivil().equals("Soltero") || this.getEstadoCivil().equalsIgnoreCase("Divorciado")) &&
            (p_mujer.getEstadoCivil().equals("Soltera") || p_mujer.getEstadoCivil().equalsIgnoreCase("Divorciada"))){
            this.setEsposa(p_mujer);
            this.setEstadoCivil("Casado") ;
            System.out.println("Se casaron con exitos");
        }else{
            System.out.println("ERROR.");
        }
    }
    /**
     * Asigna null al atributo esposa y cambia el estado civil a divorciado 
     */
    public void divorcio(){
        
        if(this.getEstadoCivil().equals("Casado") && this.getEsposa() != null){
           this.setEsposa(null);
           this.setEstadoCivil("Divorciado");
           System.out.println("Se ha divorciado");
        }else{
            System.out.println("No se puede divorciar");
        }
    }
   
    /**
     * Devuelve una cadena con los datos del hombre
     * @return cadena de datos
     */
    public String datos(){
        return (this.getNombre() +" " +this.getApellido() +" de " +this.getEdad() +" años"); 
    }
    /**
     * Muesta los datos más el estado civil del hombre
     */
    public void mostrarEstadoCivil(){
        System.out.println(this.datos() +"-" +this.getEstadoCivil());
    }
    /**
     * Muestra los datos del hombre y con quien esta casado
     */
    public void casadoCon(){
        System.out.println(this.datos() +" esta casado con " +this.getEsposa().datos());
    }
}
