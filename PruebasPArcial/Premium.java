
/**
 * Write a description of class Premium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Premium extends Etiqueta
{
    private int colores; 
    
    public Premium(double p_costo, int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }
    
    private void setColores(int p_colores){
        this.colores = p_colores;
    }
    public double getColores(){
        return this.colores;
    }
    
    public double precio(int q){
        return (super.getCosto() + (super.getCosto() * plus()) )* q;
    }
    
    private double plus(){
        if(this.getColores() == 0){
            return 0;
        }else if(this.getColores() == 2){
            return 0.05;
        }else if(this.getColores() == 3){
            return  0.07;
        }else{
            return  0.07 + (this.getColores() - 3) *  0.03 ;
        }
    }
    
    protected String tipo(){
        return " Premium " ;
    }
    
    public String toString(){
        return super.toString() +" -Colores: " +this.getColores();
    }
    
}