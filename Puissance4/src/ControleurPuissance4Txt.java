import java.util.Scanner;

public class ControleurPuissance4Txt{

  private Puissance4 p4;

  public ControleurPuissance4Txt(Puissance4 p4){
    this.p4=p4;
  }

  public void joue(){
      System.out.println("Bienvenue au Puissance 4 du turfu !\n");
      Scanner sc = new Scanner(System.in);
      int input;
      while (true) {
        System.out.println("Entrez la colonne où jouer\n");
        input = sc.nextInt();
        while (input<=0 || input>p4.getLargeur()){
          System.out.println("Colonne invalide. Rééssayez.\n");
          input = sc.nextInt();
        }
        try{
          p4.joueColonne(input-1);
        }catch(Puissance4ColonneException e){}
      }
  }
}
