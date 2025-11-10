
/**
 * Crear una clase denominada TrianguloRectangulo, en la que se determine
 * si un triangulo es rectángulo(Teorema de Pitágoras → h^2 = cateto1^2 + cateto2^2).
 * Los lados se deben ingresar por teclado, utilizando el argumento del main().
 * Nota: probar con hipotenusa = 5; cateto1 = 3; cateto2 = 4;
 * 
 * @autor Romero Ingrid Luana 
 * @Ortellado Luciana 
 * @version (a version number or a date)
 */
public class TrianguloRectangulo
{
   public static void main(String [] args){
       double hipo = Double.valueOf(args [0]); //traigo el valor como string y lo convierto en double.
       double cateto1 = Double.valueOf(args [1]);
       double cateto2 = Double.valueOf(args [2]);
        
        hipo = Math.pow(hipo, 2); //reasigno valor
        cateto1 = Math.pow(cateto1, 2);
        cateto2 = Math.pow(cateto2, 2);
       
        if(hipo == cateto1 + cateto2){
           System.out.println("Si es un triangulo Rectangulo");
       }else{
           System.out.println("No es un triangulo Rectangulo");
       }
        
       /*if(Math.pow(hipo, 2) == Math.pow(cateto1, 2) + Math.pow(cateto2, 2)){
           System.out.println("Si es un triangulo Rectangulo");
       }else{
           System.out.println("No es un triangulo Rectangulo");
       }*/
   }
}