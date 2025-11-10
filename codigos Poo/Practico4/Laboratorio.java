
/**
 * La clase Laboratorio modela los datos principales de un laboratorio, y además la información de compra mínima y día de entrega.
 * @author Romero Ingrid Luana
 * @version 1.0 - 2025-08-20
 */
public class Laboratorio
{
 //atributos de la clase
 private String nombre;
 private String domicilio;
 private String telefono;
 private int compraMinima;
 private int diaEntrega;
 
 /**
     * Constructor con todos los datos del laboratorio
     * 
     * @param p_nombre nombre del laboratorio
     * @param p_domicilio dirección del laboratorio
     * @param p_telefono teléfono de contacto
     * @param p_compraMin compra mínima requerida
     * @param p_diaEnt día de entrega
     */
 public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
    setNombre(p_nombre);
    setDomicilio(p_domicilio);
    setTelefono(p_telefono);
    setCompraMinima(p_compraMin);
    setDiaEntrega(p_diaEnt);
             }
 /**
     * Constructor que solo carga los datos básicos
     * 
     * @param p_nombre nombre del laboratorio
     * @param p_domicilio dirección del laboratorio
     * @param p_telefono teléfono de contacto
     */
 public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
     setNombre(p_nombre);
     setDomicilio(p_domicilio);
     setTelefono(p_telefono);
 }
           
 //setters y getters
 public void setNombre(String p_nombre){
      nombre = p_nombre;
 }
 public String getNombre(){
     return nombre;
 }
 
 public void setDomicilio(String p_domicilio){
      domicilio = p_domicilio;
 }
 public String getDomicilio(){
     return domicilio;
 }
 
 public void setTelefono(String p_telefono){
      telefono = p_telefono;
 }
 public String getTelefono(){
     return telefono;
 }
 
 public void setCompraMinima(int p_compraMin){
     compraMinima = p_compraMin;
 }
 public int getCompraMin(){
     return compraMinima;
 }
 
 public void setDiaEntrega(int p_diaEnt){
    diaEntrega = p_diaEnt; 
 }
 public int getDiaEnt(){
     return diaEntrega;
 }
 
 //metodos 
 /**
 * Permite cambiar la compra mínima
 * @param p_compraMin nuevo valor de compra mínima
 */
 public void nuevaCompraMinima(int p_compraMin){
     setCompraMinima(p_compraMin);
 }
 /**
 * Permite cambiar el día de entrega
 * @param p_diaEnt nuevo día de entrega
 */
 public void nuevoDiaEntrega(int p_diaEnt){
     setDiaEntrega(p_diaEnt);
 }
 /**
 * Devuelve una cadena con los datos principales del laboratorio
 * @return String con nombre, domicilio y teléfono
 */
 public String mostrar(){
     return "Laboratorio:  " +getNombre() +"\n" +"Domicilio:  " +getDomicilio() +" - " +"Telefono: " +getTelefono() ;
 }
}