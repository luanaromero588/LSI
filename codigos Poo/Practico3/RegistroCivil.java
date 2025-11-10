import java.util.Scanner;

public class RegistroCivil {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        String opcion; 
        Mujer unaMujer = null;
        Hombre unHombre = null;
        do{
            System.out.println("\n*** Menú principal Registro Civil ***");
            System.out.println("Ingrese persona a registrar(H-hombre; M-mujer): ");
            opcion = ingreso.nextLine();
            
            if (opcion.equalsIgnoreCase("M")) {
                System.out.print("Ingrese nombre de la mujer: ");
                String nombreMujer = ingreso.nextLine();
                System.out.print("Ingrese apellido de la mujer: ");
                String apellidoMujer = ingreso.nextLine();
                System.out.print("Ingrese edad de la mujer: ");
                int edadMujer = Integer.parseInt(ingreso.nextLine());
                System.out.print("Ingrese estado civil (Soltera / Casada / Divorciada): ");
                String estadoCivil = ingreso.nextLine();       
                unaMujer = new Mujer(nombreMujer, apellidoMujer, edadMujer);
                unaMujer.mostrarEstadoCivil();
            } else {
                System.out.print("Ingrese nombre del hombre: ");
                String nombreHombre = ingreso.nextLine();
                System.out.print("Ingrese apellido del hombre: ");
                String apellidoHombre = ingreso.nextLine();
                System.out.print("Ingrese edad del hombre: ");
                int edadHombre = Integer.parseInt(ingreso.nextLine());
                System.out.print("Ingrese estado civil (Soltero / Casado / Divorciado): ");
                String estadoCivil = ingreso.nextLine();
                unHombre = new Hombre(nombreHombre, apellidoHombre, edadHombre);
                unHombre.mostrarEstadoCivil();
            }

            int opcionMenu = -1;
            while (opcionMenu != 0) {
                System.out.println("\n*** Sub-Menú Registro Civil ***");
                System.out.println("1-Mostrar datos 2-Casarse 3-Divorciarse 0-Ingresar otra persona");
                System.out.print("Ingrese una opcion: ");
                opcionMenu = Integer.parseInt(ingreso.nextLine());
    
                switch (opcionMenu) {
                    case 1:{
                        if(unaMujer != null){
                            unaMujer.mostrarEstadoCivil();
                        }else if(unHombre != null){
                            unHombre.mostrarEstadoCivil();
                        }
                        break;
                    }
    
                    case 2:{
                        if(unaMujer != null && unHombre != null){
                         unaMujer.casarseCon(unHombre);
                        }else{
                            System.out.println("Error - faltan datos");
                        }
                        break;
                    }
    
                    case 3: {
                        if (unaMujer != null) {
                            unaMujer.divorcio();
                        }
                        if (unHombre != null) {
                            unHombre.divorcio();
                        }
                        break;
                    }
                    case 0:{
                        System.out.println("De regreso al menu principal...");
                    }
                 }
            } 
        } while (!opcion.equalsIgnoreCase("X"));
    }   
}