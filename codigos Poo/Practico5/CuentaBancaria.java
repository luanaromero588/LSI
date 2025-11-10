
/**
 * Clase que modela una cuenta bancaria modificada
 * 
 * @author Romero Ingrid Luana
 * @version 3
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor que inicializa una cuenta bancaria con número de cuenta y titular. El saldo se inicializa en 0 por defecto.
     *
     * @param p_nroCuenta Número de la cuenta bancaria
     * @param p_titular   Persona titular de la cuenta
    */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        //en java se inicializa automatico en 0.0 pero por buenas practicas agrego:
        this.setSaldo(0.0);
    }
    /**
     * Constructor que inicializa una cuenta bancaria con número de cuenta,titular y un saldo inicial especificado.
     *
     * @param p_nroCuenta Número de la cuenta bancaria
     * @param p_titular   Persona titular de la cuenta
     * @param p_saldo     Saldo inicial de la cuenta
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo ;
    }
    public Persona getTitular(){
        return this.titular;
    }
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
    *Recibe un importe por parametro para depositar
    * @param double p_importe
    * @return devuelve un double
    */
    public void depositar(double p_importe){
         this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
    * Recibe un importe para extraer
    * @param double p_importe
    * @return devuelve un double
    */
    public boolean extraer(double p_importe){
        if(this.getSaldo() > p_importe){
            this.setSaldo(this.getSaldo() - p_importe);
            return true;
        }else{
            return false;
        }
    }
    /**
     * Muestra por pantalla los datos de la cuenta bancaria como ser titular, edad y saldo.
     */
    public void mostrar(){
        System.out.println("Nro.Cuenta: " +this.getNroCuenta() +"- Saldo: " +this.getSaldo());
        System.out.println("Titular: " +this.getTitular().nomYApe());
    }
    /**
     * Retorna una cadena con los datos del titular.
     * @return devuelve un String
     */
    public String toString(){
        return this.titular.edad() +"\t" +this.titular.nomYApe() +"\t" +this.getSaldo(); 
    }
    
    
    
    
}