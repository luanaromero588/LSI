/**
 * Clase ejecutable que crea figuras
 * @author Romero Ingrid Luana 
 * @version 1
 */
import java.util.Random;
public class CreaFigura
{
    public static void main(String [] args){
        Random numRandom = new Random();
        
        //"10", "0", "0", "20", "5", "5", "15", "25", "40", "30",  "20", "35", "50", "45" cadena que ingrese
        //asigno ese numero ramdon al radio para crear el circulo con el.
        double radio = numRandom.nextDouble() * 100.0;
        //creo el primer circulo
        Circulo primerCirculo = new Circulo(Double.parseDouble(args[0]),
        new Punto(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
        
        //desplazo el centro del circulo 
        primerCirculo.getCentro().desplazar(-240, -230);
        //Muestro las caracteristicas
        primerCirculo.caracteristicas();
        
        //Creo otro circulo
        Circulo segunCirculo = new Circulo(Double.parseDouble(args[3]),
        new Punto(Double.parseDouble(args[4]), Double.parseDouble(args[5])));

        //creo la var mayor para despues imprimir las caracteristicas
        System.out.println("El mayor de los dos circulos es :");
        Circulo mayorCirculo = primerCirculo.elMayor(segunCirculo);
        mayorCirculo.caracteristicas();
        System.out.println("La distancia entre los circulos es: ");
        System.out.println(primerCirculo.distanciaA(segunCirculo));
        
        //rectangulo
        double alto = numRandom.nextDouble() *100.0 ;
        double ancho = numRandom.nextDouble() * 100.0;
        Rectangulo primerRectangulo = new Rectangulo( new Punto(Double.parseDouble(args[6]),
        Double.parseDouble(args[7])),Double.parseDouble(args[8]),Double.parseDouble(args[9]));
        
        primerRectangulo.getOrigen().desplazar(40,-20);
        primerRectangulo.caracteristicas();
        
        //segundo rectangulo
        
        Rectangulo segunRectangulo = new Rectangulo( new Punto(Double.parseDouble(args[10]),
        Double.parseDouble(args[11])),Double.parseDouble(args[12]),Double.parseDouble(args[13]));
        Rectangulo mayorRectangulo = primerRectangulo.elMayor(segunRectangulo);
        System.out.println("El mayor de los dos rectangulos es :");
        mayorRectangulo.caracteristicas();
        System.out.println("La distancia entre el origen de los rectangulos es: ");
        System.out.println(primerRectangulo.distanciaA(segunRectangulo));
    }
}