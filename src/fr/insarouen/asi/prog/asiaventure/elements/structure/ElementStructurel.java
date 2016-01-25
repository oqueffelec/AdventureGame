package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class ElementStructurel extends Entite{

	private final static MAXIMUMNOMALEATOIRE;
	private String nom;
	private Monde nom;

	public ElementStructurel(String nom, Monde monde){
		super(nom,monde);
		this.nom=nom;
		this.monde=monde;
	}
}