
/**
 * Crear clase ejecutable “Triangulo”, declarar las variables a, b y c de 
 * tipo double, que corresponden a los lados
de un triángulo. Los valores deben ser ingresados por teclado como argumentos
 del método main(). Calcular y
mostrar el semiperímetro y el área del triángulo.
 semiperimetro= (a+b+c)/2
 area= raíz cuadrada(semiperimetro*(semiperimetro-a)
 *(semiperimetro-b)*(semiperimetro-c))
Nota: probar con a=2, b=2.7, c=3.5
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana 
 * @version (a version number or a date)
 */
public class Triangulo
{
    public static void main(String [] args){
        double a = Double.valueOf(args [0]);
        double b = Double.valueOf(args [1]);
        double c = Double.valueOf(args [2]);
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-a)
                     *(semiperimetro-b)*(semiperimetro-c));
         System.out.println("Semiperimetro: "+semiperimetro);
         System.out.println("Area: "+area);
         
    }
}