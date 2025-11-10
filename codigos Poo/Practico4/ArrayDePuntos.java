
/**
 * Clase ejecutable ArrayDePuntos.
 * 
 * @author Romero Ingrid Luana, Ortellado Luciana 
 * @version 1
 */
import java.util.Scanner;
public class ArrayDePuntos{
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in);
        // declaro e inicializo un arreglo de 6 referencias de tipo Punto.
        Punto puntos[] = new Punto[6];
        //cargo los datos
        for(int i = 0; i < puntos.length; i++){
            System.out.println("Ingrese datos de coordenada x del punto" +(i+1) +": ");
            int x = Integer.parseInt(ingreso.nextLine());
    
            System.out.println("Ingrese datos de coordenada y del punto" +(i+1) +": ");
            int y = Integer.parseInt(ingreso.nextLine());
    
            //con lo que ingreso creo objetos de puntos
            puntos[i] = new Punto(x, y);
        }
        //creo el for para mostrar los datos
        System.out.println("Con for");
        for(int i = 0; i < puntos.length; i++){
            puntos[i].mostrar();
        }
        System.out.println("Con foreach");
        for(Punto obj : puntos){
            obj.mostrar();
        }
        //pongo -1 en puntos.length para que no se vaya de rango en [i+1]
        for( int i = 0; i < puntos.length -1; i++){
            System.out.println("Distancia entre el punto "+ (i+1)  +" y el punto " + (i+2) +" "
            +puntos[i].distanciaA(puntos[i+1]));
        }
      
        //para usar lenght la var debe estar declarada e inicializada
 }
}
    
