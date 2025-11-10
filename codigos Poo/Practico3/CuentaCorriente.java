
/**
 * Clase que modela una cuenta corriente 
 * 
 * @author Romero Ingrid Luana 
 * @version 1
 */
public class CuentaCorriente
{
    private int nroCuenta;
    private double saldo = 0.0;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * Constructor sin saldo que inicializa el numero de cuenta y el titular
     * @param p_nroCuenta nro de cuenta de titular
     * @param p_titular persona titular
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);  
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
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);   
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    } public Persona getTitular(){
        return this.titular;
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
     * Realiza la extracion
     * @param double p_i/**
    * Coordina la operacion extraccion * @param double p_importe */ 
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    /**
     * Coordina la operación de extracción, caso contrarioinformará el motivo por el cual no se pudo extraer.
     * @param p_importe monto de importe  
     */
    public void extraer(double p_importe){
        if(this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        }else{
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    /**
     *  Se agrega el importe al saldo actual.
     *  @param p_importe importe a agregar
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe ); 
    }
    /**
     * Se muestra por pantalla los datos de cuenta del titular
     */
    public void mostrar(){
        System.out.println("-Cuenta corriente-");
        System.out.println("Nro.Cuenta: " +this.getNroCuenta() +"- Saldo: " +this.getSaldo());
        System.out.println("Titular: " +this.getTitular().nomYApe());
        System.out.println("Descubierto: " +this.getLimiteDescubierto());
    }
     
    
    
    
    
    
    
    
}