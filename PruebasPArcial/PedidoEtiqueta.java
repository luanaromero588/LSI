
/**
 * Write a description of class PedidoEtiqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class PedidoEtiqueta
{
  private ArrayList<Renglon> renglones;
  
  public PedidoEtiqueta(ArrayList<Renglon> p_renglones){
        this.setRenglones(p_renglones);
    }    
  public PedidoEtiqueta(Renglon p_renglon){
    this.setRenglones(new ArrayList<Renglon> ());
        this.agregarRenglon(p_renglon);
  }
  private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }

  public ArrayList<Renglon> getRenglones(){
        return this.renglones;
  } 
  public boolean agregarRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
  }
    
  public boolean quitarRenglon(Renglon p_renglon){
        return this.getRenglones().remove(p_renglon);
  }
  public int cantRenglones(){
        return this.getRenglones().size();
  }
  
  public void mostrar(){
         int i = 1;
        double importeTotal = 0.0;
        int totalEtiquetas = 0;
        System.out.println("Pedido\nCantidad de items: " +this.cantRenglones());
        for(Renglon unRenglon : getRenglones()){
            System.out.println("Item " +i );
            unRenglon.mostrar();
            System.out.println("Precio: $"+unRenglon.getItem().precio(unRenglon.getCantidad()));
            importeTotal =  importeTotal + unRenglon.getItem().precio(unRenglon.getCantidad());
            totalEtiquetas = totalEtiquetas + unRenglon.getCantidad();
        }
        System.out.println("--Total pedido: " +totalEtiquetas +"Etiquetas por un importe total de: $" +importeTotal);
  }
}