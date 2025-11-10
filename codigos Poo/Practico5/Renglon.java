
/**
 * @author Romero Ingrid Luana
 * @version 1. 17/10/2025
 */
public class Renglon
{
    private int cantidad;
    private double importe;
    private Etiqueta item;
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param int p_cantidad
    *@param double p_importe
    *@param Etiqueta p_item
    */
    public Renglon(int p_cantidad, double p_importe, Etiqueta p_item){
        this.setCantidad(p_cantidad);
        this.setImporte(p_importe);
        this.setItem(p_item);
    }
    
    private void setCantidad(int p_cantidad){
        this.cantidad = p_cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    private void setImporte(double p_importe) {
        this.importe = p_importe;
    }
    public double getImporte(){
        return this.importe;
    }
    private void setItem(Etiqueta p_item){
        this.item = p_item;
    }
    public Etiqueta getItem(){
        return this.item;
    }
    
    /**
     * Metodo publico, muestra por pantalla los datos de la etiqueta
    */
    public void mostrar(){
        System.out.println(this.getCantidad() +" Etiquetas de tipo " +this.getItem().toString());
    }
}