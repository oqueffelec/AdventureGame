/*
 * ControleurFeuGraphique.java
 *
 * Created on 20 juin 2006, 23:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package fr.insarouen.asi.prog.feux_a_trous;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author nicolas
 */
public class ControleurFeuGraphique extends JPanel {


  ControleurFeuAuto cfa;
   Feu feu;
   JButton go;
   JButton attention;
   JButton stop;
   JCheckBox cb;
    /** Creates a new instance of ControleurFeuGraphique */
    public ControleurFeuGraphique(Feu feu) {
      this.feu=feu;
      dessin();
      cfa = new ControleurFeuAuto(feu,1,2,3);
    }

    public void dessin(){
      go=new JButton("Go !");
      attention=new JButton("Attention");
      stop=new JButton("Stop");
      cb=new JCheckBox("Auto");
      go.addMouseListener(new MyListener());
      attention.addMouseListener(new MyListener());
      stop.addMouseListener(new MyListener());
      cb.addItemListener(new ListenAuto());
      this.setLayout(new FlowLayout());
      this.add(go);this.add(stop);this.add(attention);this.add(cb);
    }

    class MyListener extends MouseAdapter{
      public void mouseClicked(MouseEvent e){
            if(((JButton)e.getSource()).equals(go))
              feu.setEtat(Feu.Etat.PASSE);
            if(((JButton)e.getSource()).equals(attention))
              feu.setEtat(Feu.Etat.ATTENTION);
            if(((JButton)e.getSource()).equals(stop))
              feu.setEtat(Feu.Etat.ARRET);
          }
    }

    class ListenAuto implements ItemListener{
      public void itemStateChanged(ItemEvent e){
        if (e.getStateChange()==e.SELECTED){
          go.setEnabled(false);
          stop.setEnabled(false);
          attention.setEnabled(false);
          Thread thread=new Thread(cfa);
          thread.start();
        }
        if (e.getStateChange()==e.DESELECTED){
          go.setEnabled(true);
          stop.setEnabled(true);
          attention.setEnabled(true);
          cfa.arret();
          }
        }
    }

}
