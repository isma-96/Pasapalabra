
package Vistas;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VistaInicio extends JFrame{
    private Dimension dim;
    private int x,y;
    
    public VistaInicio(){
        crearVentana();
        crearRosco();
        this.setVisible(true);
    }
    public void crearVentana(){        
        dim=this.getToolkit().getScreenSize();
        this.setSize(dim);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void crearRosco(){
        x=dim.width/2;
        y=50;
        JButton boton=new JButton();
        boton.setBounds(x, y, 50, 50);
        this.add(boton);
    }
}
