
/**
 * Write a description of class Scaled here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scaled extends Atleta
{
    private int pullUps;
    
    public Scaled(int p_identificador, String p_nombre, double p_kilos, int p_pullUps){
        super(p_identificador, p_nombre, p_kilos);
        this.setPullUps(p_pullUps);
    }
    
    private void setPullUps(int p_pullUps){
        this.pullUps = p_pullUps ;
    }
    public int getPullUps(){
        return this.pullUps; 
    }
     public String imprimirTipo(){
         return "(Scaled)";
    }
    public String mostrarDatos(){
         return (super.mostrarDatos() +"**- Pullsups realizadps: " +this.getPullUps() +" " +this.imprimirTipo() +"\n");
    }
}