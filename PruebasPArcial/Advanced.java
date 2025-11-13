
/**
 * Write a description of class Advanced here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advanced extends Atleta
{
    private int barMuscleUps;
    
    public Advanced(int p_identificador, String p_nombre, double p_kilos, int p_barMuscleUps ){
        super(p_identificador, p_nombre, p_kilos);
        this.setBarMuscleUps(p_barMuscleUps);
    }
    
    private void setBarMuscleUps(int p_barMuscleUps){
        this.barMuscleUps = p_barMuscleUps;
    }
    public int getBarMuscleUps(){
        return this.barMuscleUps;
    }
    
    public String imprimirTipo(){
        return "(Advanced)";
    }
    public String mostrarDatos(){
        return (super.mostrarDatos() +"** _ Bar Muscle Ups realizados: " +this.getBarMuscleUps() +" " +this.imprimirTipo() +"\n");
    }
}