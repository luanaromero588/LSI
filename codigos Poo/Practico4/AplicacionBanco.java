import java.util.Scanner;
import java.util.ArrayList;
/**
 * Clase ejecutable para la gestión de empleados de un Banco.
 * Permite contratar y despedir empleados, y mostrar la nómina de sueldos.
 * * @author Romero Ingrid Luana
 * @version 1.0
 */
public class AplicacionBanco {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        //Creo los objetos iniciales para que el banco tenga datos al empezar.
        Localidad unaLocalidad = new Localidad("San Lorenzo", "Corrientes");
        Empleado unEmpleado = new Empleado(201234569, "Perez", "Juan", 250000, 2018);
        Banco unBanco = new Banco("RIO", unaLocalidad, 3, unEmpleado);

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("1.Contratar Empleado, 2.Despedir Empleado, 3. Mostrar Nómina de Sueldos");
            System.out.println("4. Agregar cuenta bancaria, 5. Quitar cuenta bancaria, 6.Mostrar Resumen de cuenta");
            System.out.print("Elija una opción(0 para salir): \n");
            opcion = Integer.parseInt(ingreso.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("--- Contratar Empleado ---");
                    System.out.print("Ingrese CUIL: ");
                    long cuil = Long.parseLong(ingreso.nextLine());
                    System.out.print("Ingrese Apellido: ");
                    String apellido = ingreso.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = ingreso.nextLine();
                    System.out.print("Ingrese Sueldo Básico: ");
                    double sueldo = Double.parseDouble(ingreso.nextLine());
                    System.out.print("Ingrese Año de Ingreso: ");
                    int año = Integer.parseInt(ingreso.nextLine());
                    // Creo el objeto del nuevo empleado con los datos ingresados.
                    Empleado nuevoEmpleado = new Empleado(cuil, apellido, nombre, sueldo, año);
                    //Agrego el nuevo empleado al banco.
                    unBanco.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado contratado con éxito\n");
                    break;
                case 2:
                    System.out.println("--- Despedir Empleado ---");
                    if( unBanco.getEmpleados().size() > 1){
                    unBanco.quitarEmpleado(buscarEmpleado(unBanco, ingreso));
                    System.out.println("Empleado eliminado\n");
                    }else{
                        System.out.println("No se puede eliminar empleado\n");
                    }
                    break;
                case 3:
                    unBanco.mostrar();
                    break;
                case 4:
                    //pido datos de la cuenta bancaria
                    System.out.print("Ingrese el número de cuenta bancaria: ");
                    int nroCuenta = Integer.parseInt(ingreso.nextLine());
                    System.out.print("Ingrese el saldo de la cuenta: ");
                    double saldo = Double.parseDouble(ingreso.nextLine());
                    //pido datos del titular
                    System.out.print("Ingrese el DNI del titular: ");
                    int dni = Integer.parseInt(ingreso.nextLine());
                    System.out.print("Ingrese el nombre del titular: ");
                    String unNombre = ingreso.nextLine();
                    System.out.print("Ingrese el apellido del titular: ");
                    String unApellido = ingreso.nextLine();
                    System.out.print("Ingrese el año de nacimiento del titular: ");
                    int anioNacimiento = Integer.parseInt(ingreso.nextLine());
                    //creo el objeto Persona
                    Persona perTitular = new Persona(dni, unNombre, unApellido, anioNacimiento);
                    //creo el objeto CuentaBancaria
                    CuentaBancaria cuentaNueva = new CuentaBancaria(nroCuenta, perTitular, saldo);
                    //agrego la cuenta a la lista de cuentas
                    unBanco.agregarCuentaBancaria(cuentaNueva);
                    
                    System.out.println("Cuenta bancaria agregada exitosamente.");
                    break;
                case 5:
                    System.out.println("Quitar ceunta bancaria");
                    CuentaBancaria encontrarCuenta = buscarCuenta(unBanco, ingreso);
                    if(encontrarCuenta != null ){
                       
                        unBanco.quitarCuentaBancaria(encontrarCuenta);
                        System.out.println("Cuenta eliminada: " + encontrarCuenta.getNroCuenta());
                    } else {
                        System.out.println("No se puede despedir enpleado");
                    }
                    break;
                case 6:
                    unBanco.mostrarResumen();
                    break;
            }
        }
   
   }
   public static Empleado buscarEmpleado(Banco p_banco, Scanner p_ingreso) {
        System.out.print("Ingrese empleado a despedir: \n");
        int i=0;
        for (Empleado emple : p_banco.getEmpleados()) {
            System.out.println(i +"-" +emple.nomYApe());
            i++;
        }
        int opcion = Integer.parseInt(p_ingreso.nextLine()); 
        return p_banco.getEmpleados().get(opcion);
   }
   
   public static CuentaBancaria buscarCuenta(Banco p_banco, Scanner p_ingreso) {
        System.out.print("Ingrese numero de cuenta bancaria a quitar: ");
        int nroCuenta = Integer.parseInt(p_ingreso.nextLine());
        
        CuentaBancaria cuentaEncontrada = null;
        for(CuentaBancaria cuenta : p_banco.getCuentas()) {
             if (cuenta.getNroCuenta() == nroCuenta) {
                System.out.println("Cuenta: " + cuenta.getNroCuenta());
                cuentaEncontrada = cuenta;
                break;
             }
        }    
        return cuentaEncontrada;
   }
   /*
    * System.out.println("--- Despedir Empleado ---");
                    System.out.print("Ingrese el CUIL del empleado a despedir: ");
                    long cuilBaja = Long.parseLong(ingreso.nextLine());
                    //Busco al empleado en el banco para asegurarme de que existe.
                    Empleado empleADespedir = buscarEmpleado(unBanco, cuilBaja);  
                    if (empleADespedir != null) { 
                        unBanco.quitarEmpleado(empleADespedir); 
                        System.out.println("Empleado " +empleADespedir.nomYApe() + " ha sido despedido.");
                    } else {
                        System.out.println("Error: No se encontró un empleado con ese CUIL.");
                    }
                    break;*/
    
}