package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.*;

/** Classe PiedDeBiche
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public abstract class PiedDeBiche extends Objet{

	public PiedDeBiche(String nom,Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException {
		super(nom,monde);
	}

	public boolean estDeplacable(){
		return true;
	}
}
