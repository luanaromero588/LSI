
/**
 * Clase ejecutable que simula realizar pedidos, agregar-quitar elementos de la lista, etc.
 * @author Romero Ingrid Luana 
 * @version 1- 15/09/2025
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Iterator;
public class TomaPedido
{
    public static void main(String [] args){
      Scanner ingreso = new Scanner(System.in);
      
      Laboratorio unLab = new Laboratorio("Colgate S.A."," Scalabrini Ortiz 5524"," 54-11 -4239-8447");
      Producto unProducto = new Producto(123,"Perfumeria","Jabon Deluxe",5.25,  unLab);
      Cliente unCliente = new Cliente(11223345,"Perez","Juan",10000.00);
      Calendar fecha =  Calendar.getInstance();
      //instancio un pedido segun consigna
      Pedido unPedido =  new Pedido(fecha, unCliente, unProducto);
      int opcion = -1;
      
      while(opcion != 0){
          System.out.println("1-Ingresar producto,2-Quitar producto,3-Mostrar lista de productos, 4-Mostrar datos cliente");
          System.out.println("Ingrese una opcion(0 para salir): \n");
          opcion = Integer.parseInt(ingreso.nextLine());
          switch(opcion){
              case 1:
                  System.out.println("\nIngrese codigo de producto: ");
                  int codProduc = Integer.parseInt(ingreso.nextLine());
                  System.out.println("Ingrese rubro de producto: ");
                  String rubro = ingreso.nextLine();
                  System.out.println("Ingrese descripcion de producto: ");
                  String descrip = ingreso.nextLine();
                  System.out.println("Ingrese costo de producto: ");
                  double costo = Double.parseDouble(ingreso.nextLine());
                  unPedido.agregarProducto(new Producto(codProduc, rubro, descrip, costo, unLab));
                   System.out.println("Producto agregado con exito");
              break;
              case 2:
                  System.out.println("\n*****Lista de productos disponibles para quitar*****");
                  unPedido.mostrar();
                  if( unPedido.getListaProductos().size() > 1){
                    unPedido.quitarProducto(buscarProducto(unPedido, ingreso));
                    System.out.println("Producto eliminado \n");
                    }else{
                        System.out.println("No se puede eliminar producto\n");
                    }
                   break;
              case 3:
                 unPedido.mostrar();
              break;
              case 4:
                  unCliente.mostrar();
              break;
          }
      }
            
    }
    public static Producto buscarProducto(Pedido p_pedido, Scanner p_ingreso) {
        System.out.print("Ingrese producto a eliminar: \n");
        int i=0;
        for (Producto produc : p_pedido.getListaProductos()) {
            System.out.println(i +"-" +produc.getDescripcion());
            i++;
        }
        int opcion = Integer.parseInt(p_ingreso.nextLine()); 
        return p_pedido.getListaProductos().get(opcion);
   }
}