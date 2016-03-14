package fr.insarouen.asi.prog.asiaventure.elements.objets.serrurerie;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.objets.Objet;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.*;
import java.util.Random;

public class Serrure extends Objet implements Activable{

  private Clef clef;
  private Etat etat;

  public Serrure(Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    this(String.format("%d",new Random().nextInt(1000)),monde);
    this.clef=null;
    this.etat=Etat.valueOf("VEROUILLE");
  }

  public Serrure(String nom,Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde);
    this.clef=null;
  }

  public final Clef creerClef() throws NomDEntiteDejaUtiliseDansLeMondeException{
    this.clef=new Clef("Clé de la porte "+this.getNom(),this.getMonde());
    return this.clef;
  }

  public boolean activableAvec(Objet obj){
    return (obj==this.clef);
  }

  public void activer() throws ActivationException{
    if(this.etat.toString().equals("VEROUILLE"))
      throw new ActivationImpossibleException("Cette serrure est fermée à clef !");
    if(this.etat.toString().equals("DEVEROUILLE"))
      throw new ActivationImpossibleException("Cette serrure est déja dévérouillée.");
  }

  public void activerAvec(Objet obj) throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
    if(!this.activableAvec(obj))
      throw new ActivationImpossibleAvecObjetException(obj+" n'est pas la bonne clef !");
    this.etat=Etat.valueOf("DEVEROUILLE");
  }

  public boolean estDeplacable(){
    return false;
  }

  public Etat getEtat(){
    return this.etat;
  }
}
