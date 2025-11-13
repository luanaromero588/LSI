
/**
 * Write a description of class RenglonPedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RenglonPedido
{
    private int cantidad;
    private Congelado item;
    
    public RenglonPedido(int p_cantidad, Congelado p_item){
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
    }
    
    public int getCantidad() {
    return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Congelado getItem() {
        return item;
    }
    public void setItem(Congelado item) {
        this.item = item;
    }
    
    public double importe(){
        double imporFinal = this.getItem().precio(this.getCantidad());
        return imporFinal;
    }
    public String toString(){
        double PUFinal = this.importe() / this.getCantidad();//divido el total por la cantidad y saco cuanto sale la unidad
        return this.getItem().toString() +"Cantidad: " +this.getCantidad() +"Precio : "
                          +PUFinal +" Subtotal: " +this.importe();
    }
    
    
}