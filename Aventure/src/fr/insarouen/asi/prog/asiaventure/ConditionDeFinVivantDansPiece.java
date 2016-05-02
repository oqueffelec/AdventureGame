package fr.insarouen.asi.prog.asiaventure;
import fr.insarouen.asi.prog.asiaventure.*;
import java.lang.*;
import java.io.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class ConditionDeFinVivantDansPiece extends ConditionDeFin {
  private Vivant vivant;
  private Piece piece;

  public ConditionDeFinVivantDansPiece(EtatDuJeu etatConditionVerifiee, Vivant vivant, Piece piece){
    super(etatConditionVerifiee);
    this.vivant=vivant;
    this.piece=piece;
  }

  public EtatDuJeu verifierCondition(){
    if (this.vivant.getPiece().equals(this.piece))
      return this.getEtatConditionVerifiee();
    return EtatDuJeu.ENCOURS;

  }
}
