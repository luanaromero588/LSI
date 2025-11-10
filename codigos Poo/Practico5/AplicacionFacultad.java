/**
 * 
 * @author Romero Ingrid Luana 
 * @version 1- 30/09/2025
 */
import java.util.*;
public class AplicacionFacultad{
    public static void main(String [] args){
      ArrayList listaCargos = new ArrayList();
        
        Cargo primerCargo = new Cargo("Jefe de Cátedra-Poo",800,2013,10);
        SemiExclusivo primerCargoSemiExclusivo = new SemiExclusivo("Titular-TFA",1400,2011,20,0);
        Cargo segundoCargo = new Cargo("JTP-Analisis de Sistemas",800,2003,10);
        
        listaCargos.add(primerCargo);
        listaCargos.add(primerCargoSemiExclusivo);
        listaCargos.add(segundoCargo);
        
        Profesor unProfesor = new Profesor(42735725,"Juan","Perez",1987,"Lic. en Sistemas de Informacion",listaCargos);
        
        Cargo tercerCargo = new Cargo("Profesor Visitante",1200,2012,10);
        Exclusivo unCargoExclusivo = new Exclusivo("JTP-Ing.Soft",1800,2013,10,20,10);
        ArrayList otraListaCargos = new ArrayList();
        otraListaCargos.add(tercerCargo);
        otraListaCargos.add(unCargoExclusivo);
        
        Profesor otroProfesor = new Profesor(18335725,"Carlos","Fernandez",1993,"Lic. en Sistemas de Informacion",otraListaCargos);
        
        ArrayList<Profesor> listaProfesores = new ArrayList();
        listaProfesores.add(unProfesor);
        listaProfesores.add(otroProfesor);
        
        Facultad unaFacultad = new Facultad("Universidad Nacional del Nordeste",listaProfesores);
        
        unaFacultad.nominaProfesores();
        unaFacultad.listarProfesorCargos();
     }
    }     