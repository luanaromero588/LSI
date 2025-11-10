
/**
 *Clase que modela una caja de ahorro.
 * 
 * @author Romero Ingrid Luana
 * @version 1
 */
public class CajaDeAhorro
{
    private int nroCuenta;
    private double saldo = 0.0;
    private static int extraccionesPosibles = 10;
    private Persona titular;
    /**
     * Constructor sin saldo que inicializa numero de cuenta y titular
     * @param p_nroCuenta nro de cuenta de titular
     * @param p_titular persona titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    /**
    * Constructor que inicializa numero de cuenta, titular y saldo( en 0 por defecto).
    * @param p_nroCuenta nro de cuenta del titular
    * @param p_titular persona titular
    * @param p_saldo saldo del titular
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
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
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    } public Persona getTitular(){
        return this.titular;
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
    /**
     * Realiza la extración y descuenta 1 al número de extracciones posibles.
     * @param double p_importe
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /** * Coordina la operacion extraccion 
    * @param double p_importe
    */ 
    public void extraer(double p_importe){ 
        if(this.puedeExtraer(p_importe)){ 
            this.extraccion(p_importe); 
        }else if(this.getExtraccionesPosibles() <= 0){
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!"); 
        }else if(p_importe > this.getSaldo()){
            System.out.println("No puede extraer mas que el saldo! "); } 
    }
    /**
     * Se agrega el importe al saldo actual.
     *  @param p_importe importe a agregar
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
     * Metodo publico, muestra por pantalla los datos de la caja de ahorro y de su titular
     */
    public void mostrar(){
        System.out.println("-Caja de Ahorro-");
        System.out.println("Nro.Cuenta: " +this.getNroCuenta() +"- Saldo: " +this.getSaldo());
        System.out.println("Titular: " +this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " +this.getExtraccionesPosibles());
    }
}