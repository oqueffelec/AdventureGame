package fr.insarouen.asi.prog.asiaventure;

import java.util.Scanner;
import java.io.*;

public class Main{

	public static void main(String[] args) throws FileNotFoundException,IOException,NomDEntiteDejaUtiliseDansLeMondeException {
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
			FileOutputStream f1=new FileOutputStream("saves/sauvegarde");
			FileReader f2=new FileReader("saves/exemplesimulation1.aa");
			Simulateur s;

			switch(choix){
				case 1 : s.executerUnTour();
				System.out.print("Voulez-vous rejouez à nouveau ? (o pour oui, n pour non)");
				Scanner scc=new Scanner(System.in);
				while(scc.equals("o")){
					s.executerUnTour();
				}


				break;
				case 2 :	s=new Simulateur(f2);
				break;
				case 3 :	new Simulateur(f2).enregistrer(new ObjectOutputStream(f1));
				break;
				case 4 :
				break;
				case 5 :
				break;
				default : System.out.println("Choix non valide");
		}
	}
}
