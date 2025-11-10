
/**
 * 
 * @author Romero Ingrid Luana 
 * @version 1- 30/09/2025
 */
import java.util.Scanner;
import java.util.Calendar;
public class Empresa{
    public static void main(String [] args){
      Scanner ingreso = new Scanner(System.in);
      //declaro unaPersona y unempleado fuera del while para poder usarlo en case 3 y case4
      Persona unaPersona = null;
      Empleado  unEmpleado = null;
      int opcion = -1;
      
      while(opcion != 0){
          System.out.println(" 1-Ingresar persona \n2-Ingresar empleado \n3-Mostrar personas \n 4-Mostrar empleados");
          System.out.println("Ingrese una opcion(0 para salir): \n");
          opcion = Integer.parseInt(ingreso.nextLine());
          switch(opcion){
              case 1:
                  System.out.println("\n****Ingreso de datos de la persona**** ");
                  System.out.println("\nIngrese dni: ");
                  int dniPersona = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese nombre: ");
                  String nomPersona = ingreso.nextLine();
                  System.out.println("Ingrese apellido: ");
                  String apePersona = ingreso.nextLine();
                  
                  System.out.println("Ingrese dia de nacimiento: ");
                  int diaPersona = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese mes de nacimiento: ");
                  int mesPersona = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese año de nacimiento: ");
                  int añoPersona = Integer.parseInt(ingreso.nextLine());
                  Calendar fechaPersona = Calendar.getInstance();
                  fechaPersona.set(añoPersona, mesPersona - 1, diaPersona);
                   unaPersona = new Persona(dniPersona, nomPersona, apePersona, fechaPersona);
                   System.out.println("Persna añadida con exito");
              break;
              case 2:
                 System.out.println("\n****Ingreso de datos del empleado**** ");
                  System.out.println("\nIngrese cuil: ");
                  int cuilEmpleado = Integer.parseInt(ingreso.nextLine());
                  System.out.println("\nIngrese dni: ");
                  int dniEmpleado = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese nombre: ");
                  String nomEmpleado = ingreso.nextLine();
                  System.out.println("Ingrese apellido: ");
                  String apeEmpleado = ingreso.nextLine();
                  
                  System.out.println("Ingrese dia de nacimiento: ");
                  int diaEmpleado = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese mes de nacimiento: ");
                  int mesEmpleado = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese año de nacimiento: ");
                  int añoEmpleado = Integer.parseInt(ingreso.nextLine());
                  Calendar fechaEmpleado = Calendar.getInstance();
                  fechaEmpleado.set(añoEmpleado,  mesEmpleado - 1, diaEmpleado);
                  
                  System.out.println("Ingrese dia de ingreso: ");
                  int diaIngresoEmpleado = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese mes ingreso: ");
                  int mesIngresoEmpleado = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese año de ingreso: ");
                  int añoIngresoEmpleado = Integer.parseInt(ingreso.nextLine());
                  Calendar fechaIngresoEmpleado = Calendar.getInstance();
                  fechaIngresoEmpleado.set(añoIngresoEmpleado,  mesIngresoEmpleado - 1, diaIngresoEmpleado);
                  
                  System.out.println("Ingrese sueldo basico: ");
                  double sueldoBasicoEmpleado = Double.parseDouble(ingreso.nextLine());
                  
                   unEmpleado= new Empleado(cuilEmpleado, apeEmpleado, nomEmpleado, sueldoBasicoEmpleado, fechaIngresoEmpleado, fechaEmpleado,dniEmpleado );
                   System.out.println("Empleado añadido con exito");
                    break;
              case 3:
                  if(unaPersona != null){
                     unaPersona.mostrar();
                    }else{
                        System.out.println("No hay persona por mostrar");
                    }
              break;
              case 4:
                  if(unEmpleado != null){
                     unEmpleado.mostrar();
                }else{
                    System.out.println("No hay empleado por mostrar");
                }
              break;
          }
      }
            
    }
}