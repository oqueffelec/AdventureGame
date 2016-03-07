package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class Porte extends ElementStructurel implements Activable{

  private Piece p1,p2;
  protected Objet activableObjet;
  private Etat etat;

  public Porte(String nom,Monde monde,Piece p1,Piece p2) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde);
    this.p1=p1;
    this.p2=p2;
    this.activableObjet=null;
    this.etat=Etat.valueOf("FERME");
  }

  public boolean activableAvec(Objet obj){
    return (obj.equals(activableObjet));
  };

  public void activer() throws ActivationImpossibleException{
    this.etat=Etat.valueOf("OUVERT");
  };

  public void activerAvec(Objet obj) throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
    this.activableObjet=obj;
  };

  public Etat getEtat(){
    return this.etat;
  }

  public Piece getPieceAutreCote(Piece piece){
    if (this.p1.equals(piece))
      return p2;
    else
      return p1;
  }


  public String toString(){
    StringBuilder sb=new StringBuilder();
    sb.append("Porte : ");
    sb.append(" piece 1 : ");
    sb.append(this.p1.getNom());
    sb.append(" piece 2 : ");
    sb.append(this.p2.getNom());
    sb.append(" ObjetActivable :");
    sb.append(this.activableObjet);
    sb.append(" Etat : ");
    sb.append(this.etat);

    return sb.toString();
  }
}
