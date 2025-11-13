
/**
 * Write a description of class Comprobante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Calendar;
public class Comprobante
{
    private Calendar fecha;
    private String turno;
    private double total;
    private Viajero viajero;
    
    public Comprobante(Calendar p_fecha, String p_turno, double p_total, Viajero p_viajero){
        this.setFecha(p_fecha);
        this.setTurno(p_turno);
        this.setViajero(p_viajero);
        this.setTotal(this.calcularTotal());
    }
    
    public Calendar getFecha() {
        return this.fecha;
    }
    public void setFecha(Calendar p_fecha) {
        this.fecha = p_fecha;
    }
    public String getTurno() {
        return this.turno;
    }
    public void setTurno(String p_turno) {
        this.turno = p_turno;
    }
    public double getTotal() {
        return this.total;
    }
    public void setTotal(double p_total) {
        this.total = p_total;
    }
    public Viajero getViajero() {
        return this.viajero;
    }
    public void setViajero(Viajero p_viajero) {
        this.viajero = p_viajero;
    }
      
    public double calcularTotal(){
        double tarifa = this.getViajero().calcularTarifa(this.getTurno());
        //this.setTotal(tarifa);
        //debo setear el total ya que si no lo hago,
        //cuando quiera usar getTotal me va a devolver 0.0
        return tarifa;
        //tener presente que no recibe nada.
    }
    public void imprimir(){
        System.out.println("--------------------------");
        System.out.println("Fecha: " +this.getFecha().get(Calendar.DATE) +"/" +(this.getFecha().get(Calendar.MONTH) + 1) //la suma en parentesis externo
                            +"/" +this.getFecha().get(Calendar.YEAR));
        System.out.println("Categoria: " +this.getViajero().getCategoria().descripcion());
        System.out.println("Documento: " +this.getViajero().getDocumento() +" -Turno: " +this.getTurno());
        System.out.println("Total: " +this.getTotal());
        System.out.println("--------------------------");
    }
    /*
    Debés usar `setTotal()` dentro del método `calcularTotal()` cuando el total se obtiene a partir de un cálculo interno 
    —por ejemplo, según el turno y la categoría del viajero—, ya que en ese caso el valor no existe hasta que se lo determina dentro de la clase.
    En cambio, si el total ya viene dado desde afuera (por ejemplo, si el usuario lo ingresa o el ejecutable lo pasa como dato fijo),
    no hace falta calcularlo ni setearlo internamente. 
    En resumen, si el total **se deriva** de otros atributos, lo seteás; si **ya está definido**, solo lo almacenás o usás directamente.
     */
    
}