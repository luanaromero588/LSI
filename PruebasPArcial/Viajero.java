
/**
 * Write a description of class Viajero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Viajero
{
    private String documento;
    private double tarifaBase;
    private CategoriaViajero categoria;
    
    public Viajero(String p_documento, double p_tarifaBase, CategoriaViajero p_categoria){
        this.setDocumento(p_documento);
        this.setTarifaBase(p_tarifaBase);
        this.setCategoria(p_categoria);
    }
    
    public String getDocumento() {
        return this.documento;
    }
    
    public void setDocumento(String p_documento) {
        this.documento = p_documento;
    }
    
    public double getTarifaBase() {
        return this.tarifaBase;
    }
    
    public void setTarifaBase(double p_tarifaBase) {
        this.tarifaBase = p_tarifaBase;
    }

    public CategoriaViajero getCategoria() {
        return this.categoria;
    }
    public void setCategoria(CategoriaViajero p_categoria) {
        this.categoria = p_categoria;
    }
    
    public double calcularTarifa(String p_turno){
        double total = this.getTarifaBase() * this.getCategoria().multiplicadorCategoria();
        if(p_turno.equalsIgnoreCase("Nocturno")){
            return total = total + (total * 0.20); 
        }
        return total;
    }
    
    

}