package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;

public class Main{

	public static void main(String[] args) {

		Monde m=new Monde("Neverwinter");

		//test entité
		Entite e=new Entite("Archer",m);
		Entite e2=new Entite("Berserker",m);

		//test Monde
		m.ajouter(e);m.ajouter(e2);
		System.out.println(m);

		//test objet
		Objet o=new Objet("marteau",m);

		//test PiedDeBich
		PiedDeBiche p=new PiedDeBiche("p1",m);
	}
}
