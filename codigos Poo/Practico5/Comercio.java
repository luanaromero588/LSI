import java.util.Scanner;
import java.util.ArrayList;

public class Comercio
{
    public static void main(String[] args){
        Scanner ingreso = new Scanner(System.in);
        int opcion = -1;
        //creo un ArrayList como catalogo de artefactos
        ArrayList<ArtefactoHogar> listaArtefactos = new ArrayList();
        crearArtefactos(listaArtefactos);
        System.out.println("***Consulta de artefactos Hogar***");
        while(opcion != 0){
            System.out.println("\n1-Consultar cocina, 2-Consultar lavarropa,3-Consultar Heladera, 4-Mostrar artefactos");
            System.out.println("Ingrese una opcion(0 para salir):");
            opcion = Integer.parseInt(ingreso.nextLine());
    
            switch(opcion){
                case 1:
                    System.out.println("Elija la opcion: 1-Cocina con 4 hornallas 2-Cocina con 2 hornallas" );
                    if(Integer.parseInt(ingreso.nextLine()) == 1) {
                        consultarCredito(listaArtefactos.get(0), ingreso);
                    }
                    else {
                        consultarCredito(listaArtefactos.get(1), ingreso);
                    }
                    break;
                case 2:
                     System.out.println("Elija la opcion: 1-Lavarropas automatico 2-Lavarropas no automatico" );
                    if(Integer.parseInt(ingreso.nextLine()) == 1) {
                        consultarCredito(listaArtefactos.get(4), ingreso);
                    }
                    else {
                        consultarCredito(listaArtefactos.get(5), ingreso);
                    }
                    break;
                case 3:
                    System.out.println("Elija la opcion: 1-Heladera con compresor 2-Heladera sin compresor");
                    if(Integer.parseInt(ingreso.nextLine()) == 1) {
                        consultarCredito(listaArtefactos.get(2), ingreso);
                    }
                    else {
                        consultarCredito(listaArtefactos.get(3), ingreso);
                    }
                    
                    break;
                case 4:
                    System.out.println("\n ****Catalogo de Artefactos****");
                    for(ArtefactoHogar unArtefacto: listaArtefactos){
                        unArtefacto.imprimir();
                    }
                    break;
            }
        }
    }
    //creo los artefactos estaticamente
    public static void crearArtefactos(ArrayList<ArtefactoHogar> p_artefactos){
        Cocina C1 = new Cocina(4, 5000, "60x60" , "Candor", 250000, 4);
        p_artefactos.add(C1);
        Cocina C2 = new Cocina(2, 2500, "30x30" , "Whirlpool", 150000, 2); 
        p_artefactos.add(C1);
        
        Heladera H1 = new Heladera(4, 2, true , "Patrick", 1500000, 4);
        p_artefactos.add(H1);
        Heladera H2 = new Heladera(2, 1, false , "Gafa", 890000, 5); 
        p_artefactos.add(H1);
        
        Lavarropas L1 = new Lavarropas(10, 7.5f, true, "Next", 400000, 5);
        p_artefactos.add(L1);
        Lavarropas L2 = new Lavarropas(8, 5.5f, false, "Dream", 200000, 6); 
        p_artefactos.add(L1);
    }
    
     public static void consultarCredito(ArtefactoHogar p_artefacto, Scanner p_ingreso) {
        System.out.println("\n***Consulta de credito***");
        System.out.print("Ingrese la cantidad de cuotas: ");
        int cuotas = Integer.parseInt(p_ingreso.nextLine());
        System.out.print("Ingrese el porcentaje de interes: ");
        float interes = Float.parseFloat(p_ingreso.nextLine());
        
        float cuotaValor = p_artefacto.creditoConAdicional(cuotas, interes);
        
        p_artefacto.imprimir();
        System.out.println("Cuotas: " + cuotas + " - Interes: " +
                        interes + "%");
        System.out.printf("Valor Cuota: $%.2f\n", p_artefacto.cuotaCredito(cuotas, interes));
        System.out.println("Valor Cuota Con Adicionales: $" + cuotaValor);
    }
}
