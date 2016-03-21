package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.lib.ListeObjet;
import fr.insarouen.asi.prog.asiaventure.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// Representation du Menu
		int choix; // pour le Menu
		Scanner sc = new Scanner(System.in);
			System.out.println("1 - JOUER");
			System.out.println("2 - CHARGER UN FICHIER DE DESCRIPTION");
			System.out.println("3 - SAUVER LA PARTIE ACTUELLE");
			System.out.println("4 - CHARGER LA PARTIE");
			System.out.println("5 - QUITTER");
			System.out.println("Quel Choix ?");
			choix = sc.nextInt();
			sc.nextLine();

			switch(choix){
				case 1 :
				break;
				case 2 :
				break;
				case 3 :
				break;
				case 4 :
				break;
				case 5 :
				break;
				default : System.out.println("Choix non valide");
		}
	}
}
