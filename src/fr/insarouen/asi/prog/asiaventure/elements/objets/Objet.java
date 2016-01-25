package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;
import java.lang.Object;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class Objet extends Entite {

  // constructeur//

  public Objet(String nomObjet, String nomDuMonde) {
    super(nom,monde);
  }

  // methodes//

  boolean est deplacable() {
    return(false);
  }
}
