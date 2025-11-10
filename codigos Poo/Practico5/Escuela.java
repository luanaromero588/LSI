
/**
 * 
 * @author Romero Ingrid Luana 
 * @version 1- 30/09/2025
 */
import java.util.Scanner;
import java.util.Calendar;
public class Escuela
{
    public static void main(String [] args){
      Scanner ingreso = new Scanner(System.in);
      //declaro unaPersona y unALumno fuera del while para poder usarlo en case 3 y case4
      Persona unaPersona = null;
      Alumno unAlumno = null;
      int opcion = -1;
      
      while(opcion != 0){
          System.out.println("1-Ingresar persona,\n 2-Ingresar alumno,\n 3-Mostrar personas, \n 4-Mostrar alumnos");
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
                 System.out.println("\n****Ingreso de datos del alumno**** ");
                  System.out.println("\nIngrese lu: ");
                  int luAlumno = Integer.parseInt(ingreso.nextLine());
                  System.out.println("\nIngrese dni: ");
                  int dniAlumno = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese nombre: ");
                  String nomAlumno = ingreso.nextLine();
                  System.out.println("Ingrese apellido: ");
                  String apeAlumno = ingreso.nextLine();
                  
                  System.out.println("Ingrese dia de nacimiento: ");
                  int diaAlumno = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese mes de nacimiento: ");
                  int mesAlumno = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese año de nacimiento: ");
                  int añoAlumno = Integer.parseInt(ingreso.nextLine());
                  Calendar fechaAlumno = Calendar.getInstance();
                  fechaAlumno.set(añoAlumno,  mesAlumno - 1, diaAlumno);
                   unAlumno= new Alumno(dniAlumno, nomAlumno, apeAlumno, fechaAlumno, luAlumno);
                   System.out.println("Alumno añadido con exito");
                    break;
              case 3:
                  if(unaPersona != null){
                     unaPersona.mostrar();
                    }else{
                        System.out.println("No hay persona por mostrar");
                    }
              break;
              case 4:
                  if(unAlumno != null){
                     unAlumno.mostrar();
                }else{
                    System.out.println("No hay alumno por mostrar");
                }
              break;
          }
      }
            
    }
}