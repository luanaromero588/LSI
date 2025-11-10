
/**
 * Superclase que modela alojamientos
 * 
 * @author Romero Ingrid Luana
 * @version 1 11/10/2025
 */
import java.util.ArrayList;
public abstract class Alojamiento{
    private String nombre;
    private double precioBase;
    private int diasAlquiler;
    private ArrayList<Servicio> listaServicios;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase, con una coleccion de servicios vacia(0...*)
    *@param String p_nombre
    *@param double p_precioBase
    *@param int p_diasAlquiler
    */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setListaServicios(new ArrayList<Servicio> ());
    }
    /**
    *Constructor con parametros, instancia un objeto de la clase con una lista de servicios (*...n)
    *@param String p_nombre
    *@param double p_precioBase
    *@param int p_diasAlquiler
    *@param ArrayList<Servicio> p_servicos
    */
    public Alojamiento(String p_nombre, double p_precioBase, int p_diasAlquiler,ArrayList<Servicio> p_listaServicios ){
        this.setNombre(p_nombre);
        this.setPrecioBase(p_precioBase);
        this.setDiasAlquiler(p_diasAlquiler);
        this.setListaServicios(p_listaServicios);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    private void setPrecioBase(double p_precioBase){
       this.precioBase = p_precioBase;
    }
    public double getPrecioBase(){
       return this.precioBase;
    }
    private void setDiasAlquiler(int p_diasAlquiler){
       this.diasAlquiler = p_diasAlquiler;
    }
    public int getDiasAlquiler(){
       return this.diasAlquiler;
    }
    private void setListaServicios(ArrayList<Servicio> p_listaServicios){
        this.listaServicios = p_listaServicios;
    }
    public ArrayList <Servicio> getListaServicios(){
        return this.listaServicios;
    }
    
    public boolean agregarServicio(Servicio p_servicio){
        return this.listaServicios.add(p_servicio);
    }
    public boolean quitarServicio(Servicio p_servicio){
        return this.listaServicios.remove(p_servicio);
    }
    /**
    * Metodos abstractos
    */
    public abstract int contar(String p_alojamiento);
    
    /**
    * Metodo publico, devuelve el valor del costo,  precio a abonar por cada día, sin considerar los servicios.
    * @return devuelve un double
    */
    public double costo(){
        return this.getPrecioBase() * getDiasAlquiler();
    }
    /**
    * Metodo publico, muestra por pantalla los servicios
    */
    public void listarServicios(){
       for(Servicio unServi: getListaServicios()){
           System.out.printf("%s: %.2f\n", unServi.getDescripcion(), unServi.getPrecio());
       }
    }
    
    /**
    * Metodo publico, devuelve el costo de los servicios
    * @return devuelve un double
    */
    public double costoServicios(){
       double precioTotal = 0.0;
       for(Servicio unServi: getListaServicios()){
           precioTotal = precioTotal + unServi.getPrecio();
       } 
       return precioTotal;
    }
    
    /**
    * Metodo publico, muestra por pantalla los datos del alojamiento
    */
    public void liquidar(){
       System.out.println("Alojamiento: " +this.getNombre() );
       System.out.printf("Costo por %d dias: $ %.2f . ", this.getDiasAlquiler() , this.costo());
       this.listarServicios();
    }
}