
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Pedido
{
    private ArrayList<RenglonPedido> listaRenglones;
    
    public Pedido(RenglonPedido p_RPedido){
        this.setListaRenglones(new ArrayList<RenglonPedido>());
        this.agregarRenglon(p_RPedido);
    }
    public Pedido(ArrayList<RenglonPedido> p_listaPedidos){
        this.setListaRenglones(p_listaPedidos);
    }
    
    private void setListaRenglones(ArrayList<RenglonPedido> p_renglonP){
        this.listaRenglones = p_renglonP ;
    }
    private ArrayList<RenglonPedido> getListaRenglones(){
        return this.listaRenglones;
    }
    
    public boolean agregarRenglon(RenglonPedido p_renglonP){
        return this.listaRenglones.add(p_renglonP);
    }
    public boolean quitarRenglon(RenglonPedido p_renglonP){
        return this.listaRenglones.remove(p_renglonP);
    }
    
    
    public double importe(){
        double total = 0.0;
        
        for(RenglonPedido unRenglon : getListaRenglones()){
            total = total + unRenglon.importe() ;
        }
        
        if( total < 500){
            return total = total + (total * 0.10);
        }else{
            return total;
        }
        
    }
    
    public void mostrar(){
        int i = 1;
        double subTotal = 0.0;
        System.out.println("----------------- Detalle Pedido ---------------");
        for(RenglonPedido unRenglon : getListaRenglones()){
            System.out.println( i +". " +unRenglon.toString() );
            subTotal = subTotal + unRenglon.importe();
            i++;
        }
        System.out.println("------------------------------");
        System.out.println("Sub-Total: " +subTotal);
        System.out.println("------------------------------");
        System.out.println("Total: " +this.importe());
        
    }
    
    
}