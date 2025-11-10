
/**
 * Crear la clase ejecutable “Operador”, que contenga el método main(). En él declarar las variables a y b de tipo
entero. Inicializarlas con los valores 8 y 3 respectivamente. Realizar y mostrar por pantalla las siguientes
operaciones aritméticas: suma, resta, multiplicación, división y resto.
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana
 * @version (a version number or a date)
 */
public class Operador
{
    public static void main (String [] args){ 
        int a = 8;
        int b = 3;
        
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int resto = a % b; //modulo
        
        //System.out.println("Suma:" +(a+b)); //mas simple
        System.out.println("Suma:"  +suma + "Resta:" +resta + "Multiplicacion:"
        +multiplicacion + "Division:" +division +"Resto:" +resto);
        //al "imprimir" de esta menera, los datos estan uno al lado del otro sin separacion
        
    }
}