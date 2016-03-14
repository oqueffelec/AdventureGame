package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.serrurerie.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class Porte extends ElementStructurel implements Activable{

  private Piece p1,p2;
  private Etat etat;
  private Serrure serrure;

  public Porte(String nom,Monde monde,Piece p1,Piece p2) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde);
    this.p1=p1;
    this.p2=p2;
    this.etat=Etat.valueOf("FERME");
  }
  public Porte(String nom,Monde monde,Piece p1,Piece p2,Serrure serrure) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde);
    this.p1=p1;
    this.p2=p2;
    this.etat=Etat.valueOf("FERME");
    this.serrure=serrure;
  }

  public Serrure getSerrure(){
      return this.serrure;
  }

  public boolean activableAvec(Objet obj){
    if ((obj instanceof PiedDeBiche))
      return true;
    else
      return false;
  }

  public void activer() throws ActivationImpossibleException{
    if(this.etat.toString().equals("FERME"))
      this.etat=Etat.valueOf("OUVERT");
    else
      this.etat=Etat.valueOf("FERME");
  }

  public void activerAvec(Objet obj) throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
    if(!this.activableAvec(obj))
      throw new ActivationImpossibleAvecObjetException("Impossible");
  }

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
    sb.append(super.toString());
    sb.append(" piece 1 : ");
    sb.append(this.p1.getNom());
    sb.append(" piece 2 : ");
    sb.append(this.p2.getNom());
    sb.append(" Etat : ");
    sb.append(this.etat);
    sb.append(" Serrure : ");
    sb.append(this.serrure);

    return sb.toString();
  }
}
