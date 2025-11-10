
/**
 * 2. Crear la clase “Multiplo”, que contenga el método main(), 
 * en el que se determinen y muestren por pantalla los
números múltiplos de 4 a partir de 42 y hasta el 150 inclusive.
 Usar la instrucción iterativa más apropiada.
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana
 * @version (a version number or a date)
 */
public class Multiplo
{
    public static void main(String [] args){ 
        for(int i=0; i <= 150; i++){    //se puede usar if dentro de for?
            if(i % 4 == 0){ //si el mod de 4 da 0 es que son multiplos.
                System.out.println( "Multiplos de 4:" +i);    
            }
        }
    }
}