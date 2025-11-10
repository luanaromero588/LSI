
/**
 * Implementación de la clase ejecutable GestionStock.
 * @author  Romero Ingrid Luana
 * @version 1
 */
public class GestionStock
{
    public static void main(String [] args){
    Laboratorio unLaboratorio = new Laboratorio("Colgate S.A."," Scalabrini Ortiz 5524"," 54-11 -4239-8447");
    Producto unProducto = new Producto(001,"Perfumeria","Jabon Deluxe",5.25,unLaboratorio);
    //se le asigna un stock de 500
    unProducto.ajuste(500);
    //se muestre por pantalla sus datos,
    System.out.println("********************");
    unProducto.mostrar();
    
    //simulo una baja de 200 productos al stock actual
    unProducto.ajuste(-200);
    System.out.println("********************");
    unProducto.mostrar();
    
    //precio de lista y de contado
    System.out.println("Precio de lista: " +unProducto.precioLista()); 
    System.out.println("Precio de contado: "+unProducto.precioContado());
}
}