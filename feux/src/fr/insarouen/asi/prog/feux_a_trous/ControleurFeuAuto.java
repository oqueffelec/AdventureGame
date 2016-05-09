/*
 * ControleurFeuAuto.java
 *
 * Created on 21 juin 2006, 00:19
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package fr.insarouen.asi.prog.feux_a_trous;
import java.lang.Thread;


/**
 *
 * @author nicolas
 */
public class ControleurFeuAuto implements Runnable {
    private Feu feu;
    private int tpsPasse;
    private int tpsAttention;
    private int tpsArret;
    private boolean etat=false;


    /** Creates a new instance of ControleurFeuAuto */
    public ControleurFeuAuto(Feu feu, int tpsPasse, int tpsAttention, int tpsArret) {
      this.feu=feu;
      this.tpsPasse=tpsPasse*1000;
      this.tpsAttention=tpsAttention*1000;
      this.tpsArret=tpsArret*1000;
    }

    public void run() {
      Thread monthread=Thread.currentThread();
      etat=true;
      try{
        while (etat && monthread==Thread.currentThread()){
          switch(feu.getEtat()) {
            case PASSE : feu.setEtat(Feu.Etat.ATTENTION);
                         monthread.sleep(tpsAttention);
            break;
            case ATTENTION : feu.setEtat(Feu.Etat.ARRET);
                              monthread.sleep(tpsArret);
            break;
            case ARRET : feu.setEtat(Feu.Etat.PASSE);
                         monthread.sleep(tpsPasse);
            break;
          }
        }
      }catch(InterruptedException e){}
    }

    public void arret(){
      etat=false;
    }





}
