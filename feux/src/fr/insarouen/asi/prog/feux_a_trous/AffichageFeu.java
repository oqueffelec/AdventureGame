/*
 * AffichageFeu.java
 *
 * Created on 20 juin 2006, 17:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package fr.insarouen.asi.prog.feux_a_trous;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author nicolas
 */
public class AffichageFeu extends JPanel implements Observer {

    private Feu feu;
    JLabel vert;
    JLabel orange;
    JLabel rouge;





    /** Creates a new instance of AffichageFeu */
    public AffichageFeu(Feu feu) {
        this.feu=feu;
        feu.addObserver(this);
        vert=new JLabel();
        orange = new JLabel();
        rouge = new JLabel();
        dessinDesFeu();
    }

    public void dessinDesFeu(){
      vert.setText("O");orange.setText("O");rouge.setText("O");
      this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
      this.add(rouge);
      this.add(orange);
      this.add(vert);
      this.eteindre();
        switch(feu.getEtat()) {
          case PASSE : vert.setForeground(Color.GREEN);
          break;
          case ATTENTION : orange.setForeground(Color.ORANGE);
          break;
          case ARRET : rouge.setForeground(Color.RED);
          break;
        }
    }

    public void update(Observable o, Object obj){
      this.dessinDesFeu();
    }

    public void eteindre() {
        rouge.setForeground(Color.BLACK);
        orange.setForeground(Color.BLACK);
        vert.setForeground(Color.BLACK);
    }



}
