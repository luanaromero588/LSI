/**
 * La clase Pedido representa una orden de compra realizada por un cliente en una fecha determinada. 
 * Permite registrar uno o varios productos asociados al pedido, calcular el total a pagar 
 * tanto al contado como financiado, así como agregar, quitar y mostrar los productos incluidos.
 * 
 * @author Romero Ingrid Luana 
 * @version 1
 */
import java.util.Calendar;
import java.util.ArrayList;
public class Pedido
{
   private Calendar fecha; 
   private Cliente cliente;
   //uso generico para especificar tipo de datos de la coleccion. En este momento es null
   private ArrayList <Producto> listaProductos;
   private Producto producto;
   
   /**
    * Constructor que inicializa un Pedido con una lista de productos. (* ó n)
    * Su propósito es crear un Pedido a partir de una lista de productos que ya existe.
    * @param p_fecha Fecha del pedido.
    * @param p_cliente Cliente que realiza el pedido.
    * @param p_productos Lista de productos incluidos en el pedido.
   */
   public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
       this.setFecha(p_fecha);
       this.setCliente(p_cliente);
       //Inicialización en el constructor 
       this.setListaProductos(new ArrayList <Producto> (p_productos));
   }
   /**
    * Constructor que inicializa un Pedido con un único producto.(1..*)
    * @param p_fecha Fecha del pedido.
    * @param p_cliente Cliente que realiza el pedido.
    * @param p_producto Producto incluido en el pedido.
   */
   public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
       this.setFecha(p_fecha);
       this.setCliente(p_cliente);
       //Inicializa la lista de productos vacía
       this.listaProductos = new ArrayList<Producto>(); 
       //Añade el único producto recibido a la lista
       this.agregarProducto(p_producto);
   }
   
   //setters y getters
   private void setFecha(Calendar p_fecha){
       this.fecha = p_fecha;
   }
   private void setCliente(Cliente p_cliente){
       this.cliente = p_cliente;
   }
   private void setListaProductos(ArrayList<Producto> p_productos){
       this.listaProductos = p_productos;
   }
   private void setProducto(Producto p_producto){
       this.producto = p_producto;
   }
   
   public Calendar getFecha(){
       return this.fecha;
   }
   public Cliente getCliente(){
       return this.cliente;
   }
   public ArrayList<Producto> getListaProductos(){
       return this.listaProductos;
   }
   public Producto getProducto(){
       return this.producto;
   }
   
   //Metodos
   /**
    * Calcula el total a pagar al contado de los productos en el pedido.
    * @return Total al contado.
   */
   public double totalAlContado(){
      double totalContado = 0.0;
      for(Producto producto : listaProductos){
          totalContado += producto.precioContado();
      }
      return totalContado;  
   }
   /**
    * Calcula el total a pagar financiado de los productos en el pedido.
    * @return Total financiado.
   */
   public double totalFinanciado(){
       double totalFinanciado = 0.0;
       for(Producto producto : listaProductos){
           totalFinanciado += producto.precioLista();
       }
       return totalFinanciado;
   }
   /**
    * Agrega un producto a la lista de productos del pedido.
    * @param p_producto Producto a agregar.
    * @return true si el producto fue agregado correctamente, false en caso contrario.
   */
   public boolean agregarProducto(Producto p_producto){
       return listaProductos.add(p_producto);
    }
   /**
     * Elimina un producto de la lista de productos del pedido.
     * @param p_producto Producto a eliminar.
     * @return true si el producto fue eliminado correctamente, false en caso contrario.
     */
   public boolean quitarProducto(Producto p_producto){
       return listaProductos.remove(p_producto);
   }
   public void mostrar(){
       System.out.format("****** Detalle del pedido ****** Fecha: %te de %tB de %tY%n" , fecha, fecha, fecha);
       System.out.println("Producto         ListaPrecio      Contado");
       System.out.println("--------------------------------------------------------");
       for(Producto unProducto: listaProductos){
           System.out.println(unProducto.mostrarLinea());
       }
       System.out.println("--------------------------------------------------------");
       System.out.println("*** Total---- " +"      " +this.totalFinanciado() +"         " +this.totalAlContado());
   }
   
}