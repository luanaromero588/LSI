/**
 * Ejecutable que administra la venta de entradas de un zoologico
 * @author Romero Ingrid Luana
 * @version 1- 17/10/2025
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
public class entradasZoologico {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        
        // Inicializo el zoologico
        Zoologico unZoo = new Zoologico("El Caribú");

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n1-Ingresar individuo \n2-Ingresar delegacion ");
            System.out.println("Ingrese una opcion(0 para salir): ");
            opcion = Integer.parseInt(ingreso.nextLine());

            switch (opcion) {
                case 1:
                    //creo nuevo indivuo con los datos que ingreso utilizando el metodo crearIndividuo
                    Individuo nuevoIndividuo = crearIndividuo(ingreso);
                    //añado el individuo al zoo
                    unZoo.nuevoVisitante(nuevoIndividuo);
                    break;
                case 2:
                    Delegacion nuevaDelegacion = crearDelegacion(ingreso);
                    unZoo.nuevoVisitante(nuevaDelegacion);
                    break;
            }
        }
    }

    //Creor un alojamiento
    public static Delegacion crearDelegacion(Scanner ingreso) {
        System.out.println("\n***Ingresos de datos de la delegacion***");

        System.out.print("Ingrese nombre de la delegación ");
        String nomDelegacion = ingreso.nextLine();
        
        // La delegación tiene su propia fecha general
        System.out.println("Ingrese día de visita: ");
        int dia = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese mes de visita: ");
        int mes = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese año de visita: ");
        int año = Integer.parseInt(ingreso.nextLine());
        Calendar fechaVisita = Calendar.getInstance();
        fechaVisita.set(año, mes - 1, dia);

        Delegacion unaDelegacion = new Delegacion(nomDelegacion, fechaVisita);

        
        int op = -1;
        while(op != 0){
            System.out.print("Desea ingresar un individuo a la delegacion? 1-si 0-no ");
            int ingresoIndividuo = Integer.parseInt(ingreso.nextLine());
            if(ingresoIndividuo == 1){
                Individuo unIndividuo = crearIndividuo(ingreso);
                unaDelegacion.inscribirIndividuo(unIndividuo);
            }else if(ingresoIndividuo == 0){
                System.out.print("Saliendo... "); 
                break;      
            }
        } 
        return unaDelegacion;
    }
    // Elegir servicios para un alojamiento
    public static Individuo crearIndividuo(Scanner ingreso) {
        System.out.println("\n***Ingreso de datos del individuo**");
        
        System.out.println("\nIngrese dni: ");
        int dniPersona = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese nombre: ");
        String nomPersona = ingreso.nextLine();
        System.out.println("Ingrese apellido: ");
        String apePersona = ingreso.nextLine();
        //datos fecha de nacimiento      
        System.out.println("Ingrese dia de nacimiento: ");
        int diaPersona = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese mes de nacimiento: ");
        int mesPersona = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese año de nacimiento: ");
        int añoPersona = Integer.parseInt(ingreso.nextLine());
        Calendar fechaPersona = Calendar.getInstance();
        fechaPersona.set(añoPersona, mesPersona - 1, diaPersona);
        //instancio una persona
        Persona unaPersona = new Persona(dniPersona, nomPersona, apePersona, fechaPersona);
        //ingreso datos de fecha de ingreso
        System.out.println("Ingrese dia de ingreso ");
        int diaIndividuo = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese mes de ingreso: ");
        int mesIndividuo = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese año de ingreso: ");
        int añoIndividuo = Integer.parseInt(ingreso.nextLine());
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.set(añoIndividuo, mesIndividuo - 1, diaIndividuo);
        //instancio el individuo
        Individuo unIndividuo = new Individuo(unaPersona, fechaActual); 
        System.out.println("Individuo añadido con exito");
        
        return unIndividuo;
    }
}
/* Me faltan la sultima 3 opciones
         * Se solicita implementar una clase ejecutable para realizar lo siguiente:
            a) Instanciar un zoológico con el nombre “El Caribú”
            b) Instanciar tres individuos que asistieron al zoológico, uno de ellos en forma independiente y 
            los otros dos formando parte de la delegación “PAMI”, el día 22/09/2024
            c) Crear la delegación “PAMI”, que asistió el día indicado, e inscribir a los dos individuos. 
            d) Listar todos los visitantes que acudieron al zoológico el día 22/09/2024
            e) Listar la recaudación del último mes
            f) Listar las delegaciones que acudieron el día 22/09/2024
         */
