 //SplashScreen para hacer la carga
package Vistas;

import java.awt.Color;
import java.awt.SplashScreen;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class VistaCarga extends JDialog{
    
    private SplashScreen screen;
    private JLabel imgIntro, porcentaje;
    private JProgressBar barraProgreso;
    private VistaInicio vistaI;
    
    public VistaCarga(){
        iniciarSplash();
        this.setLayout(null);
        this.setResizable(false);
        this.setBounds(100, 100, 327, 700);
        this.setBackground(Color.BLUE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setLayout(null);
        this.setUndecorated(true);
        this.setVisible(true);
        
    }
    
    private void iniciarSplash() {
        //colocamos una imagen
        ImageIcon fondo = new ImageIcon("src/assets/lazarilloPortada.jpg");
        imgIntro = new JLabel("");
        imgIntro.setIcon(fondo);
        imgIntro.setBounds(25, 25, 275, 450);
        getContentPane().add(imgIntro);
        
        //colocamos la barra de carga
        barraProgreso = new JProgressBar();
        barraProgreso.setBounds(15, 500, 300, 50);
        getContentPane().add(barraProgreso);
        
        //colocamos el %de carga
        porcentaje = new JLabel("0%");
        porcentaje.setBounds(100, 555, 100, 60);
        getContentPane().add(porcentaje);
        
        iniciarBarraProgreso();
    }
    
    private void iniciarBarraProgreso(){
        Thread hiloProgreso = new Thread(new Runnable() {
            int progreso=0;
            @Override
            public void run() {
                try {
                    while(progreso<=100){
                        barraProgreso.setValue(progreso);
                        porcentaje.setText("Cargando... "+progreso+"%");
                        progreso++;                        
                        Thread.sleep(100);//asignamos aqui el tiempo que queremos que tarde en cargar cada %
                    }
                    //aqui terminaria la ejecucion del splash por lo que aqui es donde
                    //cerramos el splash y lanzamos la siguiente ventana
                } catch (Exception e) {
                    System.out.println("Exception...");
                }
            }
        }
        );
        hiloProgreso.start();
    }
}