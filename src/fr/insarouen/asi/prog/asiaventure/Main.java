package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets. 	*;

public class Main{

	public static void main(String[] args) {

		Monde m=new Monde("hi");
		Entite e=new Entite("E1",m);
		Objet o=new Objet("O1",m);
		m.ajouter(e);
		System.out.println(m);
	}
}
