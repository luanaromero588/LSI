
/**
 * SuperClase FiguraGeometrica que modela estructura y comportamiento a sus subclases figuras.
 * 
 * @author Romero Ingrid Luana
 * @version 10-10-2025
 */
public abstract class FiguraGeometrica{
    private Punto origen;
    
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    
    /**
    * Metodos Abstractos
    */
    public abstract String nombreFigura();
    
    public abstract double superficie();
    
    public void mostrarSuperficie(){
        System.out.println("***"+this.nombreFigura()+"***");
        System.out.println("Superficie:"+this.superficie());
    }
    
}