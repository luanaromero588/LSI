
/**
 * Clase que modela los información básica de una escuela
 * 
 * @author Romero Ingrid Luana 
 * @version 1
 */
public class Escuela
{
    private String nombre;
    private String domicilio;
    private String director;
    
    /**
     * Constructor que inicializa un objeto escuela son sus datos principales
     * @param p_nombre nombre de la escuela
     * @param p_domicilio domicilio de la escuela
     * @param p_director director de la escuela
     */
        public Escuela(String p_nombre, String p_domicilio, String p_director){
            this.setNombre(p_nombre);
            this.setDomicilio(p_domicilio);
            this.setDirector(p_director);
        }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    } 
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setDirector(String p_director){
        this.director = p_director;
    }
    
     public String getNombre(){
        return this.nombre;
    }
     public String getDomicilio(){
        return this.domicilio;
    }
     public String getDirector(){
        return this.director;
    }
    /**
    * Muestra por pantallas los datos basicos de escuela y docente
    */
      //atenta. recibe por parametro p_docente
    public void imprimirRecibo(Docente p_docente){
            System.out.println("Escuela: " +this.getNombre() +"\t" +"Domicilio: " +this.getDomicilio() +"\t" +"Director :" +this.getDirector());
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Docente: " +p_docente.getNombre() );
            System.out.println("Sueldo: " +p_docente.calcularSueldo() );
            System.out.println("Sueldo básico: " +p_docente.getSueldoBasico());
            System.out.println("Asignación familiar: " +p_docente.getAsignacionFamiliar() );  
    }
}