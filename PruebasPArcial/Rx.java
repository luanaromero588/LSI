
/**
 * Write a description of class Rx here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rx extends Atleta
{
    private int ringMuscleUps;
    
    public Rx(int p_identificador, String p_nombre, double p_kilos, int p_ringMuscleUps){
        super(p_identificador, p_nombre, p_kilos);
        this.setRingMuscleUps(p_ringMuscleUps);
    }
    
    private void setRingMuscleUps(int p_ringMuscleUps){
        this.ringMuscleUps = p_ringMuscleUps;
    }
    public int getRingMuscleUps(){
        return this.ringMuscleUps; 
    }
     public String imprimirTipo(){
         return "(Rx)";
     }
     public String mostrarDatos(){
         return (super.mostrarDatos() +"**- Rx realizados: " +this.getRingMuscleUps() +" " +this.imprimirTipo() +"\n");
     }
}    