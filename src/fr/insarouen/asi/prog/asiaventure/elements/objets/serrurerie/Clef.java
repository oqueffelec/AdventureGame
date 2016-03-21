package fr.insarouen.asi.prog.asiaventure.elements.objets.serrurerie;
import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.objets.Objet;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.*;

public final class Clef extends Objet{

  public Clef(String nom,Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde); //conflit nom porte1 !!! une cle=pas de nom !!!
  }

  public boolean estDeplacable(){
    return true;
  }
}
