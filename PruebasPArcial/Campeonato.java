
/**
 * Write a description of class CantidadIntegrantes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Campeonato
{
    private String nombre;
    private ArrayList<Equipo> listaEquipos;
    
    //(1..*)
    public Campeonato(String p_nombre, Equipo p_equipo){
        this.setNombre(p_nombre);
        this.setListaEquipos(new ArrayList<Equipo>());
        this.agregarEquipo(p_equipo);
    }
     //(*..n)
    public Campeonato(String  p_nombre, ArrayList<Equipo> p_listaEquipos){
        this.setNombre(p_nombre);
        this.setListaEquipos(p_listaEquipos);
    }
    
    private void setListaEquipos(ArrayList<Equipo> p_listaEquipos){
        this.listaEquipos = p_listaEquipos ;
    }
    public ArrayList<Equipo> getListaEquipos(){
        return this.listaEquipos ;
    }
    public boolean agregarEquipo(Equipo p_equipo){
        return this.listaEquipos.add(p_equipo);
    }
    public boolean quitarAtleta(Equipo p_equipo){
        return this.listaEquipos.remove(p_equipo);
    }
    
     public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void determinarGanador(){
        double ganador = 0.0;
        Equipo equipoGanador = null;
        for(Equipo unEquipo : getListaEquipos()){
            if(unEquipo.totalKilos() > ganador){
                ganador  = unEquipo.totalKilos();
                equipoGanador = unEquipo;
            }
        }
        if(equipoGanador != null){
               System.out.println(equipoGanador.getNombre() +"equipo ganador con " +equipoGanador.totalKilos() 
                                   +"kilos -> Equipo Gandor !! del " +this.getNombre());
            }else{
                System.out.println("No hay equipo ganador");
            }
         
    }
}