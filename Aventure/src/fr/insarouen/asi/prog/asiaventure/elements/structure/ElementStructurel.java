package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.*;

/** Classe ElementStucturel
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public abstract class ElementStructurel extends Entite{


	public ElementStructurel(String nom, Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
		super(nom,monde);
	}
}
