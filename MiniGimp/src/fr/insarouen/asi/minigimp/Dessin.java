package fr.insarouen.asi.minigimp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// TODO compléter la classe
public class Dessin extends JPanel implements Observer{

  private DessinablesData lesFigures;

  public Dessin() {
    super();

    setOpaque(true);
    setBackground(Color.white);
    setPreferredSize(new Dimension(500,600));

  }

  // TODO associe les données à la zone de dessin et les déclare observables par Dessin
  public void setModel(DessinablesData dessinables) {
      lesFigures=dessinables;
      lesFigures.addObserver(this);
  }


  // TODO dessine le ou les figures contenues dans les données
  // si une figure est reçu ne dessiner que celle-ci
  // sinon tout redessinner
  public void update(Observable obs, Object o) {
    if(!(o==null))
      ((Dessinable)o).dessine(this.getGraphics());
    else
      repaint();
  }

  // TODO dessine les figures contenues dans les données
  public void paintComponent(Graphics gc) {
    for (Iterator<Dessinable> i=lesFigures.iterator();i.hasNext();){
      i.next().dessine(gc);
    }

  }

}
