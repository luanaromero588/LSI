
/**
 * Subclase Elipse que extiende se la superclase figuraGeometrica y, a su vez, es superclase de circulo.
 * 
 * @author Romero Ingrid Luana
 * @version 1
 */
public class Elipse extends FiguraGeometrica{
  private double ejeMayor;
  private double ejeMenor;
  private Punto centro;
  
  public Elipse(double p_ejeMayor, double p_ejeMenor, Punto p_centro){
      super(p_centro);
      this.setEjeMayor(p_ejeMayor);
      this.setEjeMenor(p_ejeMenor);
      
  }
  
  private void setEjeMayor(double p_ejeMayor){
      this.ejeMayor = p_ejeMayor;
  }
  private void setEjeMenor(double p_ejeMenor){
      this.ejeMenor = p_ejeMenor;
  }
  
  private double getEjeMayor(){
      return this.ejeMayor;
  }
  private double getEjeMenor(){
      return this.ejeMenor;
  }

  private void setCentro(Punto p_centro){
      this.centro = p_centro;
  }
  public Punto getCentro(){
      return this.centro;
  }
  
  /**
    *Metodo publico,devuelve la palabra "Elipse"
    *@return devuelve un String
    */
  public String nombreFigura(){
      return "****** Elipse ******";
  }
  
  /**
     * Muestra caracteristicas de la elipse 
     */
  public void caracteristicas(){
      this.nombreFigura();
      System.out.println("Centro: " +"(" +this.getCentro().coordenadas() +")" +"-Semieje Mayor: " +this.getEjeMayor() +"-Semieje Menor: " +this.getEjeMenor());
        System.out.println("Superficie: " +this.superficie() );
  }
  /**
    *Calcula la superficie de elipse
    *@return devuelve un double
    */
  public double superficie(){
      return Math.round(Math.PI * this.ejeMayor * this.ejeMenor);
  }
  /**
  *Recibe 2 parametros y los utiliza para desplazar las coordenadas del origen de la elipse
  */
  public void desplazar(double p_dx, double p_dy){
      this.centro.desplazar(p_dx, p_dy);
  }
  /**
    *Calcula la distancia entre 2 elipses
    *@param Elipse otraElipse
    *@return devuelve un double
    */
  public double distanciaA(Elipse otraElipse){
      return this.centro.distanciaA(otraElipse.getCentro());
  }
  /**
    * Calcula cual es el rectangulo mayor
    * @param Rectangulo otroRectangulo
    * @return devuelve un Rectangulo
    */
  public Elipse elMayor(Elipse otraElipse){
      if( this.superficie() > otraElipse.superficie()){
            return this;
        }else {
            return otraElipse;
        }
  }
}