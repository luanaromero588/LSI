
/**
 * Superclase que modela artefactor de hogar
 * 
 * @author Romero Ingrid Luana
 * @version 1 11/10/2025
 */
public abstract class  ArtefactoHogar{
    private String marca;
    private float precio;
    private int stock;
    
    /**
     *Constructor con parametros, instancia un objeto de la clase
     *@param String p_marca
     *@param float p_precio
     *@param int p_stock
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    
    public String getMarca() {
    return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPrecio() {
        return this.precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /**
     * Metodo publico, muestra por pantalla los datos de el artefacto
     */
    public void imprimir(){
        System.out.printf("Marca: %s - Precio: %.2f - Stock: %d " , this.getMarca(), this.getPrecio(), this.getStock());
    }
    
    /**
     * Metodo publico, calcula el valor de la cuota
     * @return devuelve un float
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        //al precio original se agrega el interés y se divide por el número de cuotas pactadas.
        return (this.getPrecio() + (this.getPrecio() * p_interes / 100)) / p_cuotas;  
    }
    
    /**
     * Metodo abstracto
     */
    public abstract float  creditoConAdicional(int p_cuotas, float p_interes);
}