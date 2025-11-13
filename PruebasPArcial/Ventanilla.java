
/**
 * Write a description of class Ventanilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Ventanilla
{
    private String nombre;
    private ArrayList<Caja1> cajas;
    
    public Ventanilla(String p_nombre, Caja1 p_caja ){
        this.setNombre(p_nombre);
        this.setCajas(new ArrayList<Caja1> ());
        this.agregarCaja(p_caja);
    }
    // ----- Setters y Getters -----
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setCajas(ArrayList<Caja1> p_cajas){
        this.cajas = p_cajas;
    }

    public ArrayList<Caja1> getCajas(){
        return this.cajas;
    }
    
    // ----- Métodos para agregar y quitar -----
    public void agregarCaja(Caja1 p_caja){
        if(!this.getCajas().contains(p_caja)){
            this.getCajas().add(p_caja);
            System.out.println("Caja agregada correctamente.");
        } else {
            System.out.println("La caja ya está registrada.");
        }
    }
    public void quitarCaja(Caja1 p_caja){
        if(this.getCajas().size() > 1){
            this.getCajas().remove(p_caja);
            System.out.println("Caja eliminada correctamente.");
        } else {
            System.out.println("La caja no se encuentra registrada.");
        }
    }
    
    public void emitirInforme(){
        System.out.println("-------------------\n" +"***" +this.getNombre() +"***");
        for(Caja1 unaCaja : this.getCajas()){
            unaCaja.cerrarCaja();
        }
        System.out.println("-------------------\n" +"Total Recaudado: $" +calcularRecaudacionTotal());
    }
    public double calcularRecaudacionTotal(){
        double totalRecaudacion = 0.0;
        for(Caja1 unaCaja : this.getCajas()){
            totalRecaudacion = totalRecaudacion + unaCaja.calcularRecaudacion();
        }
        return totalRecaudacion;
    }
}