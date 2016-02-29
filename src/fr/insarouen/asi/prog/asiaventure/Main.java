package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.lib.ListeObjet;
import fr.insarouen.asi.prog.asiaventure.*;

public class Main{

	public static void main(String[] args) {

		Monde m=new Monde("Neverwinter");

		try{
			//test entité
			Entite e=new Entite("Archer",m){};
			Entite e2=new Entite("Berserker",m){};
	  	//System.out.println(e.equals(e)+" "+e.equals(e2));

			//test Monde
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

			//System.out.println(o3);

			//test element structurel
			Entite elem=new ElementStructurel("hache",m){};
			//System.out.println(elem);

			//test PiedDeBiche
			Objet p=new PiedDeBiche("p1",m){};
			//System.out.println(p);

			Piece piece=new Piece("Salle de torture",m);
			Piece piece2=new Piece("Salle de massages",m);

			//test vivant
			Objet[] objets=new Objet[]{o1,o2,o3};
			Vivant v1=new Vivant("Sir Lancelot",m,10,4,piece,o1){};
			Vivant v2=new Vivant("Demogorgon",m,50,6,piece,o2){};
			Vivant v3=new Vivant("Drizzt",m,8,3,piece,o3){};
			Vivant v4=new Vivant("Thorgal",m,18,8,piece2,objets){};
			//System.out.println(piece);
			//System.out.println(v1.estMort());

			//test Piece
			//System.out.println(piece);
		  //System.out.println(piece.contientObjet(o1));
			//System.out.println(piece.contientObjet("marteau"));
			piece.retirer(o1);piece.sortir(v2);v1.deposer(o1);
			//System.out.println(v1);
			//System.out.println(piece);
	}
	catch(NomDEntiteDejaUtiliseDansLeMondeException e){
		System.err.println(e.getMessage());
		e.printStackTrace();
		System.exit(-1);
	}
	catch(VivantAbsentDeLaPieceException e){
		System.err.println(e.getMessage());
		e.printStackTrace();
		System.exit(-1);
	}
	catch(ObjetNonPossedeParLeVivantException e){
		System.err.println(e.getMessage());
		e.printStackTrace();
		System.exit(-1);
	}
	catch(ObjetAbsentDeLaPieceException e){
		System.err.println(e.getMessage());
		e.printStackTrace();
		System.exit(-1);
	}
	catch (ObjetNonDeplacableException e){
		System.err.println(e.getMessage());
		e.printStackTrace();
		System.exit(-1);
	}
	}
}
