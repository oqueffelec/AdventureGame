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
		System.out.println(e.equals(e)+" "+e.equals(e2));

		//test Monde
		m.ajouter(e);m.ajouter(e2);
		System.out.println(m);

		//test objet
		Objet o1=new Objet("marteau",m){
				public boolean estDeplacable(){
					return true;
				}
		};
		Objet o2=new Objet("carquois",m){
				public boolean estDeplacable(){
					return true;
				}
		};
		System.out.println(o2);

		//test element structurel
		Entite elem=new ElementStructurel("hache",m){};
		System.out.println(elem);

		//test PiedDeBiche
		Objet p=new PiedDeBiche("p1",m){};
		System.out.println(p);

		//test Piece
		Piece piece=new Piece("Salle de torture",m);
		piece.deposer(o1);
		piece.deposer(o2);
		System.out.println(piece);
		System.out.println(piece.contientObjet(o1));
		System.out.println(piece.contientObjet("marteaus"));
	}
}
