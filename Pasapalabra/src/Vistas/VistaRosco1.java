
package Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class VistaRosco1 extends JFrame{        
    private Dimension dim;
    private double x,y;
    private ArrayList<JLabel> letras;
    private ArrayList<JButton> botones;
    String letra;
    ImageIcon img;
    JLabel label;
    
    public VistaRosco1(){
        letras=new ArrayList();
        botones=new ArrayList();
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
    //27 letras
    public void crearRosco(){
        char let;
        JButton boton;
        double j=4.5;
        int posX,r=300;
        for(int i=0;i<26;i++){            
            let=(char)(65+i);                        
            j+=.24;            
            posX=(dim.width/2)-20;            
            x=posX+Math.cos(j)*r;
            y=340+Math.sin(j)*r;
            letra="../imagenes/letra"+let+"azul.png";
            URL url=this.getClass().getResource(letra);
            img=new ImageIcon(url);            
            boton=new JButton();            
            boton.setBounds((int)x, (int)y, 60, 60);
            boton.setIcon(img);            
            boton.setBorder(null);
            botones.add(boton);
            this.add(boton);
        }
    }
    public void paint(Graphics g){                
        g.drawOval(400, 100, 600, 600);        
    }    
}
/*
    posiX=660;
    posiY=305;
    r=100;
    i+=.01;
    x=posiX+Math.cos(i)*r;
    y=posiY+Math.sin(i)*r;	
    document.getElementById("tierra").style.top=y+"px";
    document.getElementById("tierra").style.left=x+"px";
*/