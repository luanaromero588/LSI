
/**
 * La clase modela un circulo considerando las caracteristicas que lo define como ser  centro y radio. 
 * @author Romero Ingrid Luana
 * @version 2
 */
public class Circulo extends Elipse{
    private double radio;
    private Punto centro;
    
    /**
     * Constructor que inicializa el círculo con su radio y centro dados por parámetro.
     * @param p_radio radio del circulo
     * @param p_centro centro del circulo
     */
    public Circulo(double p_radio, Punto p_centro){
        super(p_radio, p_radio, p_centro );
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    public double getRadio(){
        return this.radio;
    }
    /**
     * Desplaza el círculo sin cambiar sus dimensiones
     * @param p_dx dezplazamiento del eje x
     * @param p_dy dezplamiento del eje y
     */
    public void desplazar(double p_dx, double p_dy){
        this.centro.desplazar(p_dx,p_dy); 
        //Al atributo centro , mandale el mensaje desplazar con los valores p_dx y p_dy".
    }
    
    /**
    *Metodo publico,devuelve la palabra "Circulo"
    *@return devuelve un String
    */
     public String nombreFigura(){
      return "****** Circulo ******";
    } 
    /**
     * Muestra caracteristicas del circulo 
     */
    public void caracteristicas(){
        this.nombreFigura();
        System.out.println("Centro: " +"(" +this.getCentro().coordenadas() +")" +"Radio: " +this.getRadio());
        System.out.println("Superficie: " +this.superficie() +"- Perimetro: " +this.perimetro());
    }
    
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    /**
     * Calcula la distancia entre el centro de este círculo y el centro de otro círculo pasado por parametro
     * @param otroCirculo  Otro objeto Circulo con el cual se  calcula la distancia
     * @return Distancia entre los centros de ambos círculos
     */
    public double distanciaA(Circulo otroCirculo){
        return this.centro.distanciaA(otroCirculo.centro);
    }
    /**
     * Determina cual de los dos circulos es el mayor en funcion de su superficie
     * @param otroCirculo otro objeto de tipo circulo con el cual se hace la comparacion
     * @return el circulo con mayor superficie
     */

    public Circulo elMayor(Circulo otroCirculo){
        if (super.superficie() > otroCirculo.superficie()){
            return this; //circulo que se esta ejcutando actualmente
        }else{
            return otroCirculo;// pide que devuelva el circulo no la superficie    
             }
    }
}