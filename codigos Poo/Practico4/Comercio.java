/**
 * Modela un Comercio que gestiona una colección de empleados.
 * Utiliza un HashMap para un acceso eficiente a los empleados mediante su CUIL.
 * 
 * @author Romero Ingrid Luana
 * @version 1.0
 */
import java.util.HashMap;
public class Comercio
{
   private String nombre;
   private HashMap <Long, Empleado> empleados;
   
   /**
   * Constructor para una colección de empleados vacia.(0..*)
   * @param p_nombre Nombre del Comercio de tipo String.
   */
   public Comercio(String p_nombre){
       this.setNombre(p_nombre);
       this.setEmpleados(new HashMap <Long,Empleado> ());
   }
   
   /**
   * Constructor para una colección de empleados.
   * @param p_nombre   Nombre del Comercio de tipo String.
   * @param p_empleado Colección de empleados de tipo
   *                   HashMap<Long, Empleado>.
   */
   public Comercio(String p_nombre, HashMap p_empleados){
       this.setNombre(p_nombre);
       this.setEmpleados(p_empleados);
   }
   
   //setters y getters
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
   public String getNombre(){
       return this.nombre;
   }
   private void setEmpleados(HashMap <Long,Empleado> p_empleados){
       this.empleados = p_empleados;
   }
   public HashMap <Long,Empleado> getEmpleados(){
       return this.empleados;
   }
   
   public void altaEmpleado(Empleado p_empleado){
       this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
   }
   
   public Empleado bajaEmpleado(long p_cuil){
       return this.getEmpleados().remove(p_cuil);
   }
   
   public int cantidadDeEmpleados(){
       return this.getEmpleados().size();
   }
   
   public boolean esEmpleado(long p_cuil){
       return this.getEmpleados().containsKey(p_cuil);
   }
   
   public Empleado buscarEmpleado(long p_cuil){
       return this.getEmpleados().get(p_cuil);
   }
   
   public void sueldoNeto(long p_cuil){
       Empleado emple = this.buscarEmpleado(p_cuil);
       if(emple != null){
          System.out.println("Sueldo neto de " +emple.nomYApe() +"\t $" +emple.sueldoNeto());
        }else{
            System.out.println("No se ecncontro empleado con cuil " +p_cuil);
        }
   }
   public void nomina(){
    if(this.cantidadDeEmpleados() == 0){
          System.out.println("No hay empleado por mostrar");
    }else{
        System.out.printf("***** Nomina de empleados de %s *****\n", this.getNombre());
        for(Empleado emple: this.getEmpleados().values()){
           System.out.println(emple.mostrarLinea());  
        }
    }
   }
   
   
}