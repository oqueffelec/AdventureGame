package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class Objet extends Entite {

	private String nomObjet;
  // constructeur//

  public Objet(String nomObjet, Monde monde) {
    super(nomObjet,monde);
    this.nomObjet=nomObjet;
  }

  // methodes//

  boolean estDeplacable() {
    return(false);
  }
}
