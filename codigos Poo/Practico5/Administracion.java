/**
 * Ejecutable que administra la instanciacion de figuras geometricas, la cantidad d m2 a pintar.
 * @author Romero Ingrid Luana 
 * @version 1- 10/10/2025
 */
import java.util.Scanner;
import java.util.Calendar;
public class Administracion{
    public static void main(String [] args){
      Scanner ingreso = new Scanner(System.in);
      FiguraGeometrica figura = null;
      
      System.out.println("***Ingrese nombre de jardin***");
      String nomJardin = ingreso.nextLine();
      Jardin unJardin = new Jardin(nomJardin);
    
      int opcion = -1;
      
      
      while(opcion != 0){
          System.out.println("\n1-Ingresar figuras a pintar \n2-Mostrar superfiecie de figuras \n3-Mostrar detalles ");
          System.out.println("Ingrese una opcion(0 para salir): \n");
          opcion = Integer.parseInt(ingreso.nextLine());
          switch(opcion){
              case 1:
                 figura = crearFigura(); 
                 if(figura != null){
                    unJardin.añadirFigu(figura);
                    System.out.println("Figura agregada al jardín con éxito");
                 }
              break;
              case 2:
                if(unJardin != null && unJardin.getListaFiguras().size() > 0){
                    for(FiguraGeometrica fig : unJardin.getListaFiguras()){
                        fig.mostrarSuperficie();  
                    }
                } else {
                    System.out.println("***No hay figuras en el jardín***");
                }
                break;
              case 3:
                if(unJardin != null ){
                    unJardin.detalleFiguras();
                } else {
                    System.out.println("***No existe ningun Jardín***");
                }  
              break;
          }
      }
    }
   
    public static FiguraGeometrica crearFigura(){
       
        Scanner ingreso1 = new Scanner(System.in);
        FiguraGeometrica figura = null;
         
        System.out.println("***Crea tu figura geometrica***");
        
        System.out.print("Ingrese coordenada X del centro: ");
        double x = Double.parseDouble(ingreso1.nextLine());
        System.out.print("Ingrese coordenada y del centro: ");
        double y = Double.parseDouble(ingreso1.nextLine());
        Punto unCentro = new Punto(x,y);
        
        System.out.println("***¿Que figura desea crear?***\n 1-Elipse 2- Circulo 3-Rectangulo 4-Cuadrado 5-Triangulo\n *Ingrese 0 para salir*" +"\n");
        int opcion = Integer.parseInt(ingreso1.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("\n****Ingrese eje mayor del elipse**** ");
                    double ejeMay = Double.parseDouble(ingreso1.nextLine());
                    System.out.println("\n****Ingrese eje menor del elipse**** ");
                    double ejeMen = Double.parseDouble(ingreso1.nextLine());
                    figura = new Elipse(ejeMay, ejeMen, unCentro);
                    System.out.println("Elipse creado con exito"); 
                           
                break;
                case 2:
                    System.out.println("\n****Ingrese radio del circulo**** ");
                    double radioCir = Double.parseDouble(ingreso1.nextLine());
                    figura = new Circulo(radioCir, unCentro);
                    System.out.println("Circulo creado con exito");
                    
                break;
                case 3:
                    System.out.println("\n****Ingrese base del rectangulo**** ");
                    double baseRec = Double.parseDouble(ingreso1.nextLine());
                    System.out.println("\n****Ingrese altura del rectanguloi**** ");
                    double altoRec = Double.parseDouble(ingreso1.nextLine());
                    figura = new Rectangulo(unCentro, baseRec, altoRec );
                    System.out.println("Rectangulo creado con exito"); 
                    
                break;
                case 4:
                    System.out.println("\n****Ingrese lado del cuadrado**** ");
                    double lado = Double.parseDouble(ingreso1.nextLine());
                    figura = new Cuadrado(unCentro, lado);
                    System.out.println("Cuadrado creado con exito"); 
                    
                  break;
                case 5:
                    System.out.println("\n****Ingrese base del triangulo**** ");
                    double baseTri = Double.parseDouble(ingreso1.nextLine());
                    System.out.println("\n****Ingrese altura del triangulo**** ");
                    double altoTri = Double.parseDouble(ingreso1.nextLine());
                    figura = new Triangulo(baseTri, altoTri, unCentro );
                    System.out.println("Triangulo creado con exito");
                    
                   break;
            }
        return figura;
    }
}    