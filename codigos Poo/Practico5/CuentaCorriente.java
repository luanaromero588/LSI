
/**
 * Subclase que modela una cuenta corriente que extiende de la superclase CuentaBancaria
 * 
 * @author Romero Ingrid Luana 
 * @version 2
 */
public class CuentaCorriente extends CuentaBancaria
{
    private double limiteDescubierto;
    
    /**
     * Constructor sin saldo que inicializa el numero de cuenta y el titular
     * @param p_nroCuenta nro de cuenta de titular
     * @param p_titular persona titular
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);  
        //this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    /**
    * Constructor que inicializa numero de cuenta, titular y saldo( en 0 por defecto).
    * @param p_nroCuenta nro de cuenta del titular
    * @param p_titular persona titular
    * @param p_saldo saldo del titulae
    */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);  
        this.setLimiteDescubierto(500);
    }
    
    //setters y getters
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    public Double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    /**
     *Comprueba si el cliente puede realizar extracciones
     *@param double p_importe
     *@return devuelve un booleano
     */
    private boolean puedeExtraer(double p_importe){
        return  (this.getSaldo() + this.limiteDescubierto) >= p_importe ;
    }
  
    /**
     * Coordina la operación de extracción, caso contrarioinformará el motivo por el cual no se pudo extraer.
     * @param p_importe monto de importe  
     */
    public boolean extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            super.extraer(p_importe);
            return true;
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
        return false;
    }
    /**
     *  Se agrega el importe al saldo actual.
     *  @param p_importe importe a agregar
     */
     public void depositar(double p_importe){
          super.depositar(p_importe);
        }
    /**
     * Se muestra por pantalla los datos de cuenta del titular
     */
    public void mostrar(){
        System.out.println("-Cuenta corriente-");
        super.mostrar();
        System.out.println("Descubierto: " +this.getLimiteDescubierto());
    }
    
    public String xQNoPuedeExtraer(double p_importe){
         return "El importe a extraccion sobrepasa el limite de descubierto!";
    }
}