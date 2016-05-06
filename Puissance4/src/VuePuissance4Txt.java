import java.util.Observer;
import java.util.Observable;

public class VuePuissance4Txt implements Observer{

  private Puissance4 p4;

  public VuePuissance4Txt(Puissance4 p4){
      this.p4=p4;
      p4.addObserver(this);
  }

  public void afficher(){
    for(int i=p4.getHauteur()-1;i>=0;i--){
      for (int j=p4.getLargeur()-1;j>=0;j--){
        switch(p4.getJeton(j,i)){
          case JAUNE : System.out.print(" O ");
          break;
          case ROUGE : System.out.print(" X ");
          break;
          case VIDE : System.out.print(" | ");
          break;
        }
      }
      System.out.println("");
    }
    System.out.println("--------------------\n--------------------\n--------------------");
  }

  public void update(Observable o, Object arg){
    this.afficher();
  }
}
