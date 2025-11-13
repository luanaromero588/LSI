
/**
 * Write a description of class Caja1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.ArrayList;
public class Caja1
{
    private int nroDeCaja;
    private ArrayList<Comprobante> comprobantes;
    private OficialMigraciones oficial;
    
    //(1...*)
    public Caja1(int p_nroDeCaja, Viajero p_viajero, String p_turno, OficialMigraciones p_oficial){
        this.setNroDeCaja(p_nroDeCaja);
        this.setComprobantes(new ArrayList<Comprobante> ());
        this.registrarComprobante(p_viajero, p_turno);
        this.setOficialMigraciones(p_oficial);
    }
    //(*...n)
    public Caja1(int p_nroDeCaja, ArrayList<Comprobante> p_comprobantes, OficialMigraciones p_oficial){
        this.setNroDeCaja(p_nroDeCaja);
        this.setComprobantes(p_comprobantes);
        this.setOficialMigraciones(p_oficial);
    }
    
    private  void setComprobantes(ArrayList<Comprobante> p_comprobantes){
        this.comprobantes = p_comprobantes;
    }
    public ArrayList<Comprobante> getComprobantes(){
        return this.comprobantes;
    }
    //
    public void registrarComprobante(Viajero p_viajero, String p_turno){
        Calendar fecha = Calendar.getInstance();
        double total = p_viajero.calcularTarifa(p_turno);
        Comprobante unC = new Comprobante(fecha, p_turno, total, p_viajero);
        this.agregarComprobante(unC);
        System.out.println("Comprobante agregado");
        
    }
   
    public void agregarComprobante(Comprobante p_comprobante){
            this.getComprobantes().add(p_comprobante);
    }
    
    public boolean quitarComprobante(Comprobante p_comprobante){
        if(this.getComprobantes().size() > 1){
            return this.getComprobantes().remove(p_comprobante);
        }
        return false;
    }
    
    private void setOficialMigraciones(OficialMigraciones p_oficial){
        this.oficial = p_oficial;
    }
    public OficialMigraciones getOficial(){
        return oficial; 
    }
    
    private void setNroDeCaja(int p_nroDeCaja){
        this.nroDeCaja = p_nroDeCaja;
    }
    public int getNroDeCaja(){
        return this.nroDeCaja;
    }
    
    
    public double calcularRecaudacion(){
        double totalRecaudacion = 0.0;
        for(Comprobante unC : this.getComprobantes()){
            totalRecaudacion = totalRecaudacion + unC.calcularTotal();
        }
        return totalRecaudacion; 
    }
    public double calcularPromedioRecaudacion(){
        double totalPromedio = (this.calcularRecaudacion() / this.getComprobantes().size());
        return totalPromedio;
    }
    public void contarViajeroPorCategoria(){
        int nacional = 0, limitrofe = 0, noLimitrofe = 0, visadoEspecial = 0;
        for(Comprobante unC : this.getComprobantes()){
            //el profe se ahorro codigo y creo el string:
            //String tipoCategoria = unC.getViajero().getCategoria().tipoCategoria()
            //luego if(tipoCategoria.equalsIgnoreCase("nacional")); me ahorro escribir tanto
            if(unC.getViajero().getCategoria().tipoCategoria().equalsIgnoreCase("Nacional")){
                nacional ++;
            }else if(unC.getViajero().getCategoria().tipoCategoria().equalsIgnoreCase("Limitrofe")){
                limitrofe ++;
            }else if(unC.getViajero().getCategoria().tipoCategoria().equalsIgnoreCase("No limitrofe")){
                noLimitrofe++;
            }else if(unC.getViajero().getCategoria().tipoCategoria().equalsIgnoreCase("Visado Especial")){
                visadoEspecial++;
            }
        }
        System.out.println("-Pasajeros Nacionales: " +nacional +"\n" 
                            +"-Pasajeros Extranjeros Limítrofes: " +limitrofe +"\n"
                            +"-Pasajeros Extranjeros No Limítrofes: " +noLimitrofe +"\n"
                            +"-Pasajeros con Visado Especial: " +visadoEspecial );
    }
    
    public void cerrarCaja(){
        System.out.println("Recaudacion: $" +calcularRecaudacion() +"\n" +"Caja N°: " +this.getNroDeCaja());
        System.out.println(this.getOficial().toString() +"\n");
        this.contarViajeroPorCategoria();
        System.out.println("\n-Promedio de recaudación: $" +calcularPromedioRecaudacion() );
    }
    
}