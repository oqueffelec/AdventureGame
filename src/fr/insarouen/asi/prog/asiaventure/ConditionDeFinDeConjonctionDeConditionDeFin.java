package fr.insarouen.asi.prog.asiaventure;
import fr.insarouen.asi.prog.asiaventure.*;
import java.lang.*;
import java.io.*;
import fr.insarouen.asi.prog.asiaventure.vivants.*;

public class ConditionDeFinDeConjonctionDeConditionDeFin extends ConditionDeFin {
  private  ConditionDeFin[] cfs;

  public ConditionDeFinConjonctionConditionDeFin(EtatDuJeu etatDuJeu, ConditionDeFin... cfs) {
    super(etatDuJeu);
    this.cfs=cfs;
  }

  public EtatDuJeu verifierCondition(){
    for (ConditionDeFin c : cfs){
      if (c.verifierCondition().equals(EtatDuJeu.ENCOURS))
        return EtatDuJeu.ENCOURS;
    }
    return getEtatConditionVerifiee();
}
