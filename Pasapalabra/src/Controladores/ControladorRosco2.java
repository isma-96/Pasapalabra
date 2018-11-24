
package Controladores;

import Vistas.VistaRosco2;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorRosco2 implements KeyListener{
    VistaRosco2 vista;
    public ControladorRosco2(VistaRosco2 vista){
        this.vista=vista;
    }    

    @Override
    public void keyTyped(KeyEvent ke) {        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_ENTER){
            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {        
    }   
}
