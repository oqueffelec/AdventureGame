package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

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
			FileOutputStream f1=new FileOutputStream(new File("saves/sauvegarde.txt"));
			FileReader f2=new FileReader("saves/exemplesimulation1.aa");

			Monde monde=new Monde("Neverwinter");
			Piece piece=new Piece("Salle de torture",monde);
			Objet obj=new PiedDeBiche("épée",monde);
			Map listeObjet=new HashMap<String,Objet>();
			listeObjet.put("épée",obj);
			Vivant vivant=new JoueurHumain("Thorgal",monde,12,10,piece,listeObjet);
			Simulateur	s=new Simulateur(monde,new ConditionDeFinVivantMort(EtatDuJeu.valueOf("ENCOURS"),vivant));

			switch(choix){
				case 1 : System.out.println("Test");
								 try {
								 s.executerUnTour();
								 System.out.print("Voulez-vous rejouez à nouveau ? (o pour oui, n pour non)");
							 	 Scanner scc=new Scanner(System.in);
							  	 while(scc.equals("o")){
									    s.executerUnTour();
								   }
							  	} catch(Throwable e){
										System.err.print(e);
									}
				break;
				case 2 :	new Simulateur(f2);
				break;
				case 3 :	s.enregistrer(new ObjectOutputStream(f1));
				break;
				case 4 :
				break;
				case 5 : System.exit(0);
				break;
				default : System.out.println("Choix non valide");
		}
	}
}
