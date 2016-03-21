package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.lib.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;

public class Piece extends ElementStructurel{

  Map<String,Objet> listeObj;
  Map<String,Vivant> listeViv;
  Map<String,Porte> listePortes;

  public Piece(String nom,Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde);
    this.listeObj=new HashMap<>();
    this.listeViv=new HashMap<>();
    this.listePortes=new HashMap<>();
  }

  public void addPorte(Porte porte){
    this.listePortes.put(porte.getNom(),porte);
  }

  public boolean aLaPorte(Porte porte){
    return this.listePortes.containsValue(porte);
  }

  public boolean aLaPorte(String nom){
    return this.listePortes.containsKey(nom);
  }

  public Porte getPorte(String nom){
    return this.listePortes.get(nom);
  }

  public Objet getObjet(String nom){
    return this.listeObj.get(nom);
  }

  public Collection<Objet> getObjets(){
      return this.listeObj.values();
  }

  public Collection<Porte> getPortes() {
    return this.listePortes.values();
  }

  public Objet retirer(Objet obj) thrototalite des donnees necessaires pour reprendre le jeu plus tard.ws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException{
    return (this.retirer(obj.getNom()));
  }

  public Objet retirer(String nom) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException {
    if(!this.listeObj.containsKey(nom))
      throw new ObjetAbsentDeLaPieceException(nom+" est absent de la pièce");
    if (!(this.listeObj.remove(nom).estDeplacable()))
      throw new ObjetNonDeplacableException(nom+"n'est pas déplacable");
      return this.listeObj.remove(nom);
  }

  public Vivant sortir(Vivant vivant) throws VivantAbsentDeLaPieceException{
    return(this.sortir(vivant.getNom()));
  }

  public Vivant sortir(String nom) throws VivantAbsentDeLaPieceException{
    if(!this.listeViv.containsKey(nom))
      throw new VivantAbsentDeLaPieceException(nom+" n'est pas dans la piece");
    return this.listeViv.remove(nom);
  }

  public boolean contientObjet(Objet objet){
    return this.listeObj.containsValue(objet);
  }

  public boolean contientObjet(String nom){
    return this.listeObj.containsKey(nom);
  }

  public boolean contientVivant(Vivant vivant){
    return this.listeViv.containsValue(vivant);
  }

  public boolean contientVivant(String nom){
    return this.listeViv.containsKey(nom);
  }

  public void deposer(Objet obj){
    this.listeObj.put(obj.getNom(),obj);
  }

  public void entrer(Vivant vivant){
    this.listeViv.put(vivant.getNom(),vivant);
  }

  public String toString(){
    StringBuilder desc=new StringBuilder();
    desc.append("Piece ");
    desc.append(super.toString());
    desc.append(" -- liste des objets : ");
    for(String i :this.listeObj.keySet()){
      desc.append("Objet ");
      desc.append(" : ");
      desc.append(i);
      desc.append(" --- ");
    }
    desc.append(" Liste des vivants : ");
    for(String i : this.listeViv.keySet()){
      desc.append("Vivant ");
      desc.append(" : ");
      desc.append(i);
      desc.append(" --- ");
    }
    return desc.toString();
  }

}
