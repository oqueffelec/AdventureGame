package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

/** Classe Objet : un objet est caractérise par son nom , le monde auquel il appartient et s'il est deplaçable ou non
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public abstract class Objet extends Entite {

	private String nomObjet;

  public Objet(String nomObjet, Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nomObjet,monde);
    this.nomObjet=nomObjet;
  }


	/** Indique si le déplacement de l'objet est autorisé
	 *
	 * @return			retourne boolean
	 */

  public abstract boolean estDeplacable();
}
