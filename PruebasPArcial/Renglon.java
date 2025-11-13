
/**
 * Write a description of class Renglon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Renglon
{
    private int cantidad;
    private double precio;
    private Etiqueta item;
    
     public Renglon(int p_cantidad, double p_precio, Etiqueta p_item){
        this.setCantidad(p_cantidad);
        this.setPrecio(p_precio);
        this.setItem(p_item);
    }
    
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }
    public double getPrecio(){
        return this.precio;
    }
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }
    public Etiqueta getItem(){
        return this.item;
    }
    
    public void mostrar(){
        System.out.println(this.getCantidad() +"Etiquetas de " +this.getItem().toString());
    }
}