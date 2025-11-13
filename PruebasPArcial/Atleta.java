
/**
 * Write a description of class Atleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Atleta
{
    private int identificador;
    private String nombre;
    private double kilos;
    
    public Atleta(int p_identificador, String p_nombre, double p_kilos){
        this.setIdentificador(p_identificador);
        this.setNombre(p_nombre);
        this.setKilos(p_kilos);
    }
    
      // Getter y Setter para identificador
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    // Getter y Setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para kilos
    public double getKilos() {
        return kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }
    
    public abstract String imprimirTipo();
    public String mostrarDatos(){
        return ("Atleta: " +this.getIdentificador() +"-" +this.getNombre() +"- kilos motivos: "
                +this.getKilos());     
    }
}