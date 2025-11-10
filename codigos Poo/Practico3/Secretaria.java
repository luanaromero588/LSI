/**
 * Clase ejecutable 
 * 
 * @author Romero Ingrid Luana 
 * @version 1
 */
import java.util.Scanner;
public class Secretaria
{
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in);
        
        //instanciar una escuela
        System.out.println("Ingrese el nombre de la escuela: ");
        String nombreEscuela = ingreso.nextLine();
        System.out.println("Ingrese la dirección de la escuela: ");
        String direccionEscuela = ingreso.nextLine();
        System.out.println("Ingrese el director de la escuela: ");
        String directorEscuela = ingreso.nextLine();
        Escuela unaEscuela = new Escuela(nombreEscuela, direccionEscuela, directorEscuela);
        
        //instanciar un docente
        System.out.println("Ingrese el nombre del docente: ");
        String nombreDocente = ingreso.nextLine();
        System.out.println("Ingrese el grado del docente: ");
        String gradoDocente = ingreso.nextLine();
        System.out.println("Ingrese el monto del sueldo básico del docente: ");
        double sueldoBasico = Double.parseDouble(ingreso.nextLine());
        System.out.println("Ingrese el monto de la asignación familiar del docente: ");
        double asignacionFamiliar = Double.parseDouble(ingreso.nextLine());
        Docente unDocente = new Docente(nombreDocente, gradoDocente, sueldoBasico, asignacionFamiliar);
        
        //emitir el recibo
        unaEscuela.imprimirRecibo(unDocente);
    }
}