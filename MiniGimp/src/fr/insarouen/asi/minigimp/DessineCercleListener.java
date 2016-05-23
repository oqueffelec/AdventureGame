package fr.insarouen.asi.minigimp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MouseInputAdapter;

// TODO Listener qui modifie les données (dessinables) lors d'un click dans la zone de dessin
public class DessineCercleListener extends MouseInputAdapter {

  private DessinablesData dessinables;

  public DessineCercleListener(DessinablesData dessinables) {
    this.dessinables=dessinables;
  }

  public void mouseClicked(MouseEvent e){
    int taille =Utilitaires.getIntAlea_1_Max(70);
    dessinables.addDessinable(new Cercle(e.getX()-taille/2,e.getY()-taille/2,taille,new Color(Utilitaires.getIntAlea_1_Max(255*255*255))));
  }

}
