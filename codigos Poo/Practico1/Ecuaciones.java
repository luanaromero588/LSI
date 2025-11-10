
/**
 * Crear una clase denominada “Ecuación” que calcule las raíces reales 
 * de una ecuación de segundo grado. Los
valores de los coeficientes a, b y c se ingresarán por teclado como 
argumentos del método main(). Considerar
que si el discriminante > 0 se deben calcular las 2 raíces, 
si el discriminante = 0 se debe calcular una sola raíz,
especificando por pantalla que x1 = x2. En caso de ser negativo,
 mostrar un mensaje indicando que se
encuentra frente a una solución compleja (numero imaginario).
Nota: probar con a= -1; b=500; c=-62500;
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana
 * @version (a version number or a date)
 */
public class Ecuaciones
{
    public static void main(String [] args){
        double a = Double.valueOf(args [0]);
        double b = Double.valueOf(args [1]);
        double c = Double.valueOf(args [2]);
        double discri= Math.pow(b,2) - 4 * a * c ;
        if(discri > 0){
            double X1 = (-b - Math.sqrt (discri)) / (2*a);
            double X2 = (-b + Math.sqrt (discri)) / (2*a);
            System.out.println("X1:" +X1 +"   " +"X2" +X2 );
        }else if(discri == 0){
            //double X = -b / (2*a);
            System.out.println("X1=X2");
        }else{
             System.out.println("solución compleja (numero imaginario)");
        }
        
    

    }
}