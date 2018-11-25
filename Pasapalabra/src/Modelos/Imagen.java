package Modelos;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Imagen extends javax.swing.JPanel {
    char letra;
    String color;
    /**
     * Constructor de la imagen.
     * @param let 
     */
    public Imagen(char let) {
        this.setSize(60,60);
        this.letra=let;
        this.color="azul";
    }
    /**
     * Metodo para dibujar la imagen.
     * @param grafico 
     */    
    public void paint(Graphics grafico) {
        Dimension height = getSize();

        //Se selecciona la imagen que tenemos en el paquete de la ruta del programa
        ImageIcon Img = new ImageIcon(getClass().getResource("../imagenes/letra"+letra+color+".png")); 

        //se dibuja la imagen que tenemos en el paquete Images
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);        

        setOpaque(false);
        super.paintComponent(grafico);
    }

    public void setColor(String color) {
        this.color = color;
    }    
}
