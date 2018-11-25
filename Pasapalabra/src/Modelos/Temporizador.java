package Modelos;

import Vistas.VistaRosco;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Temporizador extends Thread{
    private boolean atras,fin=false;
    private int nuMin=0;
    private int nuSeg=0;
    private VistaRosco vistaR;    
    /**
     * Contructor que crea el hilo.
     * @param min
     * @param seg
     * @param res
     * @param vis 
     */
    public Temporizador(int min,int seg,boolean res,VistaRosco vis){
        this.nuMin=min;
        this.nuSeg=seg;
        this.atras=res;        
        this.vistaR=vis;       
    }
    /**
     * Metodo que empieza el hilo.
     */
    @Override
    public void run(){
        try {//si ocurre un error al dormir el proceso(sleep(999))
            sleep(999);
            if(atras){                
                while(nuMin>0 || nuSeg>0){//inicio          
                    if(nuSeg!=0) {//si no es el ultimo segundo
                         nuSeg--;  //decremento el numero de segundos 
                         vistaR.setContador();
                      }else{                    
                          if(nuMin!=0){//si no es el ultimo minuto                        
                              nuSeg=59;//segundos comienzan en 59
                              nuMin--;//decremento el numero de minutos
                              vistaR.setContador();
                          }
                      }                
                      sleep(999);//Duermo el hilo durante 999 milisegundos(casi un segundo, quintandole el tiempo de proceso)
                  }
                  fin=true;
            }else{                
                while(!fin){
                    if(nuSeg==59){
                        nuSeg=0;
                        if(nuMin==59){
                            fin=true;
                        }else{
                            nuMin++;
                            vistaR.setContador();
                        }
                    }else{
                        nuSeg++;
                        vistaR.setContador();
                    }
                    sleep(999);
                }
            }
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
