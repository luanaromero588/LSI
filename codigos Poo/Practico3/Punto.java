
/**
 * La clase Punto modela un punto en el plano cartesiano con coordenadas x e y.
 * Permite crear puntos, desplazar su posición, mostrar sus coordenadas y obtenerlas en forma de cadena.
 * 
 * @author Romero Ingrid Luana
 * @version 1.0 - 2025-08-19
 */
public class Punto
{
    private double x;
    private double y;
    
    /**
     * Constructor sin parametros que sitúa el punto en el origen
     */
    public Punto (){
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Constructor que recibe las coordenadas X e Y del punto concreto
     * @param p_x Coordenada x inicial
     * @param p_y Coordenada y inicial
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    //setters
    private void setX(double p_x){
        this.x = p_x ;
    }
    private void setY(double p_y){
        this.y = p_y ;
    }
    
    //getters
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
   
    /**
     * Calcula la distancia entre dos objetos
     * @param p_ptoDistante
     */
    public double distanciaA(Punto p_ptoDistante){
        //unpunto recibe thisx
        double resultX = p_ptoDistante.getX() - this.getX(); //trae coordenada x del objeto punto que recibi como parametro.
        double resultY = p_ptoDistante.getY() - this.getY(); //Trae la coordenada Y del objeto actual (el que está ejecutando el método).
        //this en ese momento ex x2,
        return Math.sqrt ( Math.pow (resultX,2) + Math.pow(resultY,2));
    }
    
     /**
     * Desplaza el punto sumando valores a sus coordenadas actuales.
     * (x+dx, y+dy)
     * @param p_dx Incremento en la coordenada x
     * @param p_dy Incremento en la coordenada y
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra las coordenadas del punto.
     */
    public void mostrar(){
        System.out.println("Punto.X: " +this.getX() +", Y:" +this.getY() +"\n"); 
    }
    
    /**
     * Devuelve las coordenadas del punto en forma de cadena.
     * 
     * @return Cadena con el formato "(x,y)".
     */
    public String coordenadas(){
        return "(" +this.getX() +"," +this.getY() +")";  
    }
    
    
    
}