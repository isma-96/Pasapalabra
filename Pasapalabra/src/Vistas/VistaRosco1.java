
package Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VistaRosco1 extends JFrame{        
    private Dimension dim;
    private double x,y;
    private int cont=65;
    private ArrayList<Character> letras; 
    private ArrayList<JButton> botones;
    
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
        double j=0;
        int posX,r;
        for(int i=0;i<26;i++){            
            let=(char)(65+i);
            letras.add(let);
            //13.84
            j+=.01;
            r=600;
            posX=(dim.width/2)-25;
            x=posX+Math.cos(j)*r;
            y=50+Math.sin(j)*r;
            if(i==0){
                boton=new JButton();            
                boton.setBounds(posX, 50, 50, 50); 
                boton.setText(String.valueOf(let));
                botones.add(boton);
                this.add(boton); 
            }else{
                boton=new JButton();            
                boton.setBounds((int)x, (int)y, 50, 50);
                boton.setText(String.valueOf(let));
                botones.add(boton);
                this.add(boton); 
            }                   
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