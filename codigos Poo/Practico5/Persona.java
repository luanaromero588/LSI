/**
 * La clase  Persona modela los datos básicos de una persona,incluyendo nombre, apellido, número de DNI y año de nacimiento.
 * Además permite calcular su edad en base al año actual y mostrar sus datos completos.
 * 
 * @author Romero Ingrid Luana
 * @version 3.0 - 30/09/2025
 */
import java.util.*;  //Para trabajar con fechas, agregar.
public class Persona
{ 
    private int nroDni; 
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**
     * Constructor que inicializa los atributos de la persona con los valores dados.
     * 
     * @param p_dni Número de DNI de la persona
     * @param p_nombre Nombre de la persona
     * @param p_apellido Apellido de la persona
     * @param p_anio Año de nacimiento
     */
    public Persona(int p_dni , String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio); 
    }
    /**
     * Constructor que inicializa atributos de la persona esta vez con fecha de nacimiento
     * @param p_dni Número de DNI de la persona
     * @param p_nombre Nombre de la persona
     * @param p_apellido Apellido de la persona
     * @param p_fechaNacimiento 
     */
    public Persona(int p_dni , String p_nombre, String p_apellido, Calendar p_fechaNacimiento){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fechaNacimiento); 
    }
    
    //setters y getters
    private void setNombre(String p_nombre){ 
        this.nombre = p_nombre; 
    }
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio){
        //objeto Calendar con fecha y hora actual
        Calendar anioNacimiento = Calendar.getInstance();
        //configura el año , mes ,dia
        anioNacimiento.set(p_anio,1,1);
        //guardo el Calendar 
        this.fechaNacimiento = anioNacimiento;
    }
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    //metodos publicos de la clase
    public String getNombre(){
        return this.nombre;
    }
    public int getDNI(){
        return this.nroDni;
    }
    public String getApellido(){
        return this.apellido;
    }
    //get(Calendar.YEAR) extrae solo el año del calendario this.getFechaNacimiento()
    public int getAnioNacimiento(){
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
   
     /**
     * Calcula la edad de la persona en base al año actual.
     * 
     * @return Edad actual
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento(); 
    }
    
    
    /**
     * Devuelve el nombre y apellido concatenados.
     * 
     * @return Cadena con "Nombre Apellido"
     */
    public String nomYApe(){
        return this.getNombre() +" " +this.getApellido();  
    }
    
    /**
     * Muestra la información de la persona, incluyendo
     * nombre completo, DNI y edad.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " +this.nomYApe() );
        System.out.println("DNI: " +this.getDNI() +"\t" +"Edad: " +this.edad() );
        
        
    }
    
    /**
     *Comprueba si es el dia del cumpleaños de la persona
     *@return devuelve un booleano
     */
    public boolean esCumpleaños(){
        //creo un objeto Calendar fecha hoy
        Calendar fechaHoy = Calendar.getInstance();
        
        // creo una variable temporarl mesHoy y  obtengo el mes del calendario.
        int mesHoy = fechaHoy.get(Calendar.MONTH);
        int diaHoy = fechaHoy.get(Calendar.DATE);
        
        int mesNacimiento = this.getFechaNacimiento().get(Calendar.MONTH);
        int diaNacimiento = this.getFechaNacimiento().get(Calendar.DATE);
        
        return (mesNacimiento == mesHoy) && (diaNacimiento == diaHoy);
    }
}