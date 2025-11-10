
/**
 * Crear una clase denominada OperarVector que permita ingresar por 
 * teclado (Scanner) 5 notas de alumnos, las
que serán almacenadas en un array de enteros. Calcular el promedio y 
determinar la mayor nota. El promedio
debe permitir resultado con decimales (aplicar cast a los elementos
 enteros cuando sea necesario para obtener
dicho resultado). Mostrar los elementos ingresados, separados por un 
tabulador. Mostrar el promedio y la
mayor nota con el mensaje respectivo.
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana
 * @version (a version number or a date)
 */
    import java.util.Scanner; 
public class OperarVector
{
    public static void main(String [] args){
        Scanner ingreso = new Scanner (System.in);
        ingreso.useDelimiter("\n"); //salto de linea
        int[] notas = new int[5];  //crea el array y le asigna espacio en mem[5]
        int  sumaNotas=0, notaMayor = 0;
        double prom;
        
        for(int i=0;i<5;i++){ 
            System.out.println("Ingrese nota:" +(i+1)); 
            notas[i] = ingreso.nextInt();//asignacion de los datos que ingreso por teclado
            sumaNotas += notas[i]; 
            if(notas[i] > notaMayor){
                notaMayor = notas[i];
            }
        }
        
        System.out.println("Las notas ingresadas son:");
        for(int i=0;i < notas.length;i++){
            System.out.print(notas[i] + "\t");
        }
        System.out.println(); //lo uso como salto de linea
        prom = (double) sumaNotas / notas.length ; //uso del cast
        System.out.println("El promedio es: " +prom);
        System.out.println("La nota mayor es: " +notaMayor);
             
    }
}