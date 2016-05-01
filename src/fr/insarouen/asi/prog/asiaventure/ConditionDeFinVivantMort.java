package fr.insarouen.asi.prog.asiaventure;
import fr.insarouen.asi.prog.asiaventure.*;
import java.lang.*;
import java.io.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;

public class ConditionDeFinVivantMort extends ConditionDeFin {
  private Vivant vivant;

  public ConditionDeFinVivantMort(EtatDuJeu etatconditionverifiee, Vivant vivant){
    super(etatconditionverifiee);
    this.vivant=vivant;
  }

  public EtatDuJeu verifierCondition(){
    if (this.vivant.estMort())
      return getEtatConditionVerifiee();
    return EtatDuJeu.ENCOURS;
  }
}
