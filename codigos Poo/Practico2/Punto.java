
/**
 * La clase Punto modela un punto en el plano cartesiano con coordenadas x e  y.
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
        x = 0;
        y = 0;
    }
    /**
     * Constructor que recibe las coordenadas X e Y del punto concreto
     * @param p_x Coordenada x inicial
     * @param p_y Coordenada y inicial
     */
    public Punto(double p_x, double p_y){
        setX(p_x);
        setY(p_y);
    }
    
     /**
     * Desplaza el punto sumando valores a sus coordenadas actuales.
     * 
     * @param p_dx Incremento en la coordenada x
     * @param p_dy Incremento en la coordenada y
     */
    public void desplazar(double p_dx, double p_dy){
        setX(getX() + p_dx);
        setY(getY() + p_dy);
    }
    
    /**
     * Muestra las coordenadas del punto.
     */
    public void mostrar(){
        System.out.println("Punto.X: " +getX() +", Y:" +getY() +"\n"); 
    }
    
    /**
     * Devuelve las coordenadas del punto en forma de cadena.
     * 
     * @return Cadena con el formato "(x,y)".
     */
    public String coordenadas(){
        return "(" +getX() +"," +getY() +")"; //sin el + antes del primer get. +getX(); NO
    }
    
    //setters
    private void setX(double p_x){
        x = p_x ;
    }
    private void setY(double p_y){
        y = p_y ;
    }
    
    //getters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
}