/**
 * Superclase que modela cabaña
 * 
 * @author Romero Ingrid Luana
 * @version 1 11/10/2025
 */
import java.util.ArrayList;
public class Cabaña extends Alojamiento
{
    private int nroHabitaciones;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param double p_precioBase
    *@param int p_diasAlquiler
    *@param int p_nroHabitaciones
    */
    public Cabaña(int p_nroHabitaciones, String p_nombre, double p_precioBase, int p_diasAlquiler){
        super( p_nombre,p_precioBase,p_diasAlquiler);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param double p_precioBase
    *@param int p_diasAlquiler
    *@param ArrayList<Cargo> p_servicos
    *@param int p_nroHabitaciones
    */
    public Cabaña(int p_nroHabitaciones, String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_listaServicios){
        super( p_nombre,p_precioBase,p_diasAlquiler, p_listaServicios);
        this.setNroHabitaciones(p_nroHabitaciones);
    }
    
     private void setNroHabitaciones(int p_nroHabitaciones){
        this.nroHabitaciones = p_nroHabitaciones;
    }
    public int getNroHabitaciones(){
        return this.nroHabitaciones;
    }
    
    /**
     * Metodo publico,calcula el costo del alquiler(costo del dia + costo por la cant de habitaciones)
     */
    public double costo(){
        return super.costo() +  (super.getDiasAlquiler() * this.getNroHabitaciones() * 30.0); 
    }
    
     /**
     * Metodo publico,cuenta la cantidad de cabañas
    */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Cabaña")){
            return 1;
        }else{
            return 0;
        }
    }
     /**
     * Metodo publico, muestra por pantalla los datos del alquiler
     */
    public void liquidar(){
        super.liquidar();
        System.out.printf("Cabaña con %d habitaciones \n Total: ------> $ %.2f \n",  this.getNroHabitaciones(), this.costo() + costoServicios());
         
    }
    
}