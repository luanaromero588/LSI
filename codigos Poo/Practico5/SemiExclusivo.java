
/**
 * Subclase SemiExclusivo que extiende de la Superclase Cargo.
 * Un cargo puede ser semiexclusivo
 * 
 * @author Romero Ingrid Luana
 * @version 1. 06/10/2025
 */
public class SemiExclusivo extends Cargo{
    private int horasDeInvestigacion;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombreCargo
    *@param double p_importe
    *@param int p_anio
    *@param int p_horasDocencia
    *@param int p_horasInvestigacion
    */
    public SemiExclusivo(String p_nombreCargo, double p_sueldoBasico, int p_anioIngreso, int p_horasDeDocencia,int p_horas){
        super(p_nombreCargo, p_sueldoBasico,p_anioIngreso , p_horasDeDocencia);
        this.setHorasDeInvestigacion(p_horas);
    }
    
    private void setHorasDeInvestigacion(int p_horas){
        this.horasDeInvestigacion = p_horas;
    }
    public int getHorasDeInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    /**
     * Metodo Publico,muestra por pantalla los datos del cargo
    */
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----" +"\n Horas investigación: " +getHorasDeInvestigacion());
    }
}