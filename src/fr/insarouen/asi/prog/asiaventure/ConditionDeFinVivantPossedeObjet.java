package fr.insarouen.asi.prog.asiaventure;
import fr.insarouen.asi.prog.asiaventure.*;
import java.lang.*;
import java.io.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class ConditionDeFinVivantPossedeObjet extends ConditionDeFin {
  private Vivant vivant;
  private Objet[] objet;

  public ConditionDeFinVivantPossedeObjet(EtatDuJeu etatConditionVerifiee, Vivant vivant, Objet... objets){
    super(etatConditionVerifiee);
    this.vivant=vivant;
    this.objet=objets;
  }

  public EtatDuJeu verifierCondition(){
    for (Objet o : objet){
      if (!this.vivant.possede(o))
        return EtatDuJeu.ENCOURS;
    }
      return getEtatConditionVerifiee();
  }
}
