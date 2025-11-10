/**
 * Clase ejecutable de gestion del comercio
 * @author Romero Ingrid Luana
 */

import java.util.Scanner;
public class GestionComercio {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        Comercio miComercio = new Comercio("Avanti SRL");// Se crea la instancia del Comercio. Puede empezar sin empleados (relación 0..*).
        
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("1. Contratar Empleado, 2. Despedir Empleado, 3. Consultar Sueldo Neto de Empleado, 4. Mostrar Nómina de Empleados");
            System.out.println("Elija una opción(0 para salir): ");
            opcion = Integer.parseInt(ingreso.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\n**** Contratar Empleado ****");
                    System.out.print("Ingrese CUIL: ");
                    long cuil = Long.parseLong(ingreso.nextLine());
                    System.out.print("Ingrese Apellido: ");
                    String apellido = ingreso.nextLine();
                    System.out.print("Ingrese Nombre: ");
                    String nombre = ingreso.nextLine();
                    System.out.print("Ingrese Sueldo Básico: ");
                    double sueldo = Double.parseDouble(ingreso.nextLine());
                    System.out.print("Ingrese Año de Ingreso: ");
                    int añio = Integer.parseInt(ingreso.nextLine());
                    
                    //intancio nuevo empleado
                    Empleado nuevoEmpleado = new Empleado(cuil, apellido, nombre, sueldo, añio);
                    //añado nuevo empleado a la coleccion
                    miComercio.altaEmpleado(nuevoEmpleado);
                    System.out.println("Empleado contratado con éxito");
                    break;
                case 2:
                    // Para dar de baja un empleado 
                    System.out.println("\n ****Despedir Empleado****");
                    System.out.println("Ingrese el CUIL del empleado a despedir: ");
                    long cuilBaja = Long.parseLong(ingreso.nextLine());
                    Empleado empleadoDespedido = miComercio.bajaEmpleado(cuilBaja);
                    
                    if (empleadoDespedido != null) {
                        System.out.println("Empleado " + empleadoDespedido.nomYApe() + " ha sido despedido.");
                    } else {
                        System.out.println("Error: No se encontró un empleado con ese CUIL.");
                    }
                    break;
                case 3:
                    //consultar el sueldo neto 
                     System.out.println("\n****Consultar Sueldo****");
                     System.out.print("Ingrese el CUIL del empleado a consultar: ");
                     long cuilSueldo = Long.parseLong(ingreso.nextLine());
                     miComercio.sueldoNeto(cuilSueldo);
                    break;
                case 4:
                    //mostrar la nómina completa
                    miComercio.nomina();
                    break;
            }
        }
    }
}