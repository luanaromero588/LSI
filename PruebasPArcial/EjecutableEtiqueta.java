
/**
 * @author Romero Ingrid Luana
 * @version 1. 17/10/2025
 */
import java.util.*;
public class EjecutableEtiqueta
{
    public static void main(String [] args){
        Scanner ingreso = new Scanner(System.in);
        
        ArrayList<Renglon> listaPedido = new ArrayList<>();
        PedidoEtiqueta unPedido = new PedidoEtiqueta(listaPedido); 
        
        int opcion = -1;
        
        while(opcion != 0){
            System.out.println("1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido");
            System.out.println("Ingrese una opcion: (0 para salir)");
             opcion = Integer.parseInt(ingreso.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el costo de la etiqueta:");
                    double costo = Double.parseDouble(ingreso.nextLine());
                    System.out.println("Ingrese el plus de la etiqueta:");
                    double plus = Double.parseDouble(ingreso.nextLine());
                    System.out.println("Ingrese la cantidad :");
                    int cantidad = Integer.parseInt(ingreso.nextLine());
                    Renglon unRenglonComun = new Renglon(cantidad,100, new Comun(costo,plus));
                    unPedido.agregarRenglon(unRenglonComun);
                    break;
                case 2:
                    System.out.println("Ingrese el costo de la etiqueta:");
                    double costoEtiqueta = Double.parseDouble(ingreso.nextLine());
                    System.out.println("Ingrese la cantidad de colores:");
                    int colores = Integer.parseInt(ingreso.nextLine());
                    System.out.println("Ingrese la cantidad :");
                    int cantidadEtiquetas = Integer.parseInt(ingreso.nextLine());
                     Renglon segundoRenglon = new Renglon(cantidadEtiquetas,200,new Premium(costoEtiqueta,colores));
                     unPedido.agregarRenglon(segundoRenglon);
                    break;
                case 3:
                    unPedido.mostrar();
                    break;
            }
        }
    }
}
/* 1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido
Ingrese una opcion: (0 para salir)
2
Ingrese el costo de la etiqueta:
200
Ingrese la cantidad de colores:
10
Ingrese la cantidad :
7
1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido
Ingrese una opcion: (0 para salir)
1
Ingrese el costo de la etiqueta:
100
Ingrese el plus de la etiqueta:
100
Ingrese la cantidad :
57
1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido
Ingrese una opcion: (0 para salir)
2
Ingrese el costo de la etiqueta:
200
Ingrese la cantidad de colores:
7
Ingrese la cantidad :
94
1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido
Ingrese una opcion: (0 para salir)
3
Pedido
Cantidad de items: 3
Item 1
7 Etiquetas de tipo Tipo Premium- Costo: $ 200.0 - Colores: 10.0
Precio: $1792.0
Item 1
57 Etiquetas de tipo Tipo Comun- Costo: $ 100.0Diseño:$ 100.0
Precio: $5515.0
Item 1
94 Etiquetas de tipo Tipo Premium- Costo: $ 200.0 - Colores: 7.0
Precio: $22372.0
--Total pedido: 158Etiquetas por un importe total de: $29679.0
1-Crear etiqueta comun, 2-Crear etiqueta premium,3-Mostrar Pedido
Ingrese una opcion: (0 para salir)*/