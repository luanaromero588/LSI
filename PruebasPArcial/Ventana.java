
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // paquete que contiene las clases necesarias
public class Ventana extends JFrame implements ActionListener {
    // Se define el panel como variable de la clase (y no local de un método) para poder acceder a él
    // desde cualquier método de la clase (por ej., en el actionPerformed)
     //Se crea un objeto de tipo panel
    JPanel miPanel = new JPanel();
    
    public Ventana(){
    this.setTitle("Ventana de Prueba"); // Método heredado de JFrame. Coloca título a la ventana
    this.setSize(500,400); // Asigna un tamaño a la ventana
    // se indica a la ventana quien será su manejador de eventos de ventana: un objeto de tipo manejador que se crea
    // en esta misma línea, instanciando la clase ManejadorConInterfaz, definida luego
    this.addWindowListener(new ManejadorConHerencia());
   
    //Se obtiene un objeto contentPane.
    Container miPanelContenedor = this.getContentPane();
    //se añade el panel creado al contenedor, invocando al método add del Container obtenido�
    miPanelContenedor.add(miPanel);
    miPanel.setBackground(Color.black); // Pinta el fondo del panel de color rojo�
    
    JButton miBoton = new JButton("Azul");
    // Se indica al botón quien será su gestor de eventos. Es la propia ventana (this)
    miBoton.addActionListener(this);
    // Se crea un objeto de tipo Dimensión. Este objeto contiene un par de valores enteros: alto y ancho (height y width)
    Dimension d = new Dimension();
    // Se inicializa el alto y el ancho
    d.height = 40;
    d.width = 100;
    // Se asigna al botón un tamaño preferido, empleando para ello el objeto Dimensión creado
    // El BorderLayout respetará el alto preferido del botón al estar éste en su campo sur.
    miBoton.setPreferredSize(d);
    miPanel.add(miBoton, BorderLayout.SOUTH);  
}
// La clase Ventana debe sobreescribir este método, ya que implementa la interfaz ActionListener
// En el cuerpo de este método se coloca la acción a llevarse a cabo cuando se produce un evento sobre el botón
    public void actionPerformed (ActionEvent e){
    miPanel.setBackground(Color.blue);
  }
}
    
    /*
     * TODO LO QUE ES LAYOUT
    miPanel.setLayout(new BorderLayout(2,2));
    String[] misLugares = {BorderLayout.NORTH, BorderLayout.SOUTH,
    BorderLayout.EAST, BorderLayout.WEST,
    BorderLayout.CENTER };
    String[] nombreBoton = { "Boton Norte", "Boton Sur", "Boton Este",
    "Boton Oeste", "Boton Centro" };
    for (int i=0; i<misLugares.length; i++) {
    JButton miBoton = new JButton(nombreBoton[i]);
    miPanel.add(miBoton, misLugares[i]);
    }
    
     filas = 3, columnas = 2, horizontal gap =5, vertical gap = 5
    GridLayout miGrid = new GridLayout(3,2, 5,5);
    miPanel.setLayout(miGrid);
    for (int i=0; i<6; i++) {
    JButton miBoton = new JButton("Boton "+(i+1));
    miPanel.add(miBoton);
    }
    
    FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 5, 10);
    miPanel.setLayout(fl);
    for (int i=0; i<5; i++) {
        JButton miBoton = new JButton("Boton "+(i+1));
        miBoton.setPreferredSize(new Dimension(100,25));
        miPanel.add(miBoton);
    }
    
    miPanel.setLayout(null); // Elimina el gestor de layouts por defecto del panel
    JButton boton = new JButton(); // Crea un objeto de tipo JButton (un botón)�
    // Este método indica al botón que se sitúe en las coordenadas 300,300 del panel, con un tamaño de 50x50
    boton.setBounds(100,100,50,50);
    miPanel.add(boton); // Se añade el botón al panel
    */

 
