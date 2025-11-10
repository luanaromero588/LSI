
/**
 * Crear una clase ejecutable denominada “Circunferencia”, en la que se calcule 
 * el perímetro de una circunferencia, ingresando el radio de tipo entero
 * a través del argumento del main()
 * 
 * Modificar la clase Circunferencia para permitir que el usuario pueda calcular el perímetro de muchas
circunferencias, utilizando la estructura while. Modificar además el ingreso de datos, utilizando la clase
Scanner.
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana
 * @version (a version number or a date)
 */
public class Circunferencia
{
    public static void main(String [] args){
        int radio = Integer.valueOf(args [0]);
        double circun = 2*3.14*radio;
        System.out.println("La circunferencia es:" +circun);
        //System.out.println("La circunferencia es:" + 2*3.14*radio);
        
    }
}