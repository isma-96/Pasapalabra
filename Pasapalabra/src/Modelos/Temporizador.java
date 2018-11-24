package Modelos;

import Vistas.VistaRosco1;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Temporizador extends Thread{
    private boolean adelante,fin=false;
    private int nuMin=0;
    private int nuSeg=0;
    private VistaRosco1 vistaR1;
    
    public Temporizador(int min,int seg,boolean res,VistaRosco1 vis){
        this.nuMin=min;
        this.nuSeg=seg;
        this.adelante=res;
        this.vistaR1=vis;
    }
    @Override
    public void run(){
        try {//si ocurre un error al dormir el proceso(sleep(999))
            sleep(1000);
            while(nuMin>0 || nuSeg>0){//inicio del for infinito          
              if(nuSeg!=0) {//si no es el ultimo segundo
                   nuSeg--;  //decremento el numero de segundos 
                   vistaR1.setContador();
                }else{                    
                    if(nuMin!=0){//si no es el ultimo minuto                        
                        nuSeg=59;//segundos comienzan en 59
                        nuMin--;//decremento el numero de minutos
                        vistaR1.setContador();
                    }
                }                
                sleep(999);//Duermo el hilo durante 999 milisegundos(casi un segundo, quintandole el tiempo de proceso)
            }
            fin=true;
        } catch (InterruptedException ex) {
             Logger.getLogger(Temporizador.class.getName()).log(Level.SEVERE, null, ex);      
        }
    }
    public int getNuMin() {
        return nuMin;
    }

    public int getNuSeg() {
        return nuSeg;
    }    
}
