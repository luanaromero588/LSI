
/**
 * Clase ejecutable
 * @author Romero Ingri Luana 
 * @version 1
 * Implementar una clase ejecutable Banco, donde instancie 1 caja de ahorro
 * y 1 cuenta corriente, ambas para un mismo titular.
   Luego realice depósitos y extracciones, con los importes 
  necesarios para verificar todas las opciones.
 */
import java.util.*;
import java.util.Scanner;
public class Banco
{
    public static void main(String [] args){
        
        Scanner ingreso = new Scanner(System.in);
         
        
        //Instancio 1 caja de ahorro
        System.out.println("Ingrese DNI del titular");
        int nroDni = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese Nombre del titular");
        String nombre = ingreso.nextLine();
        System.out.println("Ingrese Apellido del titular");
        String apellido = ingreso.nextLine();
        System.out.println("Ingrese dia de nacimiento del titular");
        int diaNacimiento = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese mes de nacimiento del titular");
        int mesNacimiento = Integer.parseInt(ingreso.nextLine()) -1 ;
        System.out.println("Ingrese año de nacimiento del titular");
        int añoNacimiento = Integer.parseInt(ingreso.nextLine());
        Calendar fechaNacimiento = Calendar.getInstance();
        // cargo los datos de fecha de nacimiento, en orden año, mes ,dia
        fechaNacimiento.set(añoNacimiento, mesNacimiento, diaNacimiento);
        Persona personaTitular1 = new Persona(nroDni, nombre, apellido, fechaNacimiento);
        
        System.out.println("Ingrese número de cuenta del titular");
        int nroCuenta = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese saldo cuenta corriente");
        Double saldoCuentaCorriente = Double.parseDouble(ingreso.nextLine());
        CajaDeAhorro unaCajaDeAhorro = new CajaDeAhorro( nroCuenta, personaTitular1);
        //muestro por pantalla la primeraCuentaAhorro
        unaCajaDeAhorro.mostrar();
        
        //intancio 1 cuenta corriente
        CuentaCorriente unaCuentaCorriente = new CuentaCorriente(nroCuenta, personaTitular1, saldoCuentaCorriente);
        unaCuentaCorriente.mostrar();
        
        //depositos y extracciones
        /*System.out.println("Ingrese monto a depositar");
        Double importeDepositar = Double.parseDouble(ingreso.nextLine());
        unaCajaDeAhorro.depositar(importeDepositar);
        unaCajaDeAhorro.mostrar();
        
        System.out.println("Ingrese monto a retirar");
        Double importeRetirar = Double.parseDouble(ingreso.nextLine());
        unaCajaDeAhorro.extraer(importeRetirar);
        unaCajaDeAhorro.mostrar();
        */
        
        unaCuentaCorriente.depositar(500);
        unaCuentaCorriente.mostrar();
        unaCuentaCorriente.extraer(100);
        unaCuentaCorriente.mostrar();
        unaCuentaCorriente.extraer(900);
        unaCuentaCorriente.mostrar();
        unaCuentaCorriente.extraer(10000);
        
        
        /*
        unaCajaDeAhorro.depositar(500);
        unaCajaDeAhorro.mostrar();
        unaCajaDeAhorro.extraer(100);
        unaCajaDeAhorro.mostrar();
        unaCajaDeAhorro.extraer(50);
        unaCajaDeAhorro.extraer(50);
        unaCajaDeAhorro.extraer(50);
        unaCajaDeAhorro.mostrar();
        unaCajaDeAhorro.extraer(50);
        unaCajaDeAhorro.extraer(50);
        unaCajaDeAhorro.extraer(50); 
        unaCajaDeAhorro.extraer(50);
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.mostrar();
        unaCajaDeAhorro.extraer(20);
        unaCajaDeAhorro.mostrar();
        unaCajaDeAhorro.extraer(10);
        unaCajaDeAhorro.mostrar();
        */
        
       //mensaje si es dia de cumpleaños
       if(personaTitular1.esCumpleaños() == true){
           System.out.println("Feliz Cumpleaños");
       }
       
    
        
        
        
        
        
    }
}