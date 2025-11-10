
/**
 * Clase que modela un pedido
 * 
 * @author Romero Ingrid Luana
 * @version 1. 17/10/2025
 */
import java.util.*;
public class Pedido
{
    private ArrayList<Renglon> renglones;
    
    /**
    *Constructor con parametros, instancia un objeto de la clase con una coleccion de renglones (*...n)
    *@param ArrayList<Renglon> p_renglones
    */
    public Pedido(ArrayList<Renglon> p_renglones){
        this.setRenglones(p_renglones);
    }
        
    /**
    *Constructor con parametros, instancia un objeto de la clase con un renglon inicial (1...*)
    *@param Renglon p_renglon
    */
    public Pedido(Renglon p_renglon){
        this.setRenglones(new ArrayList<Renglon> ());
        this.agregarRenglon(p_renglon);
    }
    
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }

    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    /**
     * Metodo publico, permite agregar un renglon a la lista de renglones
     * @param Renglon p_renglon
     * @return devuelve un boolean
    */
    public boolean agregarRenglon(Renglon p_renglon){
        return this.getRenglones().add(p_renglon);
    }
    
    /**
     * Metodo publico, permite quitar un renglon de la lista de renglones
     * @param Renglon p_renglon
     * @return devuelve un boolean
    */
    public boolean quitarRenglon(Renglon p_renglon){
        if(this.cantRenglones() > 1){
            return this.getRenglones().remove(p_renglon);
        }
        return false;
    }
    
    /**
     * Metodo publico, devuelve el tamaño de la lista
     * @return devuelve un int
    */
    public int cantRenglones(){
        return this.getRenglones().size();
    }
    
    /**
     * Metodo publico, muestra por pantalla los datos del pedido
    */
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
            i++;
        }
        System.out.println("--Total pedido: " +totalEtiquetas +"Etiquetas por un importe total de: $" +importeTotal);
    }
}