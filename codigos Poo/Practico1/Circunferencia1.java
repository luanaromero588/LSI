
/**
 * Modificar la clase Circunferencia para permitir que el usuario pueda calcular el perímetro de muchas
circunferencias, utilizando la estructura while. Modificar además el ingreso de datos, utilizando la clase
Scanner.

 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana 
 * @version (a version number or a date)
 */
import java.util.Scanner; //importa la clase scanner(lee datos por teclado)

public class Circunferencia1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el radio (0 para salir): ");
        double radio = entrada.nextDouble();

        while (radio > 0) {
            double circun = 2 * 3.14 * radio;
            System.out.println("La circunferencia es: " + circun);
            
            System.out.print("Ingrese el radio (0 para salir): ");
            radio = entrada.nextDouble();
        }

    }
}

