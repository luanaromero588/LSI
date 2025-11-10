
/**
 * Clase ejecutable que permite probar la clase Alumno. 
 * Crea un objeto alumno, se cargan datos básicos del alumno (LU, nombre, apellido y dos notas)
 * se muestran sus datos, se utilizan setters para modificar las notas y se muestra nuevamente los datos del alumno, esta vez actualizado.
 * @author Romero Ingrid Luana
 * @author Ortellado Luciana
 * @version 1.0 20-08-2025
 */
public class AlumnoEjecutable
{
    public static void main(String [] args){
        //instancio objeto alumno
        Alumno alumno1 = new Alumno(
        Integer.parseInt(args [0]), 
        args[1],
        args[2]
       );
       //muestro la informacion del alumno
       alumno1.mostrar();
       
       //prueba de setters de notas
       alumno1.setNota1(3.5);
       alumno1.setNota2(4);
       //muestro nuevamente alumno con dato de notas actualizado
       alumno1.mostrar();       
    }
}