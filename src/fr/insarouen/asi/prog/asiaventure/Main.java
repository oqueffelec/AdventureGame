package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets. 	*;

public class Main{

	public static void main(String[] args) {

		Monde m=new Monde("hi");
		Entite e=new Entite("E1",m);
<<<<<<< HEAD
		Objet o=new Objet("O1","M1");
=======
		m.ajouter(e);
		System.out.println(m);
>>>>>>> 484fc08e42b00d21410e049da101414a57ad305e
	}
}
