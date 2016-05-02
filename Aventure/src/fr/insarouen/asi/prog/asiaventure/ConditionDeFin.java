package fr.insarouen.asi.prog.asiaventure;
import fr.insarouen.asi.prog.asiaventure.*;
import java.lang.*;
import java.io.*;

public abstract class ConditionDeFin extends Object implements Serializable {
  private EtatDuJeu etatdujeu;

  public ConditionDeFin(EtatDuJeu etatdujeu){
    this.etatdujeu=etatdujeu;
  }

  public EtatDuJeu getEtatConditionVerifiee(){
    return this.etatdujeu;
  }
  public abstract EtatDuJeu verifierCondition();
}
