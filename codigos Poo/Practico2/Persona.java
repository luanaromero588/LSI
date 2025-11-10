
/**
 * La clase  Persona modela los datos básicos de una persona,incluyendo nombre, apellido, número de DNI y año de nacimiento.
 * Además permite calcular su edad en base al año actual y mostrar sus datos completos.
 * 
 * 
 * @author Romero Ingrid Luana
 * @version 1.0 - 2025-08-20
 */
import java.util.*;  //Para trabajar con fechas, agregar.
public class Persona
{ //atributos de la clase persona
    private int nroDni; //Solo se puede usar dentro de la clase donde fue definido.(private).
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    /**
     * Constructor que inicializa los atributos de la persona con los valores dados.
     * 
     * @param p_dni Número de DNI de la persona
     * @param p_nombre Nombre de la persona
     * @param p_apellido Apellido de la persona
     * @param p_anio Año de nacimiento
     */
    public Persona(int p_dni , String p_nombre, String p_apellido, int p_anio){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio); 
    }
    // metodos privados de la clase. 
    // Para acceder desde afuera, usás métodos públicos (getters para leer, setters para asignar/modificar). Esto se llama encapsulamiento.
    //setters y getters
    private void setNombre(String p_nombre){ 
        nombre = p_nombre; // guarda "Luana" en el atributo nombre.
    }
    private void setDNI(int p_dni){
        nroDni = p_dni;
    }
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    private void setAnioNacimiento(int p_anio){
        anioNacimiento = p_anio;
    }
    //metodos publicos de la clase(puede ser usado desde cualquier parte del program.)
    public String getNombre(){
        return nombre;
    }
    public int getDNI(){
        return nroDni;
    }
    public String getApellido(){
        return apellido;
    }
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
   
     /**
     * Calcula la edad de la persona en base al año actual.
     * 
     * @return Edad actual
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar(); //Para saber el año actual usar:
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - getAnioNacimiento(); 
    }
    
    /**
     * Devuelve el nombre y apellido concatenados.
     * 
     * @return Cadena con "Nombre Apellido"
     */
    public String nomYApe(){
        return getNombre() +" " +getApellido();  
    }
    
    /**
     * Muestra la información de la persona, incluyendo
     * nombre completo, DNI y edad.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " +nomYApe() );
        System.out.println("DNI: " +getDNI() +"\t" +"Edad: " +edad() );
        
    }
}