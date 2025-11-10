
/**
 * Clase que modela un producto de un laboratorio.
 * 
 * @Romero Ingrid Luana 
 * @version 1 
 */
public class Producto
{
     //atributos de la clase
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
 
    /** 
    * Constructor completo de la clase.
    *
    * @param p_codigo Código del producto
    * @param p_rubro Rubro del producto
    * @param p_desc Descripción del producto
    * @param p_costo Precio de costo del producto
    * @param p_porcPtoRepo Porcentaje para punto de reposición
    * @param p_existMinima Existencia mínima necesaria
    * @param p_lab Laboratorio al que pertenece
    */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo ,double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
        this.setStock(0);//cada vez que creás un objeto Producto nuevo, su stock empieza en 0
    }
    /**
    * Constructor alternativo con datos mínimos.
    * 
    * @param p_codigo Código del producto
    * @param p_rubro Rubro del producto
    * @param p_desc Descripción del producto
    * @param p_costo Precio de costo del producto
    * @param p_lab Laboratorio al que pertenece
    */                      
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setLaboratorio(p_lab);
        this.setStock(0);
    }

     //setters y getters 
     private void setCodigo(int p_codigo){
         this.codigo = p_codigo;
     }
     private void setRubro( String p_rubro){
         this.rubro = p_rubro;
     }
     private void setDescripcion(String p_desc){
         this.descripcion = p_desc;
     }
     private void setCosto(double p_costo){
         this.costo = p_costo;
     }
     private void setStock(int p_stock){
         this.stock = p_stock;
     }
     private void setPorcPtoRepo(double p_porcPtoRepo){
         this.porcPtoRepo = p_porcPtoRepo ;
     }
     private void setExistMinima(int p_existMinima){
         this.existMinima = p_existMinima;
     }
     private void setLaboratorio(Laboratorio p_lab){
         this.laboratorio = p_lab;
     }
     
     public int getCodigo(){
         return this.codigo;
     }
     public String getRubro(){
         return this.rubro;
     }
     public String getDescripcion(){
         return this.descripcion;
     }
     public double getCosto(){
         return this.costo;
     }
     public int getStock(){
         return this.stock;
     }
     public double getPorcPtoRepo(){
         return this.porcPtoRepo;
     }
     public int getExistMinima(){
         return this.existMinima;
     }
     public Laboratorio getLaboratorio(){
         return this.laboratorio;
     }
     
     //metodos
    /**  
    * Actualiza el stock utilizando el valor recibido por parametro
    * @param p_cantidad cantidad a sumar o restar en el stock
    */
     public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad); 
        //priblema en tener el stock en negativo -1
    }
    /**
     * Calcula el valor total del stock considerando el precio de costo y una rentabilidad adicional del 12%
     * @return valor total del stock valorizado
     */
    public double stockValorizado(){
        double valorStock = this.getStock() * this.getCosto() ; 
        double stockFinal = valorStock + (valorStock * 0.12);
        return stockFinal;
    }
    /**
     * Calcula el precio de la lista del producto agregadno un 12% al costo.
     * @return precio de la lista
     */
    public double precioLista(){
        double precioLista = this.getCosto() + (this.getCosto() * 0.12 ); //var parcial 12% del costo
        return precioLista;
    }
    /**
     * Calcula el precio al contado del producto, aplicando un 5% adicional sobre el precio de lista
     * @return precio de contado
     */
    public double precioContado(){
        double precioC = this.precioLista() - (this.precioLista() * 0.05) ;
        //tambien puedo hacer this.precioLista * 0.95
        return precioC;
    }
    /**
     * Retorna una representación breve del producto en una sola línea,incluyendo descripción,
     * precio de lista y precio de contado.
     * @return cadena de datos
     */
    public String mostrarLinea(){
        return this.getDescripcion() +" " +this.precioLista() +" " +this.precioContado();
    }
    /**
     * Ajustar el porcentaje del punto de reposicion
     * @param p_porce nuevo porcentaje de punto de reposicion
     */
    public void ajustarPtoRepo(double p_porce ){
        this.setPorcPtoRepo(p_porce);
    }
    /**
     * Ajusta la cantidad minima de existencia de producto necesaria
     * @param p_cantidad nueva existencia minima
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    
    /**
     * Muestra por consola los datos relevantes del producto
     */
     public void mostrar(){
         System.out.println(laboratorio.mostrar());
         System.out.println("Rubro: " +this.getRubro());
         System.out.println("Descripción: " +this.getDescripcion());
         System.out.println("Precio Costo: " +this.getCosto());
         System.out.println("Stock: " +this.getStock() +" Stock Valorizado:$" +this.stockValorizado());
     }
}