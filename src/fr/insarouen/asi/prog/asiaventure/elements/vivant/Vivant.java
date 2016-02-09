package fr.insarouen.asi.prog.asiaventure.elements.vivant;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
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

  public Vivant(java.lang.String nom, Monde monde, int pointVie, int pointForce, Piece piece, Objet[] objets) {
    super(nom,monde);
    this.pointVie=pointVie;
    this.pointForce=pointForce;
    this.piece=piece;
    this.listeObjs=new ListeObjet(objets);
  }


  // Méthodes

  public void deposer(java.lang.String nomObj){
    this.listeObjs.retirer(nomObj);
  }


  public void deposer(Objet obj){
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

  public void prendre(Objet obj){
    if (this.piece.contientObjet(obj) && obj.estDeplacable()){
      ListeObjet tmp=new ListeObjet();
      for(int i=0;i<=this.listeObjs.getTaille();i++){
        tmp.deposer(this.listeObjs.getObjet(i));
      }
      tmp.deposer(obj);
    }
  }

  public void prendre(java.lang.String nomObj){
    if (this.listeObjs.contientObjet(nomObj) && getObjet(nomObj).estDeplacable()){
      ListeObjet tmp=new ListeObjet();
      for(int i=0;i<=this.listeObjs.getTaille();i++){
        tmp.deposer(this.listeObjs.getObjet(i));
      }
      tmp.deposer(getObjet(nomObj));
    }
  }

  public java.lang.String toString(){
    StringBuilder desc =new StringBuilder();
    desc.append("---Vivant---");
    desc.append("Nom du vivant");
    desc.append(getNom());
    desc.append("Nom du monde");
    desc.append(getMonde());
    desc.append("Points de vie");
    desc.append(getPointVie());
    desc.append("Points de force");
    desc.append(getPointForce());
    desc.append("Piece");
    desc.append(getPiece());
    desc.append("Liste des Objets");
    for (int i=0;i<this.listeObjs.getTaille();i++){
      desc.append("Objet");
      desc.append(i+1);
      desc.append(this.listeObjs.getObjet(i));
    }
    return desc.toString();
  }
}
