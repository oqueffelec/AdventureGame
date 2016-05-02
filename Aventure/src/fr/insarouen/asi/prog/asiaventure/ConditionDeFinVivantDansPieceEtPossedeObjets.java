package fr.insarouen.asi.prog.asiaventure;
import fr.insarouen.asi.prog.asiaventure.*;
import java.lang.*;
import java.io.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class ConditionDeFinVivantDansPieceEtPossedeObjets extends ConditionDeFin {
  ConditionDeFin c1,c2;


  public ConditionDeFinVivantDansPieceEtPossedeObjets(EtatDuJeu etatConditionVerifiee, Vivant vivant, Piece piece, Objet... objets){
    super(etatConditionVerifiee);


    c1 = new ConditionDeFinVivantDansPiece(etatConditionVerifiee,vivant,piece);
    c2 = new ConditionDeFinVivantPossedeObjet(etatConditionVerifiee,vivant,objets);

  }

  public EtatDuJeu verifierCondition(){

    if (c1.verifierCondition().equals(EtatDuJeu.ENCOURS) || c2.verifierCondition().equals(EtatDuJeu.ENCOURS))
      return EtatDuJeu.ENCOURS;
    return getEtatConditionVerifiee();
  }
}
