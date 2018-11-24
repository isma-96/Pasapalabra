
package Vistas;

import Controladores.ControladorRosco2;
import Modelos.Imagen;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaRosco2 extends JFrame{
    private ControladorRosco2 cr2;    
    private Dimension dim;
    private double x,y;
    private ArrayList<Character> letras;
    private ArrayList<Imagen> imagenes;
    private JLabel label;
    private JTextField cuadro;    
    
    public VistaRosco2(){
        cr2=new ControladorRosco2(this);
        letras=new ArrayList();
        imagenes=new ArrayList();
        crearVentana();
        crearRosco();
        crearTablero();
        this.setVisible(true);        
    }
    public void crearVentana(){        
        dim=this.getToolkit().getScreenSize();
        this.setSize(dim);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //27 letras
    public void crearRosco(){
        char let;        
        double j=4.5;
        int posX,r=325;
        for(int i=0;i<26;i++){            
            let=(char)(65+i);
            letras.add(let);
            j+=.24;            
            posX=(dim.width/2)-25;            
            x=posX+Math.cos(j)*r;
            y=340+Math.sin(j)*r;            
            Imagen imagen = new Imagen(let);
            imagen.setBounds((int)x, (int)y, 60, 60);
            imagenes.add(imagen);
            this.add(imagen);
            this.repaint();
        }       
    }
    public void crearTablero(){
        label=new JLabel("Como se llama la madre del Lazarillo?");
        label.setBounds(450,250,480,50);
        label.setFont(new Font("Serif", Font.BOLD, 28));
        this.add(label);
        cuadro=new JTextField();
        cuadro.setBounds(600,400,150,50);
        cuadro.addKeyListener(cr2);
        this.add(cuadro);
    } }
