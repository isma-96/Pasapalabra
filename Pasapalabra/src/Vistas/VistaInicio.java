
package Vistas;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VistaInicio extends JFrame{
    private Dimension dim;
    private int x,y;
    
    public VistaInicio(){
        crearVentana();
        this.setVisible(true);
    }
    public void crearVentana(){        
        dim=this.getToolkit().getScreenSize(); 
        this.setLayout(null);
        this.setSize(dim);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
