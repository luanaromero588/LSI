
/**
 * Clase que simula un banco
 * 
 * @author Romero Ingrid Luana
 * @version 1.0
 */
import java.util.*;
public class Banco{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList <Empleado> empleados;
    private ArrayList <CuentaBancaria> cuentas;
    //uso de generico, solo va a contener objetos de la clase empleado
    /**
     * Constructor para crear una instancia de Banco con un empleado inicial(1..*)
     *
     * @param p_nombre Nombre del banco.
     * @param p_localidad Objeto Localidad donde se ubica el banco.
     * @param p_nroSucursal Número de la sucursal.
     * @param p_empleado Objeto Empleado que será el primer empleado de la colección.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre( p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        //inicializo la colección de empleados
        this.setEmpleados( new ArrayList<Empleado>()); 
        //agrego el primer empleado con el metodo creado
        this.agregarEmpleado(p_empleado);
        //cuenta bancaria vacia 
        this.setCuentas(new ArrayList<CuentaBancaria>());
    }

    /**
     * Constructor para crear una instancia de Banco con una lista de empleados preexistente.(*..
     *
     * @param p_nombre Nombre del banco.
     * @param p_localidad Objeto Localidad donde se ubica el banco.
     * @param p_nroSucursal Número de la sucursal.
     * @param p_empleados Colección ArrayList con los empleados.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre( p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(new ArrayList<CuentaBancaria>());
    }
    /**
     * Constructor de la clase Banco (un banco puede o no tener cuentas bancarias al momento de su creación).
     * 
     * @param p_nombre       Nombre del banco.
     * @param p_localidad    Localidad en la que se encuentra la sucursal.
     * @param p_nroSucursal  Número de sucursal del banco.
     * @param p_empleados    Lista de empleados que pertenecen a la sucursal.
     * @param p_cuentas      Lista de cuentas vacia.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList p_cuentas){
        this.setNombre( p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentas(p_cuentas);
    }
    
    //setters y getters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    private void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }
    public int getNroSucursal() {
        return this.nroSucursal;
    }
    private void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }
    public Localidad getLocalidad() {
        return this.localidad;
    }
    private void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }
    private void setCuentas(ArrayList<CuentaBancaria> p_cuentas) {
        this.cuentas = p_cuentas;
    }
    public ArrayList<CuentaBancaria> getCuentas() {
        return this.cuentas;
    }
    
    //metodos
    /**
     * Agrega un empleado a la colección del banco.
     * @param p_empleado El objeto Empleado a agregar.
     * @return "true"  si se agregó con éxito
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.empleados.add(p_empleado);
    }

    /**
     * Quita un empleado de la colección del banco.
     * @param p_empleado El objeto Empleado a quitar.
     * @return "true" si se quitó con éxito.
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.empleados.remove(p_empleado);
    }
    
    /**
     * Calcula la suma total de los sueldos netos de todos los empleados.
     * Recorre la colección y acumula el valor devuelto por el método sueldoNeto() de cada empleado.
     * @return La suma total de los sueldos a pagar.
     */
    public double sueldosAPagar() {
        double total = 0.0;
        for(Empleado emple : this.empleados){
            total = total + emple.sueldoNeto();
        }
        return total;
    } 
    
    /**
     * Imprime por pantalla la lista de empleados con su CUIL, nombre, apellido y sueldo neto.
     */
    public void listarSueldos() {
        for (Empleado emple : this.empleados) {
           System.out.println(emple.mostrarLinea());
        }
    }
    
    /**
     * Muestra en pantalla el reporte completo de la nómina de sueldos,
     * incluyendo los datos del banco y el total a pagar.
     */
    public void mostrar() {
        System.out.println("\n******************************************");
        System.out.println("Banco: " + this.getNombre() + "  Sucursal: " + this.getNroSucursal());
        System.out.println(localidad.mostrar() +"\n");
        this.listarSueldos();
        System.out.printf("\nTotal a Pagar -------------------- $" +this.sueldosAPagar());
        System.out.println("\n******************************************\n");
    }
    
    //metodos cuentas bancarias
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.cuentas.add(p_cuenta);
    }
    
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.cuentas.remove(p_cuenta);
    }
    
    public void listarCuentasConSaldoCero(){
        for(CuentaBancaria unaCuenta: this.cuentas){
            if(unaCuenta.getSaldo() == 0 ){
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("Cuentas sin saldo: ");
                System.out.println("--- Cuenta -------------------- Apellido y Nombre ---------------");
                System.out.println(unaCuenta.getNroCuenta()+"t" +unaCuenta.getTitular().nomYApe() +"\n");
                System.out.println("\n----------------------------------------------------------------------------------------------------");
            }
        }
    }
    
    /**
    * Genera y devuelve una colección de los titulares de cuentas sin duplicados.
    * @return Un HashSet<Persona> con los titulares únicos.
    */
    public HashSet<Persona> listaDeTitulares(){
        //inicializo hashset vacio
        HashSet<Persona> titularesSinRepe = new HashSet<Persona>();
        for(CuentaBancaria unaCuenta : this.cuentas){
             titularesSinRepe.add(unaCuenta.getTitular()); 
        }
        return titularesSinRepe;
    }
    
    /**
    * cuenta la cantidad de cuentas con saldo mayor a cero.
    * @return La cantidad de cuentas activas.
    */
    private int cuentasSaldoActivo(){
        int i = 0;
        for(CuentaBancaria unaCuenta : this.cuentas){
            if(unaCuenta.getSaldo() > 0){
                i++;
            }
        }
        return i;
    }
    
    /**
    * Muestra en pantalla el resumen de cuentas bancarias
    */
    public void mostrarResumen(){
        this.mostrar();
        System.out.println("************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("************************************************************");
        System.out.println("Número total de Cuentas Bancarias: " +getCuentas().size() );
        System.out.println("Cuentas activas: " +cuentasSaldoActivo());
        System.out.println("Cuentas saldo cero: " +(getCuentas().size() - cuentasSaldoActivo()));
        listarCuentasConSaldoCero();
        System.out.printf("Listado de Clientes: ");
        HashSet<Persona> titulares = listaDeTitulares();

        for (Persona titular : titulares) {
            System.out.println(titular.nomYApe() + ", "); 
        }

        System.out.println("\n----------------------------------------------------------------------------------------------------");
    }
    
}