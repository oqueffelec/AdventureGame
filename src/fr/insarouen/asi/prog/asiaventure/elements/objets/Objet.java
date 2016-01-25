package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class Objet extends Entite {

	private String nomObjet;
  private boolean estDeplacable;
  
  public Objet(String nomObjet, Monde monde) {
    super(nomObjet,monde);
    this.nomObjet=nomObjet;
    this.estDeplacable=false;
  }

  public boolean estDeplacable(){
      return this.estDeplacable;
  }
}
