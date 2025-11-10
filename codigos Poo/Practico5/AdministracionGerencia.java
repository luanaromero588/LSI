/**
 * Ejecutable que administra alojamientos y servicios en una gerencia
 * @author Romero Ingrid Luana
 * @version 1- 10/10/2025
 */
import java.util.Scanner;
import java.util.ArrayList;

public class AdministracionGerencia {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        // Inicializo la gerencia
        System.out.println("***Ingrese nombre de Gerencia***");
        String nomGerencia = ingreso.nextLine();
        Gerencia unaGerencia = new Gerencia(nomGerencia);

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n1-Agregar alojamiento \n2-Mostrar liquidacion ");
            System.out.println("Ingrese una opcion(0 para salir): ");
            opcion = Integer.parseInt(ingreso.nextLine());

            switch (opcion) {
                case 1:
                    Alojamiento unAlojamiento = crearAlojamiento(ingreso);
                    if (unAlojamiento != null) {
                        ArrayList<Servicio> serviciosDisponibles = crearServiciosDisponibles();
                        elegirServicios(unAlojamiento, ingreso, serviciosDisponibles);
                        unaGerencia.agregarAlojamiento(unAlojamiento);
                        System.out.println("Alojamiento agregado con éxito");
                    }
                    break;
                case 2:
                    System.out.println("****Liquidacion****");
                    unaGerencia.mostrarLiquidacion();
                    break;
            }
        }
    }

    //Creor un alojamiento
    public static Alojamiento crearAlojamiento(Scanner ingreso) {
        System.out.println("\n***Ingresos de datos del alojamiento***");

        System.out.print("Ingrese tipo de alojamiento 1-Cabaña 2-Hotel: ");
        int op = Integer.parseInt(ingreso.nextLine());
        System.out.print("Ingrese nombre del alojamiento: ");
        String nombreAloja = ingreso.nextLine();
        System.out.print("Ingrese precio base: ");
        double precioBase = Double.parseDouble(ingreso.nextLine());
        System.out.print("Ingrese cantidad de días: ");
        int cantDias = Integer.parseInt(ingreso.nextLine());

        Alojamiento unAlojamiento = null;

        switch (op) {
            case 1:
                System.out.print("Ingrese número de habitaciones: ");
                int numHabitaciones = Integer.parseInt(ingreso.nextLine());
                unAlojamiento = new Cabaña(numHabitaciones, nombreAloja, precioBase, cantDias);
                break;
            case 2:
                System.out.print("Ingrese tipo de habitaciones Single/Doble: ");
                String tipoHabitaciones = ingreso.nextLine();
                unAlojamiento = new Hotel(tipoHabitaciones, nombreAloja, precioBase, cantDias);
                break;
        }

        return unAlojamiento;
    }

    // Creo lista de servicios disponibles
    public static ArrayList<Servicio> crearServiciosDisponibles() {
        ArrayList<Servicio> servicios = new ArrayList<Servicio>();
        servicios.add(new Servicio("Internet", 28.0));
        servicios.add(new Servicio("Alquiler de autos", 50.0));
        return servicios;
    }

    // Elegir servicios para un alojamiento
    public static void elegirServicios(Alojamiento p_alojamiento, Scanner ingreso, ArrayList<Servicio> p_serviciosDisponibles) {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n****Servicios disponibles*****");
            System.out.println("Ingrese tipo de servicio: 1-Internet 2-Alquiler de autos (0 para Salir) ");
            opcion = Integer.parseInt(ingreso.nextLine());

            switch (opcion) {
                case 1:
                    p_alojamiento.agregarServicio(p_serviciosDisponibles.get(0));
                    System.out.println("Servicio de Internet agregado");
                    break;
                case 2:
                    p_alojamiento.agregarServicio(p_serviciosDisponibles.get(1));
                    System.out.println("Servicio de alquiler de autos agregado");
                    break;
            }
        }
    }
}
