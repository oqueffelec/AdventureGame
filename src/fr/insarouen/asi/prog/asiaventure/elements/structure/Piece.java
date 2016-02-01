package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.vivant.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.lib.*;

public class Piece extends ElementStructurel{

  ListeObjet listeObj;
  ListeVivant listeViv;

  public Piece(String nom,Monde monde){
    super(nom,monde);
    this.listeObj=new ListeObjet();
    this.listeViv=new ListeVivant();
  }

  public Objet[] getObjets(){
      return this.listeObj.getObjets();
  }

  public Objet retirer(Objet obj){
    return this.listeObj.retirer(obj.getNom());
  }

  public Objet retirer(String nom){
    return this.listeObj.retirer(nom);
  }

  public boolean contientObjet(Objet objet){
    return this.listeObj.contientObjet(objet.getNom());
  }

  public boolean contientObjet(String nom){
    return this.listeObj.contientObjet(nom);
  }

  public boolean contientVivant(Vivant vivant){
    return this.listeViv.contientVivant(vivant.getNom());
  }

  public boolean contientVivant(String nom){
    return this.listeViv.contientVivant(nom);
  }

  public void deposer(Objet obj){
    this.listeObj.deposer(obj);
  }

  public String toString(){
    StringBuilder desc=new StringBuilder();
    for(int i=0;i<this.listeObj.getTaille();i++){
      desc.append("Objet ");
      desc.append(i+1);
      desc.append(" : ");
      desc.append(this.listeObj.getObjet(i).getNom());
      desc.append(" --- ");
    }
    return desc.toString();
  }
}
