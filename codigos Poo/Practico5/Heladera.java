
/**
 * Clase que modela una heladera
 * 
 * @author Romero Ingrid Luana
 * @version 1. 11/10/2025
 */
public class Heladera extends ArtefactoHogar{
    private int pies;
    private int puertas;
    private Boolean compresor;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_marca
    *@param float p_precio
    *@param int p_stock
    *@param int p_pies
    *@param int p_puertas
    *@param boolean p_compresor
    */
    public Heladera(int p_pies, int p_puertas, boolean p_compresor,String p_marca, float p_precio, int p_stock){
        super(p_marca,p_precio,p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    
    public int getPies() {
    return this.pies;
    }
    public void setPies(int p_pies) {
        this.pies = p_pies;
    }
    public int getPuertas() {
        return this.puertas;
    }
    public void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }
    public boolean getCompresor() {
        return this.compresor;
    }
    public void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }
    
    /**
     *Muestra por pantalla los datos de la Heladera
    */
    public void imprimir(){
        System.out.println("\n***Heladera***");
        super.imprimir();
        System.out.println("Honallas: "+this.getPies());
        System.out.println("puertas: "+this.getPuertas());
        System.out.println("compresor: "+this.getCompresor());
    }
    
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(this.getCompresor()){
           //si la heladera tiene compresor, adiciono 50$ por cuota 
           return super.cuotaCredito(p_cuotas, p_interes) + 50;
        }else{
           return super.cuotaCredito(p_cuotas, p_interes);
        }
    }
}