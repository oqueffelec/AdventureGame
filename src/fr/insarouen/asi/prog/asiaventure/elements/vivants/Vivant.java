package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.lib.ListeObjet;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


public abstract class Vivant extends Entite {
  private int pointVie;
  private int pointForce;
  private Piece piece;
  private ListeObjet listeObjs;

  // Construteur

  public Vivant(java.lang.String nom, Monde monde, int pointVie, int pointForce, Piece piece, Objet... objets) throws NomDEntiteDejaUtiliseDansLeMondeException {
    super(nom,monde);
    this.pointVie=pointVie;
    this.pointForce=pointForce;
    this.piece=piece;
    this.listeObjs=new ListeObjet(objets);
    piece.entrer(this);
  }


  // Méthodes

  public void deposer(java.lang.String nomObj) throws ObjetNonPossedeParLeVivantException{
    if(!this.listeObjs.contientObjet(nomObj))
      throw new ObjetNonPossedeParLeVivantException(nomObj+" n'est pas possede par le vivant");
    this.listeObjs.retirer(nomObj);
  }


  public void deposer(Objet obj) throws ObjetNonPossedeParLeVivantException{
    if(!this.listeObjs.contientObjet(obj))
      throw new ObjetNonPossedeParLeVivantException(obj.getNom()+" n'est pas possede par le vivant");
    this.listeObjs.retirer(obj);
  }

  public boolean estMort(){
    return this.pointVie==0;
  }

  public Objet getObjet(java.lang.String nomObjet){
    int i=0;
    if (!this.listeObjs.contientObjet(nomObjet)){
      return null;
    }
    else {
      while (this.listeObjs.getObjet(i).getNom().equals(nomObjet)){
        i++;
      }
      return this.listeObjs.getObjet(i);
    }
  }

  public java.util.HashMap<java.lang.String,Objet> getObjets(){
    java.util.HashMap<java.lang.String,Objet> tmp=new java.util.HashMap<java.lang.String,Objet>();
    for(int i=0;i<this.listeObjs.getTaille();i++){
      tmp.put(this.listeObjs.getObjet(i).getNom(),this.listeObjs.getObjet(i));
    }
    return tmp;
  }

  public Piece getPiece(){
    return this.piece;
  }

  public int getPointForce(){
    return this.pointForce;
  }

  public int getPointVie(){
    return this.pointVie;
  }

  public boolean possede(Objet obj){
    return this.listeObjs.contientObjet(obj);
  }

  public void prendre(Objet obj) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException{
    if(!this.piece.contientObjet(obj))
      throw new ObjetAbsentDeLaPieceException(obj.getNom()+" est absent de la pièce");
    if (obj.estDeplacable())
      throw new ObjetNonDeplacableException(obj.getNom()+"n'est pas déplacable");
    this.listeObjs.deposer(obj);
  }

  public void prendre(java.lang.String nomObj) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException{
    this.listeObjs.deposer(this.getObjet(nomObj));
  }

  public java.lang.String toString(){
    StringBuilder desc =new StringBuilder();
    desc.append("---Vivant---").append("\n");
    desc.append(getNom()).append("\n");
    desc.append("Nom du monde ");
    desc.append(getMonde().getNom()).append("\n");
    desc.append("Points de vie ");
    desc.append(getPointVie()).append("\n");
    desc.append("Points de force ");
    desc.append(getPointForce()).append("\n");
    desc.append(getPiece()).append("\n");
    desc.append("Liste des Objets").append("\n");
    for (int i=0;i<this.listeObjs.getTaille();i++){
      desc.append("Objet ");
      desc.append(i+1).append(" ");
      desc.append(this.listeObjs.getObjet(i)).append(" -- ");
    }
    return desc.toString();
  }
}
