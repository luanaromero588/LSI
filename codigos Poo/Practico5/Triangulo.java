
/**
 * Sublcase triangulo extiende de FiguraGeometrica
 * 
 * @author Romero Ingrid Luana
 * @version 10-10-2025
 */
public class Triangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    public Triangulo(double p_base, double p_altura, Punto p_origen){
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    private void setBase(double p_base){
        this.base = p_base;
    }
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    
    /**
    *Devuelve la palabra "Triangulo"
    *@return devuelve un String
    */
    public String nombreFigura(){
        return "****** Triangulo ******";
    }
    /**
    *Calcula la superficie del triangulo
    *@return devuelve un double
    */
    public double superficie(){
        return Math.round((base * altura) / 2); 
    }
}