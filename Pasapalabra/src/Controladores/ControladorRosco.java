
package Controladores;

import Vistas.VistaRosco;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControladorRosco implements KeyListener{
    VistaRosco vista;
    public ControladorRosco(VistaRosco vista){
        this.vista=vista;
    }    

    @Override
    public void keyTyped(KeyEvent ke) {        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_ENTER){            
            if(vista.getCuadro().getText().toLowerCase().compareTo("hola")==0){                
                vista.getImagenes().get(0).setColor("verde");
                vista.setLacierto(vista.getAciertos()+1);
                vista.repaint();
            }else{
                vista.getImagenes().get(0).setColor("rojo");
                vista.setLfallos(vista.getFallos()+1);
                vista.repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {        
    }
}