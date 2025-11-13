
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Equipo
{
    private String nombre;
    private String procedencia;
    private ArrayList<Atleta> listaAtletas ;
    
    //(1..*)
    public Equipo(String  p_nombre, String p_procedencia, Atleta p_atleta){
        this.setNombre(p_nombre);
        this.setProcedencia(p_procedencia);
        this.setListaAtletas(new ArrayList<Atleta> () );
        this.añadirAtleta(p_atleta);
    }
    //(*..n)
    public Equipo(String  p_nombre, String p_procedencia, ArrayList<Atleta> p_listaAtletas){
        this.setNombre(p_nombre);
        this.setProcedencia(p_procedencia);
        this.setListaAtletas(p_listaAtletas);
    }
    
    private void setListaAtletas(ArrayList<Atleta> p_listaAtletas){
        this.listaAtletas = p_listaAtletas ;
    }
    public ArrayList<Atleta> getListaAtletas(){
        return this.listaAtletas ;
    }
    public boolean añadirAtleta(Atleta p_atleta){
        return this.listaAtletas.add(p_atleta);
    }
    public boolean quitarAtleta(Atleta p_atleta){
        return this.listaAtletas.remove(p_atleta);
    }
    
     public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para procedencia
    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
    public void listarEquipo(){
        System.out.println("*****Detalle***** \n ");
        for(Atleta unAtleta : getListaAtletas()){
            System.out.println(unAtleta.mostrarDatos());
        }
    }
    
    public void mostrar(){
        System.out.println("Nombre del equipo: " +this.getNombre() +"\n" +"Procedencia: " +this.getProcedencia());
        this.listarEquipo(); 
        System.out.println("Cantidad de integrantes: " + this.cantidadIntegrantes() +"\n Puntaje total del equipo: " +this.totalKilos());
    }
    
    public double totalKilos(){
        double kilos = 0.0;
        for(Atleta unAtleta : getListaAtletas()){
            kilos = kilos + unAtleta.getKilos();
        }
        return kilos;
    }
    public int cantidadIntegrantes(){
        return this.getListaAtletas().size();
    }
}