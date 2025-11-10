
/**
 * 
 * @author Romero Ingrid Luana
 * @version 1
 * ***interface solo define comportamiento no lo implementa***
 * ***la clase se compromete a implementar comportamineto . arraylist implementa una lista.
 */
public class Rectangulo extends FiguraGeometrica
{
    private Punto origen;
    private double ancho;
    private double alto;
    /**
     * Constructor que inicializa el rectangulo con un origen, ancho y alto.
     * @param p_origen Punto que representa el origen del rectángulo
     * @param p_ancho  Ancho del rectángulo
     * @param p_alto   Alto del rectángulo
     */
        public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
            super(p_origen);
            this.setAncho(p_ancho);
            this.setAlto(p_alto);
    }
    /**
     * Constructor que crea un rectángulo cuyo origen está situado en el punto (0, 0).
     * @param p_ancho Ancho del rectángulo
     * @param p_alto  Alto del rectángulo
     */
        public Rectangulo(double p_ancho, double p_alto){
            super(new Punto(0,0));
            this.setAncho(p_ancho);
            this.setAlto(p_alto);
    }
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }

    /**
     * Desplaza el origen del rectangulo sin cambiar sus dimensiones 
     * @param p_dx dezplazamiento del eje x
     * @param p_dy dezplamiento del eje y
     */
    public void desplazar(double p_dx, double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }
    
    public void caracteristicas(){
        System.out.println("****** Rectangulo ******");
        System.out.println("Origen: " +"(" +this.getOrigen().coordenadas() +")" +"-Alto: " +this.getAlto() +"-Ancho: " +this.getAncho());
        System.out.println("Superficie: " +this.superficie() +"- Perimetro: " +this.perimetro());
    }
    //Perímetro = 2 × (largo + ancho). 
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    //Área = base × altura. 
    public double superficie(){
        return Math.round(this.getAncho() * this.getAlto());
    }
    /**
     *Calcula la distancia entre el origen de este rectangulo y el origen de otro rectangulo pasado por parametro
     * @param otroRectangulo  Otro objeto Rectangulo con el cual se calcula la distancia
     * @return Distancia entre los origenes de ambos rectangulos
     */
    public double distanciaA(Rectangulo otroRectangulo){
        return this.origen.distanciaA(otroRectangulo.getOrigen());
    }
    /**
     * Calcula cual es el mayor entre los dos rectangulos en funcion de su superficie
     * @param otroRectangulo otro objeto de tipo Rectangulo con el cual se hace la comparacion
     * return el rectangulo de mayor superficie
     */
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if( this.superficie() > otroRectangulo.superficie()){
            return this;
        }else {
            return otroRectangulo;
        }
    }
    
    /**
     * Nombre figura
     */
    public String nombreFigura(){
        return "****** Rectangulo ******";
    }
    
}