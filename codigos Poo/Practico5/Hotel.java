/**
 * Superclase que modela Hotel
 * 
 * @author Romero Ingrid Luana
 * @version 1 11/10/2025
 */
import java.util.ArrayList;
public class Hotel extends Alojamiento
{
    private String tipoHabitaciones;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param double p_precioBase
    *@param int p_diasAlquiler
    *@param int p_tipoHabitaciones
    */
    public Hotel(String p_tipoHabitaciones, String p_nombre, double p_precioBase, int p_diasAlquiler){
        super( p_nombre,p_precioBase,p_diasAlquiler);
        this.setTipoHabitaciones(p_tipoHabitaciones);
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_nombre
    *@param double p_precioBase
    *@param int p_diasAlquiler
    *@param ArrayList<Cargo> p_servicos
    *@param int p_tipoHabitaciones
    */
    public Hotel(String p_tipoHabitaciones, String p_nombre, double p_precioBase, int p_diasAlquiler, ArrayList<Servicio> p_listaServicios){
        super( p_nombre,p_precioBase,p_diasAlquiler, p_listaServicios);
        this.setTipoHabitaciones(p_tipoHabitaciones);
    }
    
     private void setTipoHabitaciones(String p_tipoHabitaciones){
        this.tipoHabitaciones = p_tipoHabitaciones;
    }
    public String getTipoHabitaciones(){
        return this.tipoHabitaciones;
    }
    
    /**
     * Metodo publico,calcula el costo del alquiler(costo del dia + costo por la cant de habitaciones)
     */
    public double costo(){
        if(this.getTipoHabitaciones().equalsIgnoreCase("Single")){
           return (super.costo() +  (super.getDiasAlquiler()  * 20.0)); 
        }else{
           return (super.costo() +  (super.getDiasAlquiler() * 35.0));
        }
         
    }
    
     /**
     * Metodo publico,cuenta la cantidad de Hoteles
    */
    public int contar(String p_alojamiento){
        if(p_alojamiento.equalsIgnoreCase("Hotel")){
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
        System.out.printf("Habitacion %s " , this.getTipoHabitaciones() +"\n Total: ------> $ %.2f", (this.costo() + costoServicios()));
         
    }
    
}