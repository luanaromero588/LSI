
/**
 * Clase ejecutable que prueba la clase Empleado.
 * Crea un objeto Empleado, muestra sus datos, calcula antigüedad, sueldo neto,
 * y permite modificar datos usando setters.
 * Utiliza Scanner para leer datos ingresados por el usuario
 * @author Romero Ingrid Luana 
 * @version 1.0 - 2025-08-20
 */
import java.util.Scanner;
public class EmpleadoEjecutable
{
 /**
     * Método principal que ejecuta la aplicación.
     * Solicita datos del usuario para crear un objeto Empleado, muestra su información inicial,
     * permite modificar atributos mediante setters y muestra los valores actualizados.
     */
 public static void main(String [] args){
     Scanner ingreso = new Scanner(System.in);
     
     // Pedir datos al usuario
        System.out.print("Ingrese Cuil: ");
        long cuil = ingreso.nextInt();
        ingreso.nextLine(); 

        System.out.print("Ingrese Apellido: ");
        String apellido = ingreso.nextLine();

        System.out.print("Ingrese Nombre: ");
        String nombre = ingreso.nextLine();

        System.out.print("Ingrese sueldo basico: ");
        double sueldoBasico = ingreso.nextDouble();
        
        System.out.println("Ingrese año de ingreso: ");
        int anioIngreso = ingreso.nextInt();
     // Crear objeto Empleado
         Empleado empleado1 = new Empleado(cuil, apellido, nombre , sueldoBasico, anioIngreso);
     // Mostrar información inicial del empleado
         empleado1.mostrar();
         System.out.println(empleado1.mostrarLinea());
     // Modificar año de ingreso y mostrar información actualizada
         empleado1.setAnioIngreso(2017);    
         System.out.println("Año de ingreso modificado: "+empleado1.getAnioIngreso());
         System.out.println("Antiguedad actualizada: " +empleado1.antiguedad());
         System.out.println("Sueldo neto actualizada: " +empleado1.sueldoNeto());
         System.out.println("Mostrar linea actualizada: " +empleado1.mostrarLinea());
     
 }
}