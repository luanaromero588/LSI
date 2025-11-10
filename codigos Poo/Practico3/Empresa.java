/**
 * @author Romero Ingrid Luana
 * @version 1
 */
import java.util.Calendar;
public class Empresa
{
    public static void main(String[] args){
    Calendar fechaIngreso = Calendar.getInstance();
    fechaIngreso.set(2002,9,6);
    Empleado unEmpleado = new Empleado(12345,"Ignacio","Lopez",3000,fechaIngreso);
    unEmpleado.mostrar();
    if(unEmpleado.esAniversario()){
        System.out.println("Hoy es su aniversario! Tiene permitido salir 1 hora antes.");            
     }
    
    }
}