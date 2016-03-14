package fr.insarouen.asi.prog.asiaventure.elements.objets;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;

public class Coffre extends Objet implements Activable{

  private Etat etat;

  public Coffre(String nom, Monde monde){
    super(nom,monde);
    this.etat=Etat.valueOf("FERME");
  }

  public boolean activableAvec(Objet obj){
    return false;
  }

  public void activer() throws ActivationException{
    if(this.etat.toString().equals("FERME"))
      this.etat=Etat.valueOf("OUVERT");
    else
      this.etat=Etat.valueOf("FERME");
  }

  public void activerAvec(Objet obj) throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
  }

  public boolean estDeplacable(){
    return true;
  }

  public Etat getEtat(){
    return this.etat;
  }
}
