/**
 * Clase ejecutable que permite probar la clase Laboratorio.
 * Crea objetos con sus datos, mostrando cómo funcionan los constructores, los setters, getters y
 * el método mostrar().
 * 
 * En este ejecutable se crean dos laboratorios: uno con todos los datos desde el inicio y otro con datos básicos, al cual luego se le agregan
 * la compra mínima y el día de entrega.
 * 
 * @author Romero Ingrid Luana
 * @author Ortellado Luciana
 * @version 1.0 20/08/2025
 */
public class LaboratorioEjecutable
{
    public static void main(String [] args){
        //laboratorio completo
        Laboratorio laboratorio1 = new Laboratorio ("Marcomini", "San Juan 1500", "0800-1234", 3000 , 15);
        
        //laboratorio parcial
        Laboratorio laboratorio2 = new Laboratorio ("TC-2000", "Catamarca 1500", "0111-5467");
        laboratorio2.nuevaCompraMinima(2000); //prueba de setters
        laboratorio2.nuevoDiaEntrega(10);
        
           //Prueba mostrar()
       System.out.println(" Datos de los laboratorios \n");
       System.out.println(laboratorio1.mostrar());
       System.out.println("Compra Minima: "+laboratorio1.getCompraMin()
                           +"  " +"Dia de entrega: " +laboratorio1.getDiaEnt() +"\n");
        System.out.println(laboratorio2.mostrar());
        System.out.println("Compra Minima: "+laboratorio2.getCompraMin()
                           +"  " +"Dia de entrega: " +laboratorio2.getDiaEnt() +"\n");
        //prueba de setters. Cambio de valores.
        laboratorio2.nuevaCompraMinima(5000);
        laboratorio2.nuevoDiaEntrega(15);
        System.out.println("Datos de los laboratorios ACTUALIZADOS" +"\n");
       
        System.out.println(laboratorio2.mostrar());
        System.out.println("Nueva compra minima: " +laboratorio2.getCompraMin()
                            +"  " +"Nuevo dia de entrega: " +laboratorio2.getDiaEnt());
    }
}