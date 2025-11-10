
/**
 * Subclase Exclusivo que extiende de la superclase Cargo.
 * Un cargo puede ser Exclusivo.
 * 
 * @author Romero Ingrid Luana
 * @version 1. 06/10/2025
 */
public class Exclusivo extends Cargo{
    private int horasDeInvestigacion;
    private int horasDeExtension;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombreCargo
    *@param double p_importe
    *@param int p_anio
    *@param int p_horasDocencia
    *@param int p_horasInvestigacion
    *@param int p_horasExtension
    */
    public Exclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia,int p_horasDeInvestigacion,int p_horasDeExtension){
        super(p_nombreCargo, p_sueldoBasico,p_anioIngreso , p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horasDeInvestigacion);
        this.setHorasDeExtension(p_horasDeExtension);
    }
    
    private void setHorasDeInvestigacion(int p_horasDeInvestigacion){
        this.horasDeInvestigacion = p_horasDeInvestigacion;
    }
    private void setHorasDeExtension(int p_horasDeExtension){
        this.horasDeExtension = p_horasDeExtension;
    }
    
    /**
    *Permite obtener el valor de el atributo horasDeInvestigacion
    *@return devuelve un int
    */
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
     /**
    *Permite obtener el valor de el atributo horasDeExtension
    *@return devuelve un int
    */
    public int getHorasDeExtension(){
        return this.horasDeExtension;
    }
    /**
     * Muestra por pantalla los datos del cargo Exclusivo
    */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----" +"\n Horas investigación: " +getHorasDeInvestigacion() +"\n Horas extension: " +getHorasDeExtension());


    }
}