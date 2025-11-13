
/**
 * Write a description of class EjecutablePedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EjecutablePedido
{
    public  static void  main(String [] args){
        //creo los congelados
        Postre unPostre = new Postre(15.00 , "Postre", true);
        Postre secondPostre = new Postre(15.00 , "Postre", false);
        Paleta unaPaleta = new Paleta(10.00 , "Paleta", 0);
        Paleta otraPaleta = new Paleta(10.00 , "Paleta", 1);
        
        //creo los renglones con los congelados
        RenglonPedido unRenglon = new RenglonPedido(85, unPostre);
        RenglonPedido secondRenglon = new RenglonPedido(65, secondPostre);
        RenglonPedido thirdRenglon = new RenglonPedido(68, unaPaleta);
        RenglonPedido fortyRenglon = new RenglonPedido(25, otraPaleta);
        
        //creo el arraylist
        Pedido unPedido = new Pedido(unRenglon);
        unPedido.agregarRenglon(secondRenglon);
        unPedido.agregarRenglon(thirdRenglon);
        unPedido.agregarRenglon(fortyRenglon);
        
        //creo los congelados del segundo pedido
        Postre postre2 = new Postre(15.00 , "Postre", true);
        Paleta unaPaleta2 = new Paleta(10.00 , "Paleta", 0);
        Paleta otraPaleta2 = new Paleta(10.00 , "Paleta", 1);
        
        //creo los renglones con los congelados
        RenglonPedido renglon2 = new RenglonPedido(15, unPostre);
        RenglonPedido thirdRenglon2 = new RenglonPedido(18, unaPaleta);
        RenglonPedido fortyRenglon2 = new RenglonPedido(45, otraPaleta);
        
        //creo el arraylist
        Pedido secondPedido = new Pedido(renglon2);
        secondPedido.agregarRenglon(thirdRenglon2);
        secondPedido.agregarRenglon(fortyRenglon2); 
        
        System.out.println("Primer detall\n");
        unPedido.mostrar();
        
        
        System.out.println("segundo detall\n");
        unPedido.mostrar();
       
    }
}