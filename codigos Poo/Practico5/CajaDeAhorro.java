
/**
 * Subclase que modela una caja de ahorro que extiende de la superclase CuentaBancaria
 * 
 * @author Romero Ingrid Luana
 * @version 2
 */
public class CajaDeAhorro extends CuentaBancaria{
    private  int extraccionesPosibles;
    
    /**
     * Constructor sin saldo que inicializa numero de cuenta y titular
     * @param p_nroCuenta nro de cuenta de titular
     * @param p_titular persona titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular); 
        this.setExtraccionesPosibles(10);
    }
    /**
    * Constructor que inicializa numero de cuenta, titular y saldo( en 0 por defecto).
    * @param p_nroCuenta nro de cuenta del titular
    * @param p_titular persona titular
    * @param p_saldo saldo del titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    private int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    /**
    *Comprueba si el cliente puede realizar extracciones
    *@param double p_importe
    *@return devuelve un booleano
    */
    private boolean puedeExtraer(double p_importe){
        return (p_importe <= this.getSaldo()) && (this.getExtraccionesPosibles() > 0 );
    }
    
    
    /** * Coordina la operacion extraccion 
    * @param double p_importe
    */ 
    public boolean extraer(double p_importe){ 
        if(this.puedeExtraer(p_importe)){ 
            super.extraer(p_importe); 
            return true;
        }else if(this.getExtraccionesPosibles() <= 0){
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!"); 
        }else if(p_importe > this.getSaldo()){
            System.out.println("No puede extraer mas que el saldo! ");
        } 
        return false;
    }
        
    /**
     * Se agrega el importe al saldo actual.
     *  @param p_importe importe a agregar
     */
    public void depositar(double p_importe){
         super.depositar(p_importe);
    }
    /**
     * Metodo publico, muestra por pantalla los datos de la caja de ahorro y de su titular
     */
    public void mostrar(){
        System.out.println("-Caja de Ahorro-");
        super.mostrar();
        System.out.println("Extracciones posibles: " +this.getExtraccionesPosibles());
    }
    
    public String xQNoPuedeExtraer(double p_importe){
         return "El importe a extraccion sobrepasa el limite de descubierto!";
    }
}