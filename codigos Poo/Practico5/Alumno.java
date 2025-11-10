
/**
 * Esta clase modela a un Alumno con su número de libreta universitaria (LU), nombre, apellido y dos notas que se le cargan.
 * Permite calcular el promedio de notas, saber si aprueba o no  y mostrar todos los datos del alumno.
 * 
 * Esta subclase deriva de la superclase Persona.
 * @author Romero Ingrid Luana
 * @version 2.0 30/09/2025
 */
import java.util.Calendar;
//la clase alumno deriva de la clase persona
public class Alumno extends Persona{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1 = 0;
    private double nota2 = 0;
    
     /**
     * Inicializa los datos personales heredados de Persona junto con el número de LU del alumno.
     * No se inicializan notas en este constructor.
     *
     * @param p_dni            Número de documento de identidad del alumno.
     * @param p_nombre         Nombre del alumno.
     * @param p_apellido       Apellido del alumno.
     * @param p_fechaNacimiento Fecha de nacimiento del alumno (tipo Calendar).
     * @param p_lu             Número de libreta universitaria (LU) del alumno.
     */
    public Alumno(int p_dni , String p_nombre, String p_apellido, Calendar p_fechaNacimiento, int p_lu){
        super(p_dni, p_nombre, p_apellido, p_fechaNacimiento);
        this.setLu(p_lu);
    }
    
     //setters
    public void setLu(int p_lu){
        lu = p_lu;
    }
    public void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    public void setApellido(String p_apellido){
        apellido = p_apellido; 
    }
    public void setNota1(double p_nota1){
        nota1 = p_nota1;
    }
    public void setNota2(double p_nota2){
        nota2 = p_nota2;
    }
    
    //getters
    public int getLu(){
        return lu;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    
    
    /**
     * Determina si el alumno aprueba.Condiciones: promedio mayor a 7 y ambas notas >= 6.
     * @return true si aprueba, false si no.
     */
    private boolean aprueba(){
        return (promedio() > 7.0) && (nota1 >= 6.0) && (nota2 >= 6.0); 
    }
    
    /**
     * Devuelve un texto según el estado del alumno.
     * @return "APROBADO" si cumple condiciones, "DESAPROBADO" en caso contrario
     */
    private String leyendaAprueba(){
        if (aprueba()){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
    
     /**
     * Calcula el promedio de las dos notas.
     * @return promedio de notas
     */
    public double promedio(){
        return (nota1 + nota2) / 2 ;
    }
    
     /**
     * Devuelve el nombre y apellido concatenados.
     * @return cadena con nombre y apellido
     */
    public String nomYApe(){
        return getNombre() +" " +getApellido();  
    }
    
     /**
     * Muestra en pantalla todos los datos del alumno.
     * Imprime primero los datos heredados de Persona (mediante super.mostrar()), 
     * luego los datos específicos de Alumno: nombre y apellido, LU, notas, promedio y estado (aprobado o no).
     */
    public void mostrar(){
       super.mostrar();
       System.out.println("Nombre y Apellido: " +nomYApe());
       System.out.println("LU: " +getLu() +" " +"Notas: " +getNota1() +"-" +getNota2());
       System.out.println("Promedio: " +promedio() +"-" +leyendaAprueba());
    }
}