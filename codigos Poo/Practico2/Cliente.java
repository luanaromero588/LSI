
/**
 * Esta clase modela un Cliente con atributos y metodos relacionados al
 * saldo y métodos personales
 * 
 * @author Romero Ingrid Luana 
 * @author Ortellado Luciana
 * @version 1.0 - 2025-08-19
 */
public class Cliente
{ //atributos de la clase
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
 /** 
  * Instancia un objeto de tipo Cliente con su DNI, nombre, apellido y saldo.
  * @param p_dni Este parametro asigna el DNI del cliente.
  * @param p_nombre Este parametro asigna el nombre del cliente.
  * @param p_apellido Este parametro asigna el apellido del cliente.
  * @param p_importe Este parametro asigna el saldo del cliente.
  */
  public Cliente(int p_dni , String p_apellido , String p_nombre, double p_importe ){
      setNroDNI(p_dni);
      setApellido(p_apellido);
      setNombre(p_nombre);
      setSaldo(p_importe);
  }
  //setters
  public void setNroDNI(int p_dni){
      nroDNI = p_dni;
  }
  public void setApellido(String p_apellido){
      apellido = p_apellido;
  }
  public void setNombre(String p_nombre){
      nombre = p_nombre;
  }
  public void setSaldo(double p_saldo){
      saldo = p_saldo;
  }
  
  //getters
  public int getNroDNI(){
      return nroDNI;
  }
  public String getApellido(){
      return apellido;
  }
  public String getNombre(){
      return nombre;
  }
  public double getSaldo(){
      return saldo;
  }
  /** 
   * Muestra los datos del cliente como ser nombre , apellido, dni y saldo.
  */
  public void mostrar(){
      System.out.println( "-Cliente-");
      System.out.println("Nombre y Apellido: " +nomYApe() +" " +"("+getNroDNI() +")" );
      System.out.println("Saldo:$ " +getSaldo()) ; //atenta al tipo de dato y lo que devuelve 
  }
  /**
   * Reemplaza el sueldo actual por el valor indicado y devuelve el nuevo saldo.
   * @param p_importe El importe que se asignara como nuevo saldo
   * @return Devuelve el saldo actualizado
   */
  public double nuevoSaldo(double p_importe){
      setSaldo(p_importe);
      return getSaldo(); 
  }
  /** 
   * Suma el valor indicado al saldo actual y devuelve el saldo actualizado.
   * @param p_importe El importe que se suma al saldo actual
   * @return El saldo actualizado
   */
  public double agregaSaldo(double p_importe){
      setSaldo(getSaldo() + p_importe); 
      return getSaldo() ;
  }
  /**
   * @return El nombre y apellido del cliente
   */
  public String nomYApe(){
      return getNombre() +" " +getApellido() ;
  }
  
  
}