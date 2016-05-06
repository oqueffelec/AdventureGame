import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Observer;
import java.util.Observable;

public class ControleurVuePuissance4Graphique extends JPanel implements Observer{

  private Puissance4 p4;
  int x,y,cote,espace;

  public ControleurVuePuissance4Graphique(Puissance4 p4){
    this.p4=p4;
    p4.addObserver(this);
    this.addMouseListener(new ClickControleur(p4));
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Rectangle r = getBounds();
    int h = r.height;
    int w = r.width;
    x = w/10;
    y = h/10;
    espace = 5;
    if (h > w)
      cote = (w - 2*x - espace*(p4.getLargeur()-1))/(p4.getLargeur());
    else
      cote = (h - 2*y - espace*(p4.getHauteur()-1))/(p4.getHauteur());
    for(int i=p4.getHauteur()-1;i>=0;i--){
      for (int j=p4.getLargeur()-1;j>=0;j--){
        switch(p4.getJeton(j,i)){
          case JAUNE : g.setColor(Color.YELLOW);
          break;
          case ROUGE : g.setColor(Color.RED);
          break;
          case VIDE : g.setColor(Color.GRAY);
          break;
        }
        g.fillOval(x,y,cote,cote);
        x = x + cote + espace;
      }
      y = y + cote + espace;
      x = w/10;
    }
  }

  public void update(Observable o, Object arg){
    repaint();
  }

  class ClickControleur extends MouseAdapter{

    private Puissance4 p4;
    private int posX;

    public ClickControleur(Puissance4 p4){
      this.p4=p4;
    }
    public void mouseClicked(MouseEvent e){
      this.posX=e.getX();
      modifie(calculColonne(x,cote,espace,p4.getLargeur(),posX));
    }

    public int calculColonne(int x,int cote, int espace,int nbColonnes,int posX){
      return (nbColonnes-((posX-x)/(cote + espace/2)+1));
    }

    public void modifie(int i){
      try{
        this.p4.joueColonne(i);
      }
      catch(Puissance4ColonneException e){}
    }
  }
}
