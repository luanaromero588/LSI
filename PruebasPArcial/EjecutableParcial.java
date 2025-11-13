
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
    unaC.registrarComprobante(new Viajero("555",50, new VisadoEspecial(50)), "diurno");
    
    Ventanilla vent1 = new Ventanilla("juan", unaC );
    Viajero viajeLimitrofe = new Viajero("432" , 50 , new Limitrofe(50));
    OficialMigraciones otroOf = new OficialMigraciones("PJ", "Alberto");
    Viajero viajeroNoLimitrofe = new Viajero("999", 50, new NoLimitrofe(50));
    vent1.agregarCaja(new Caja1(2, viajeLimitrofe, "diurno", unOf));
    vent1.agregarCaja(new Caja1(3, viajeroNoLimitrofe, "nocturno", otroOf));
    
    vent1.emitirInforme();
    System.out.println("****+++++++***********----------");
    for(Comprobante unCompro : unaC.getComprobantes()){
        unCompro.imprimir();
    }
    
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