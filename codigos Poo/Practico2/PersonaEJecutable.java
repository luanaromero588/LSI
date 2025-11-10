
/**
 * Clase ejecutable que permite probar la clase Persona.
 *
 * Crea varios objetos Persona con datos estaticos, muestra información completa de algunos de ellos, y permite acceder
 * a atributos específicos como nombre, apellido, DNI y edad.
 * 
 * 
 * @author Romero Ingrid Luana 
 * @author Ortellado Luciana
 * @version 1.0 - 2025-08-20
 */
public class PersonaEJecutable
{
    /**
     * Método principal que ejecuta la aplicación.
     * 
     * Crea tres objetos Persona con datos predeterminados, muestra los datos completos de uno, el nombre y apellido de otro,
     * y el DNI y edad de un tercero.
     */
    public static void main(String [] args){
        //Construccion del objeto persona. 
        Persona persona1 = new Persona (12345678, "juan", "Perez", 2002);
        Persona persona2 = new Persona (87654321, "Emanuel", "Ortega", 1990);
        Persona persona3 = new Persona (14237683, "Esteban", "Quito", 1963);
        
        //Muestra los datos del objeto persona1
        System.out.println("Datos de persona1: ");
        persona1.mostrar();
        
        //Imprime nombre y apellido de persona2
        System.out.println("Datos de persona2: ");
        System.out.println("Nombre y apellido: " +persona2.getNombre() +" " +persona2.getApellido()); 
        
        //Imprime dni y edad de persona3
        System.out.println("Datos de persona3: ");
        System.out.println("DNI: " +persona3.getDNI() +"\t" +"Edad:" +persona2.edad());
        
    }
}