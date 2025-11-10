
/**
 * Clase Cargo tp5
 * @author Romero Ingrid Luana
 * @version 1. 06/10/2025
 */
import java.util.Calendar;
public class Cargo
{
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;
    
    /** 
    * Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombreCargo
    *@param double p_importe
    *@param int p_anio
    *@param int p_horas
    */
    public Cargo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDeDocencia(p_horasDeDocencia);
    }
    
    private void setNombreCargo(String p_nombreCargo){
        this.nombreCargo = p_nombreCargo;
    }
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    private void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    private void setHorasDeDocencia(int p_horasDeDocencia){
        this.horasDeDocencia = p_horasDeDocencia;
    }
    
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    public int getHorasDeDocencia(){
        return this.horasDeDocencia;
    }
    
    /**
    *Metodo publico, calcula la antiguedad
    *@return devuelve un int
    */
    public int antiguedad(){
     Calendar anioHoy = Calendar.getInstance();
     return (anioHoy.get(Calendar.YEAR) - this.anioIngreso);
     
    }
    /**
    *Metodo publico, calcula el adicional con respecto a la antiguedad
    *@return devuelve un double
    */
    private double adicionalXAntiguedad(){
        return (this.getSueldoBasico() * 0.01) * this.antiguedad();
    }
    /**
    *Metodo publico, calcula el sueldo del cargo
    *@return devuelve un double
    */
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }
    /**
    *Metodo publico, muestrar por pantalla las caracteristicas del cargo
    */
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() +"- Sueldo Basico: " +getSueldoBasico() +"- Sueldo Cargo: " +sueldoDelCargo() +"- Antiguedad: " +antiguedad() +" años");
        System.out.println("Horas Docencia: " +getHorasDeDocencia());
    }
    
}