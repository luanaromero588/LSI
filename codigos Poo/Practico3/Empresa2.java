/**
 * @author Romero Ingrid Luana
 * @version 1
 */
import java.util.Scanner;
import java.util.Calendar;
public class Empresa2
{
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);

        //Instancio Gerente General (sin jefe)
        System.out.println("Ingreso de datos del gerente: ");
        EmpleadoConJefe gerente = crearEmpleadoConJefe(ingreso, null);
        //Instancio jefe (su jefe es el Gerente)
        System.out.println("\nIngreso de datos del jefe: ");
        EmpleadoConJefe jefe = crearEmpleadoConJefe(ingreso, gerente);
        // Crear Empleado (su jefe es el jefe, no el gerente)
        System.out.println("\nIngreso de datos del empleado: ");
        EmpleadoConJefe empleado = crearEmpleadoConJefe(ingreso, jefe);

        gerente.mostrar();
        
        jefe.mostrar();
        permisoSalida(jefe);

        empleado.mostrar();
        permisoSalida(empleado);
    }
    private static EmpleadoConJefe crearEmpleadoConJefe(Scanner ingreso,EmpleadoConJefe jefe){
    
        System.out.print("Ingrese el CUIL: ");
        long cuilEmpleado = Long.parseLong(ingreso.nextLine());
            
        System.out.print("Ingrese el apellido: ");
        String apellidoEmpleado = ingreso.nextLine();
            
        System.out.print("Ingrese el nombre: ");
        String nombreEmpleado = ingreso.nextLine();
            
        System.out.print("Ingrese el sueldo básico: ");
        double sueldoEmpleado = Double.parseDouble(ingreso.nextLine());
            
        System.out.print("Ingrese el día de ingreso : ");
        int diaIngreso = Integer.parseInt(ingreso.nextLine());
            
        System.out.print("Ingrese el mes de ingreso del empleado (1-12): ");
        int mesIngreso = Integer.parseInt(ingreso.nextLine());
           
        System.out.print("Ingrese el año de ingreso del empleado: ");
        int anioIngreso = Integer.parseInt(ingreso.nextLine());
            
        // Crear instancia de Calendar para la fecha de ingreso
        Calendar fechaIngreso = Calendar.getInstance();
        fechaIngreso.set(anioIngreso, mesIngreso - 1, diaIngreso);
        //creo empleado
        return  new EmpleadoConJefe(cuilEmpleado, apellidoEmpleado, nombreEmpleado, sueldoEmpleado, fechaIngreso, jefe);
        
    }    
    
    private static void permisoSalida(EmpleadoConJefe p_empleado){
        if (p_empleado.esAniversario()){
            System.out.println("+++ PERMISO DE SALIDA +++");
            System.out.println("Empleado: " + p_empleado.nomYApe());
         if (p_empleado.getJefe() != null) {
                System.out.println("Firma del jefe: " + p_empleado.getJefe().nomYApe());
            } else {
                System.out.println("Firma del jefe: Gerente General");
            }
          
        }else {
            System.out.println("Sin permiso de salida para " + p_empleado.nomYApe());
        }
        System.out.println("++++++++++++++++++++++");
    }
    
}
