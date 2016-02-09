package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivant.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.lib.ListeObjet;

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
		Objet o3=new Objet("épée",m){
				public boolean estDeplacable(){
					return true;
				}
		};
		System.out.println(o3);

		//test element structurel
		Entite elem=new ElementStructurel("hache",m){};
		System.out.println(elem);

		//test PiedDeBiche
		Objet p=new PiedDeBiche("p1",m){};
		System.out.println(p);

		Piece piece=new Piece("Salle de torture",m);

		//test vivant
		Objet[] objets=new Objet[]{o1,o2,o3};
		Vivant v1=new Vivant("Sir Lancelot",m,10,4,piece,objets){};
		Vivant v2=new Vivant("Demogorgon",m,50,6,piece,objets){};
		System.out.println(v1.estMort());
		System.out.println(v1.toString());

		//test Piece
		piece.deposer(o1);piece.deposer(o2);piece.deposer(o3);
		piece.entrer(v1);piece.entrer(v2);
		System.out.println(piece);
		System.out.println(piece.contientObjet(o1));
		System.out.println(piece.contientObjet("marteaus"));
		piece.retirer(o1);piece.sortir(v1);
		System.out.println(piece);
	}
}
