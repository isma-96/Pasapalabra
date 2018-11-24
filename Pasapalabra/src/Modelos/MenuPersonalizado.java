package Modelos;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuPersonalizado extends JMenuBar{
    
    private JMenu opc1, opc2, subopc3;
    private JMenuItem i1, i2, i3, i4, i5, i6;
    
    public MenuPersonalizado(){
        
        opc1 = new JMenu("Juego");
        opc2 = new JMenu("Ver");
        subopc3 = new JMenu("Opciones");
        i1 = new JMenuItem("Pausa");
        i2 = new JMenuItem("Salir");
        i3 = new JMenuItem("Zoom +");
        i4 = new JMenuItem("Zoom -");
        i5 = new JMenuItem("Nuevo Juego");
        i6 = new JMenuItem("Cambiar Modo");
        
        subopc3.add(i5);
        subopc3.add(i6);
        
        opc2.add(i3);
        opc2.add(i4);
        
        opc1.add(i1);
        opc1.add(subopc3);
        opc1.add(i2);
        
        this.add(opc1);
        this.add(opc2);
        
        this.setVisible(true);
        
    }
    
}
