
/**
 * Crear una clase denominada OrdenVector, que permita ingresar por teclado (Scanner) 4 elementos de tipo
doble, y almacenarlos en un array. Determinar el menor elemento y mostrarlo. Ordenar los elementos del
vector de menor a mayor. Mostrar los elementos ordenados, separados por un tabulador. Usar instrucción
FOR para el ingreso de datos. Utilizar método de la Burbuja.
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana 
 * @version (a version number or a date)
 */
    import java.util.Scanner;
public class OrdenVector
{
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in); 
        ingreso.useDelimiter("\n"); 
        double[] num = new double[4];
        double menor = Double.MAX_VALUE; //mayor numero representable por double
        for(int i=0; i < num.length; i++){
            System.out.println("Ingrese elemento: " +(i+1));
            num[i] = ingreso.nextDouble();
            if(num[i] < menor){
                menor = num[i];
            }
        }
         for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    double temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.println("El menor elemento es: " +menor);
        System.out.println("Las notas ingresadas son:");
        for(int i=0;i < num.length;i++){
            System.out.print(num[i] + "\t");
        }
    }
}