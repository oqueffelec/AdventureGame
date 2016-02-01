package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;

public class Main{

	public static void main(String[] args) {

		Monde m=new Monde("Neverwinter");

		//test entité
		Entite e=new Entite("Archer",m){};
		Entite e2=new Entite("Berserker",m){};

		//test Monde
		m.ajouter(e);m.ajouter(e2);
		System.out.println(m);

		//test objet
		Objet o=new Objet("marteau",m){
				public boolean estDeplacable(){
					return true;
				}
		};
		System.out.println(o);

		//test element structurel
		Entite elem=new ElementStructurel("hache",m){};
		System.out.println(elem);

		//test PiedDeBiche
		Objet p=new PiedDeBiche("p1",m){};
	}
}
