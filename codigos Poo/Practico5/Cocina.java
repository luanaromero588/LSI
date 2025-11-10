
/**
 * Clase que modela una heladera
 * 
 * @author Romero Ingrid Luana
 * @version 1. 11/10/2025
 */
public class Cocina extends ArtefactoHogar{
    private int hornallas;
    private int calorias;
    private String dimensiones;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_marca
    *@param float p_precio
    *@param int p_stock
    *@param int p_hornallas
    *@param int p_calorias
    *@param String p_dimensiones
    */
    public Cocina(int p_hornallas, int p_calorias, String p_dimensiones,String p_marca, float p_precio, int p_stock){
        super(p_marca,p_precio,p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    
    public int getHornallas() {
    return this.hornallas;
    }
    public void setHornallas(int hornallas) {
        this.hornallas = hornallas;
    }
    public int getCalorias() {
        return this.calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public String getDimensiones() {
        return this.dimensiones;
    }
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    /**
     *Muestra por pantalla los datos de la cocina
    */
    public void imprimir(){
        System.out.println("\n***Cocina***");
        super.imprimir();
        System.out.println("Honallas: "+this.getHornallas());
        System.out.println("Calorias: "+this.getCalorias());
        System.out.println("Dimensiones: "+this.getDimensiones());
    }
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        return super.cuotaCredito(p_cuotas, p_interes);
    }
}