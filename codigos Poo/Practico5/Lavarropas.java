
/**
 * Clase que modela una Lavarropas
 * 
 * @author Romero Ingrid Luana
 * @version 1. 11/10/2025
 */
public class Lavarropas extends ArtefactoHogar{
    private int programas;
    private float kilos;
    private boolean automatico;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase
    *@param String p_marca
    *@param float p_precio
    *@param int p_automatico
    *@param int p_programas
    *@param float p_kilos
    *@param boolean p_automatico
    */
    public Lavarropas(int p_programas, float p_kilos, boolean p_automatico,String p_marca, float p_precio, int p_stock ){
        super(p_marca,p_precio,p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }
    
    public int getProgramas() {
    return this.programas;
    }
    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }
    public float getKilos() {
        return this.kilos;
    }
    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }
    public boolean getAutomatico() {
        return this.automatico;
    }
    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }
    
    /**
     *Muestra por pantalla los datos de la Lavarropas
    */
    public void imprimir(){
        System.out.println("\n***Lavarropas***");
        super.imprimir();
        System.out.println("Hornallas :"+this.getProgramas());
        System.out.println("Kilos:"+this.getKilos());
        System.out.println("compresor: "+this.getAutomatico());
    }
    public float creditoConAdicional(int p_cuotas, float p_interes){
         float cuota =  super.cuotaCredito(p_cuotas, p_interes);
        if(this.getAutomatico()){
            return cuota;
        }else{
            return cuota - (float) (cuota * 0.02);
        }
    }
    /*
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(this.getAutomatico()){
            return super.cuotaCredito(p_cuotas, p_interes);
        }else{
            return super.cuotaCredito(p_cuotas, p_interes) - (float)(super.cuotaCredito(p_cuotas, p_interes) * 0.02) ;
        }
    }*/
}