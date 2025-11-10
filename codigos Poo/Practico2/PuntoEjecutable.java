
/**
 *  Clase ejecutable que permite probar la clase Punto. Solicita al usuario los valores de la abscisa X y la ordenada Y,
 *  crea un objeto Punto con esos valores, muestra su posición,lo desplaza y luego muestra sus coordenadas actualizadas.
 * 
 * @author Romero Ingrid Luana
 * @version 1.0- 2025-08-20
 */ 
import java.util.Scanner;
public class PuntoEjecutable
{
    
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in);
        
        // Pedir datos al usuario
        System.out.print("Ingrese valor de la abscisa X: ");
        double x = ingreso.nextDouble();
        ingreso.nextLine(); 

        System.out.print("Ingrese valor de la ordenada Y: ");
        double y = ingreso.nextDouble();
        
        //Crear objeto punto
        Punto punto1 = new Punto(x,y);
        
        //mostrar coordenadas iniciales
        punto1.mostrar();
        
        //desplazar punto
        punto1.desplazar(4,2);
        //Mostrar coordenadas actualizadas
        System.out.println("Coordenadas: " +punto1.coordenadas());
        
        
        
        
    }
}