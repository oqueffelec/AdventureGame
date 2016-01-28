package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;

/** Classe PiedDeBiche
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public class PiedDeBiche extends Objet{

	private boolean estDeplacable;

	public PiedDeBiche(String nom,Monde monde){
		super(nom,monde);
		this.estDeplacable=true;
	}
}