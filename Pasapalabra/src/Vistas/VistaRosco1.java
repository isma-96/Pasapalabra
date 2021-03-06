
package Vistas;

import Controladores.ControladorRosco1;
import Modelos.Imagen;
import Modelos.Temporizador;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaRosco1 extends JFrame{        
    private ControladorRosco1 cr1;
    private Temporizador temp;
    private Dimension dim;
    private double x,y;
    private final int min=5,seg=0;
    private int aciertos,fallos;
    private ArrayList<Character> letras;
    private ArrayList<Imagen> imagenes;
    private JLabel pregunta,lacierto,lfallos,contador;
    private JTextField cuadro;    
    
    public VistaRosco1(){
        cr1=new ControladorRosco1(this);
        letras=new ArrayList();
        imagenes=new ArrayList();
        temp=new Temporizador(min,seg,true,this);
        crearVentana();
        crearRosco();
        crearTablero();
        this.setVisible(true);
        this.addKeyListener(cr1);        
        temp.start();        
    }
    
    public void crearVentana(){        
        dim=this.getToolkit().getScreenSize();
        this.setSize(dim);        
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
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
        pregunta=new JLabel("Como se llama la madre del Lazarillo?");
        pregunta.setBounds(450,250,480,50);
        pregunta.setFont(new Font("Serif", Font.BOLD, 28));
        this.add(pregunta);
        cuadro=new JTextField();
        cuadro.setBounds(600,400,150,50);
        cuadro.addKeyListener(cr1);
        this.add(cuadro);
        lacierto=new JLabel("ACIERTOS: "+this.aciertos);
        lacierto.setBounds(1100,100,200,30);
        lacierto.setFont(new Font("Serif", Font.BOLD, 28));
        this.add(lacierto);
        lfallos=new JLabel("FALLOS: "+this.fallos);
        lfallos.setBounds(1100,150,200,30);
        lfallos.setFont(new Font("Serif", Font.BOLD, 28));
        this.add(lfallos);
        contador=new JLabel(temp.getNuMin()+":"+temp.getNuSeg());
        contador.setBounds(1100,200,100,30);
        contador.setFont(new Font("Serif", Font.BOLD, 28));
        this.add(contador);
    }
    public void setLacierto(int num) {
        this.lacierto.setText("ACIERTOS: "+num);
        this.aciertos++;        
    }

    public void setLfallos(int num) {
        this.lfallos.setText("FALLOS: "+num);
        this.fallos++;
    }

    public int getAciertos() {
        return aciertos;
    }

    public int getFallos() {
        return fallos;
    }

    public JTextField getCuadro() {
        return cuadro;
    }

    public ArrayList<Imagen> getImagenes() {
        return imagenes;
    }

    public void setContador() {
        this.contador.setText(temp.getNuMin()+":"+temp.getNuSeg());
    }    
}