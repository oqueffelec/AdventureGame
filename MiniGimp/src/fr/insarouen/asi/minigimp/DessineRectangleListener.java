package fr.insarouen.asi.minigimp;

import java.math.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MouseInputAdapter;

// TODO Listener qui modifie les données (dessinables) lors d'un click dans la zone de dessin
public class DessineRectangleListener extends MouseInputAdapter {

  private DessinablesData dessinables;
  private Dessin dessin;
  private int x1,x2,y1,y2;
  private Graphics gc;

  public DessineRectangleListener(DessinablesData dessinables,Dessin dessin) {
    this.dessinables=dessinables;
    this.dessin=dessin;
  }

  public void mouseClicked(MouseEvent e){
    int tailleX =Utilitaires.getIntAlea_1_Max(70);
    int tailleY =Utilitaires.getIntAlea_1_Max(70);
    dessinables.addDessinable(new Rectangle(e.getX()-tailleX/2,e.getY()-tailleY/2,tailleX,tailleY,new Color(Utilitaires.getIntAlea_1_Max(255*255*255))));
  }

  public void mousePressed(MouseEvent e){
    gc=dessin.getGraphics();
    x1=e.getX();
    y1=e.getY();
    x2=x1;
    y2=y1;
    gc.setColor(Color.BLACK);
    gc.setXORMode(dessin.getBackground());
  }

  public void mouseDragged(MouseEvent e){
      gc.drawRect(x2<x1?x2:x1,y2<y1?y2:y1,Math.abs(x2-x1),Math.abs(y2-y1));
      x2=e.getX();
      y2=e.getY();
      gc.drawRect(x2<x1?x2:x1,y2<y1?y2:y1,Math.abs(x2-x1),Math.abs(y2-y1));
  }

  public void mouseReleased(MouseEvent e){
      gc.setPaintMode();
      dessinables.addDessinable(new Rectangle(x1,y1,x2,y2,new Color(Utilitaires.getIntAlea_1_Max(255*255*255))));
  }
}
