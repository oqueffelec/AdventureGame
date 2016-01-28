package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

/** Classe Objet : un objet est caractérise par son nom , le monde auquel il appartient et s'il est deplaçable ou non
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
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
