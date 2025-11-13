
/**
 * Write a description of class EjecutableParcial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutableParcial
{   
    public static void main(String [] args){
    
    OficialMigraciones unOf = new OficialMigraciones("usuario1", "juan");
    Viajero viajeNacional1 = new Viajero("1234", 50,new Nacional(50));
    Caja1 unaC = new Caja1( 1, viajeNacional1, "Nocturno" , unOf) ; 
    
    Ventanilla vent1 = new Ventanilla("juan", unaC );
    Viajero viajeLimitrofe = new Viajero("432" , 50 , new Limitrofe(50));
    vent1.agregarCaja(new Caja1(2, viajeLimitrofe, "diurno", unOf)); 
    
    vent1.emitirInforme();
    
    /*
     * si el caso es(0...*)
     * OficialMigraciones unOf = new OficialMigraciones("usuario1", "juan");
    
    Viajero viajeNacional1 = new Viajero("1234", 50, new Nacional(50));
    Caja1 unaC = new Caja1(1, viajeNacional1, "Nocturno", unOf);
    
    Ventanilla vent1 = new Ventanilla("juan"); // ✅ sin caja al inicio
    vent1.agregarCaja(unaC); // la agregás después
    
    Viajero viajeLimitrofe = new Viajero("432", 50, new Limitrofe(50));
    vent1.agregarCaja(new Caja1(2, viajeLimitrofe, "diurno", unOf)); 
    
    vent1.emitirInforme();

     */
    }
}