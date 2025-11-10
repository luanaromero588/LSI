
/**
 * Clase ejecutable que prueba la clase Cliente. Crea un objeto Cliente a partir de argumentos recibidos,muestra sus datos,
 * actualiza el saldo mediante depósito y reemplaza el saldo con un nuevo valor.
 * 
 * @author Luana 
 * @author Ortellado Luciana
 * @version 1.0- 2025-08-19
 */
public class ClienteEjecutable
{
    /**
         * Metodo main que instancia un objeto cliente y prueba sus metodos
         * @param args Arreglo de Strings con los datos del cliente:
         *             args[0] -> DNI (int)
         *             args[1] -> Apellido (String)
         *             args[2] -> Nombre (String)
         *             args[3] -> Saldo inicial (double)
    */
    public static void main(String [] args){
         
        //Instancia un objeto Cliente con los valores recibidos como argumentos. 
        Cliente cliente1 = new Cliente(
        Integer.parseInt(args[0]),
        args[1],
        args[2],
        Double.valueOf(args[3])
        );   
        
        //muestra los datos de cliente1
        cliente1.mostrar();
        
        //agrego saldo(actualizo)
        double deposito = 5000; 
        System.out.println("Saldo actualizado: \n" +cliente1.agregaSaldo(deposito));
        
        //reemplazo saldo actual y devuelvo nuevo saldo.
        double nuevSal = 3000;
        System.out.println("Nuevo saldo: " +cliente1.nuevoSaldo(nuevSal));
        
        //muestra los datos del cliente despues de los cambios
         cliente1.mostrar();
    }
}