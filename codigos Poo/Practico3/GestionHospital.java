/**
 * Clase ejecutable 
 *
 * @author Romero Ingrid Luana 
 * @version 1
 */
import java.util.Scanner;
public class GestionHospital
{
    public static void main(String [] args) {
        Scanner ingreso = new Scanner(System.in);

        //Pido datos del hospital
        System.out.println("Ingrese nombre del hospital: ");
        String nombreHospital = ingreso.nextLine();
        System.out.println("Ingrese nombre del director del hospital: ");
        String direcHospital = ingreso.nextLine();
        Hospital unHospital = new Hospital(nombreHospital , direcHospital);
        
        //pido datos del paciente
        System.out.println("Ingrese numero de historia clinica del paciente: ");
        int histoClinica = Integer.parseInt(ingreso.nextLine());
        System.out.println("Ingrese nombre del paciente: ");
        String nombrePaciente = ingreso.nextLine();
        System.out.println("Ingrese localidad donde nacio el paciente: ");
        String localNacioPaciente = ingreso.nextLine();
        System.out.println("Ingrese provincia donde nacio el paciente: ");
        String provNacioPaciente = ingreso.nextLine();
        System.out.println("Ingrese domicilio del paciente: ");
        String domicilioPaciente = ingreso.nextLine();
        System.out.println("Ingrese localidad actual del paciente: ");
        String localVivePaciente = ingreso.nextLine();
        System.out.println("Ingrese provincia actual el paciente: ");
        String provVivePaciente = ingreso.nextLine();
        Paciente unPaciente = new Paciente(histoClinica, nombrePaciente, domicilioPaciente , new Localidad(localNacioPaciente,provNacioPaciente), new Localidad(localVivePaciente , provVivePaciente));
        
        System.out.println("*********Cadena localidad y provincia***********");
        System.out.println(unPaciente.getNacido().mostrar());
        System.out.println(unPaciente.getVive().mostrar());
        
        System.out.println("*********Datos paciente***********");
        unPaciente.mostrarDatosPantalla();
        System.out.println("*********Cadena de datos paciente***********");
        
        //cadena de datos paciente. retorna la cadena, por lo cual aca muestro por pantalla
        System.out.println(unPaciente.cadenaDeDatos());
        System.out.println("*********Datos filiatorios hospital***********");
        unHospital.consultaDatosFiliatorios(unPaciente);
    }
}
