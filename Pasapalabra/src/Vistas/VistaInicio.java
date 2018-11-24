//Vista con las opciones a elegir al inicio
//tipo de partida y la opcion de salir
package Vistas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Modelos.MenuPersonalizado;

public class VistaInicio extends JFrame implements ActionListener{
    
    private MenuPersonalizado barraM;
    private JPanel contenedor;
    private JButton btnRosco1, btnRosco2, btnSalir;
    
    public VistaInicio(){
        //definimos la ventana y organizamos los componentes de esta
        barraM = new MenuPersonalizado();
        
        this.setBounds(100, 100, 800, 600);
        this.setUndecorated(true);
        
        //añadimos la barra de nuestro personalizado
        setJMenuBar(barraM);
        
        
        contenedor = new JPanel();
        contenedor.setBounds(0, 0, 800, 600);
        contenedor.setLayout(null);
        contenedor.setBackground(Color.RED);
        this.add(contenedor);
        

        //colocamos los botones del menu de inicio
        btnRosco1 = new JButton("Modo de Juego 1");
        btnRosco1.setBounds(350, 100, 150, 100);
        contenedor.add(btnRosco1);
        
        btnRosco2 = new JButton("Modo de Juego 2");
        btnRosco2.setBounds(350, 250, 150, 100);
        contenedor.add(btnRosco2);
        
        btnSalir = new JButton("Salir de la app...");
        btnSalir.setBounds(350, 400, 150, 100);
        contenedor.add(btnSalir);
        
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
