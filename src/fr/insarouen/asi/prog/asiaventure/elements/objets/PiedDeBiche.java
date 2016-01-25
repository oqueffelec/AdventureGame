package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.Monde;

public class PiedDeBiche extends Objet{

	private boolean estDeplacable;

	public PiedDeBiche(String nom,Monde monde){
		super(nom,monde);
		this.estDeplacable=true;
	}
}