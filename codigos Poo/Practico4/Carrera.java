
/**
 * Ejecutable muestra datos de una carrera-materia?
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Carrera
{
    public static void main (String [] args){
      Scanner ingreso = new Scanner(System.in);
      Curso unCurso = null;
      int opcion = -1;    
        while(opcion != 0){
          System.out.println("1-Ingresar curso,2-Ingresar alumnos,3-Ingresar calificacion");
          System.out.println("4-Dar de baja alumno, 5-Mostrar promedio del alumno, 6-Mostrar lista de alumnos");
          System.out.println("Ingrese una opcion(0 para salir): \n");
          opcion = Integer.parseInt(ingreso.nextLine());
          switch(opcion){
              case 1:
                  if(unCurso == null){
                  System.out.println("\nIngrese descripcion del curso: ");
                  String descrip = ingreso.nextLine();
                  unCurso = new Curso(descrip);
                }else{
                    System.out.println("Error - curso ya creado");
                }
                  break;
              case 2:
                  if(unCurso != null){
                  System.out.println("\nIngrese LU del alumno: ");
                  int luAlumno = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese nombre del alumno ");
                  String nom = ingreso.nextLine();
                  System.out.println("Ingrese apellido del alumno: ");
                  String ape = ingreso.nextLine();
                  //incribo el alumno instanciando el nuevo alumno
                  unCurso.inscribirAlumno(new Alumno(luAlumno, nom, ape));
                   }else{
                    System.out.println("Primero debe crear un curso");
                  }
                  break;
              case 3:
                 if (unCurso == null) {
                    System.out.println("Primero debe crear un curso.");
                    break;
                }
                 System.out.println("\nIngrese LU del alumno al que desea asignar sus calificaciones: ");
                 int luAlumno = Integer.parseInt(ingreso.nextLine());
                 //creo v.Aux para hacer comprobacion 
                 Alumno alumno = unCurso.buscarAlumno(luAlumno);
                 if( alumno != null){
                 System.out.println("\nIngrese nota1: ");
                 double nota1 = Double.parseDouble(ingreso.nextLine());
                 alumno.setNota1(nota1);
                 System.out.println("\nIngrese nota2: ");
                 double nota2 = Double.parseDouble(ingreso.nextLine());
                 alumno.setNota2(nota2); 
                 System.out.println("Calificaciones asignadas con exito.");
                }else{
                    System.out.println("Error - No se encontro el alumno.");
                }
                 break;
              case 4:
                  if (unCurso == null) {
                    System.out.println("Primero debe crear un curso.");
                    break;
                }
                 System.out.println("\nIngrese LU del alumno que se da de baja: ");
                 int alumQuitar = Integer.parseInt(ingreso.nextLine());
                 
                 Alumno alumEliminado = unCurso.quitarAlumno(alumQuitar);
                if (alumEliminado != null) {
                    System.out.println("Alumno eliminado");
                } else {
                    System.out.println("No se encontró ningún alumno");
                }
                 break;
              case 5:
                  if (unCurso == null) {
                    System.out.println("Primero debe crear un curso.");
                    break;
                }
                 System.out.println("\nIngrese LU del alumno para saber su promedio: ");
                 int promAlum = Integer.parseInt(ingreso.nextLine());
                 System.out.println("****Promedio del alumno****");
                 unCurso.imprimirPromedioDelAlumno(promAlum); 
                 break;
              case 6: 
                if(unCurso != null && unCurso.cantidadDeAlumnos() > 0){
                System.out.println("****-- Cantidad de inscriptos: "+unCurso.cantidadDeAlumnos() +" --****");                
                unCurso.mostrarInscriptos();
            }else{
                System.out.println("No hay alumnos inscriptos");
            }
                break;
            }
      }
        
        
        
        
    }
}