
/**
 * Clase que modela un cuadrado , con nombre y caracteristicas. Extiende de la superclase Rectangulo.
 *  objetos responden al mismo mensaje de diferentes formas. es comportamiento. el mensaje es el mismo.
 *  obj de diferentes tipos puedan responder al mismo mensaje
 *  polimorfismo de metodos. poli dele metodo elpise. cuando hay redefinicion 
 * @author Romero Ingrid Luana
 * @version 01/10/2025
 */
public class Cuadrado extends Rectangulo{
   
    
    public Cuadrado(Punto p_origen, double p_lado){
        super(p_origen, p_lado, p_lado);
        //var local no importa si el nombre de parametros es distinto
    }
    
    public String nombreFigura(){
        return "****** Cuadrado ******";
    }
    
    public void caracteristicas(){
        nombreFigura();
        System.out.println("Origen: " +"(" +super.getOrigen().coordenadas() +")" +"-Alto: " +super.getAlto() +"-Ancho: " +super.getAncho());
        System.out.println("Superficie: " +super.superficie() +"- Perimetro: " +super.perimetro());
    }
}