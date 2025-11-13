import javax.swing.*;
import java.awt.event.*;
class ManejadorConInterfaz implements WindowListener{
    // de todos los métodos que expone esta interfaz, sólo interesa escribir código en este, para cerrar la ventana
    public void windowClosing(WindowEvent e){
    System.out.println("salir");
    System.exit(0); // Esta sentencia termina la máquina virtual
    }
    // Todos estos métodos no tendrán código, pero se deben sobrescribir (llaves sin código) por implementar la interfaz
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
}