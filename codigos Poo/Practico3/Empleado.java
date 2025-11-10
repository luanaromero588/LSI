
/**
 * Esta clase modela un empleado, con atributos y métodos relacionados a sus datos personales y a su situación laboral. 
 * Permite calcular antigüedad, sueldo neto y mostrar información del empleado.
 * 
 * @author Romero Ingrid Luana
 * @version 1.0 - 2026-08-20
 */
import java.util.*;
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    
    /**
     * Constructor que instancia un objeto de tipo Empleado con todos sus datos.
     * 
     * @param p_cuil      cuil del empleado
     * @param p_apellido  Apellido del empleado
     * @param p_nombre    Nombre del empleado
     * @param p_importe   Sueldo básico del empleado
     * @param p_anio      Año de ingreso del empleado
     */
    public Empleado(long p_cuil,String p_apellido, String p_nombre, double p_importe,
                       int p_anio){
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_anio);
    
    }
    public Empleado(long p_cuil,String p_apellido, String p_nombre, double p_importe, Calendar p_fechaIngreso){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fechaIngreso);
    
    }
    //setters
    public void setCuil(long p_cuil){
        cuil = p_cuil;
    }
     public void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    public void setApellido(String p_apellido){
        apellido = p_apellido; 
    }
    public void setSueldoBasico(double p_importe){
        sueldoBasico = p_importe;
    }
    public void setAnioIngreso(int p_anio){
        Calendar fechaIngreso = Calendar.getInstance();
        fechaIngreso.set(p_anio, 1 , 1);
        this.fechaIngreso = fechaIngreso;
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    //getters
    public long getCuil(){
        return cuil; 
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public double getSueldoBasico(){
        return sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    /**
     * Calcula la antigüedad del empleado en años.
     * 
     * @return Antigüedad en años
     */
    public int antiguedad(){
        Calendar fechaHoy = Calendar.getInstance();
        int añoHoy = fechaHoy.get(Calendar.YEAR);
        int añoIngreso = this.getFechaIngreso().get(Calendar.YEAR);
        return  añoHoy - añoIngreso;  
    }
    
    /**
     * Calcula el descuento aplicado al sueldo.
     * 
     * @return Valor del descuento
     */
    private double descuento(){
        return (sueldoBasico * 0.02) + 1500.0 ; 
    }
    
    /**
     * Calcula el adicional al sueldo según antigüedad.
     * 
     * @return Valor del adicional
     */
    private double adicional(){
        if(antiguedad() < 2){
            return sueldoBasico * 0.02;
        }else if(antiguedad() >= 2 && antiguedad() < 10){
            return sueldoBasico * 0.04;
        }else{
            return sueldoBasico * 0.06;
        }
    }
    
    /**
     * Calcula el sueldo neto del empleado.
     * 
     * @return Sueldo neto (sueldo básico + adicional - descuento)
     */
    public double sueldoNeto(){
        return (getSueldoBasico() + adicional()) - descuento() ;
    }
    
    /**
     * Devuelve el nombre y apellido del empleado.
     * 
     * @return Nombre completo
     */
    public String nomYApe(){
        return getNombre() +" " +getApellido();  
    }
    
    /** 
    * Muestra los datos del cliente
    */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " +nomYApe());
        System.out.println("CUIL: " +getCuil() +" " +"Antiguedad: " +antiguedad()
                           +" " +"años de servicio");
        System.out.println("Sueldo Neto:$ " +sueldoNeto() +"\n");
    }
    
    /**
     * Devuelve los datos del empleado en una sola línea.
     * 
     * @return Información resumida del empleado
     */
    public String mostrarLinea(){
        return +getCuil() +"   " +nomYApe() +"......." +"$" +sueldoNeto() +"\n" ;
    }
    
    public boolean esAniversario(){
        Calendar fechaHoy = Calendar.getInstance();
        
        int diaHoy = fechaHoy.get(Calendar.DATE);
        int mesHoy = fechaHoy.get(Calendar.MONTH) + 1;
        int diaIngreso = this.getFechaIngreso().get(Calendar.DATE);
        int mesIngreso = this.getFechaIngreso().get(Calendar.MONTH);
        
        return (diaHoy == diaIngreso) && (mesHoy == mesIngreso);
    }
    
}