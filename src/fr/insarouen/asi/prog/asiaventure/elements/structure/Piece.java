package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.lib.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;

public class Piece extends ElementStructurel{

  ListeObjet listeObj;
  ListeVivant listeViv;

  public Piece(String nom,Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde);
    this.listeObj=new ListeObjet();
    this.listeViv=new ListeVivant();
  }

  public Objet[] getObjets(){
      return this.listeObj.getObjets();
  }

  public Objet retirer(Objet obj) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException{
    if(!this.listeObj.contientObjet(obj))
      throw new ObjetAbsentDeLaPieceException(obj.getNom()+" est absent de la pièce");
    if (!obj.estDeplacable())
      throw new ObjetNonDeplacableException(obj.getNom()+"n'est pas déplacable");
    return this.listeObj.retirer(obj.getNom());
  }

  public Objet retirer(String nom) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException {
    if(!this.listeObj.contientObjet(nom))
      throw new ObjetAbsentDeLaPieceException(nom+" est absent de la pièce");
    if (!(this.listeObj.retirer(nom).estDeplacable()))
      throw new ObjetNonDeplacableException(nom+"n'est pas déplacable");
      return this.listeObj.retirer(nom);
  }

  public Vivant sortir(Vivant vivant) throws VivantAbsentDeLaPieceException{
    if(!this.contientVivant(vivant))
      throw new VivantAbsentDeLaPieceException(vivant.getNom()+" n'est pas dans la piece");
    return this.listeViv.retirer(vivant.getNom());
  }

  public Vivant sortir(String nom) throws VivantAbsentDeLaPieceException{
    if(!contientVivant(nom))
      throw new VivantAbsentDeLaPieceException(nom+" n'est pas dans la piece");
    return this.listeViv.retirer(nom);
  }

  public boolean contientObjet(Objet objet){
    return this.listeObj.contientObjet(objet.getNom());
  }

  public boolean contientObjet(String nom){
    return this.listeObj.contientObjet(nom);
  }

  public boolean contientVivant(Vivant vivant){
    return this.listeViv.contientVivant(vivant);
  }

  public boolean contientVivant(String nom){
    return this.listeViv.contientVivant(nom);
  }

  public void deposer(Objet obj){
    this.listeObj.deposer(obj);
  }

  public void deposer(Objet[] objets){
    for(int i=0;i<objets.length;i++)
      this.listeObj.deposer(objets[i]);
  }

  public void entrer(Vivant vivant){
    this.listeViv.deposer(vivant);
  }

  public String toString(){
    StringBuilder desc=new StringBuilder();
    desc.append("Piece ");
    desc.append(super.toString());
    desc.append(" -- liste des objets : ");
    for(int i=0;i<this.listeObj.getTaille();i++){
      desc.append("Objet ");
      desc.append(i+1);
      desc.append(" : ");
      desc.append(this.listeObj.getObjet(i).getNom());
      desc.append(" --- ");
    }
    desc.append(" Liste des vivants : ");
    for(int i=0;i<this.listeViv.getTaille();i++){
      desc.append("Vivant ");
      desc.append(i+1);
      desc.append(" : ");
      desc.append(this.listeViv.getVivant(i).getNom());
      desc.append(" --- ");
    }
    return desc.toString();
  }
}
