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
  private Map<String,Objet> listeObjet;

  // Construteur

  public Vivant(java.lang.String nom, Monde monde, int pointVie, int pointForce, Piece piece, Map<String,Objet> listeOb) throws NomDEntiteDejaUtiliseDansLeMondeException {
    super(nom,monde);
    this.pointVie=pointVie;
    this.pointForce=pointForce;
    this.piece=piece;
    this.listeObjet=new HashMap<String,Objet>();
    this.listeObjet.putAll(listeOb);
    piece.entrer(this);
  }


  // Méthodes

  public void activerActivable(Activable activable) throws ActivationException{
      activable.activer();
  }

  public void activerActivableAvecObjet(Activable activable,Objet objet) throws ActivationException{
    activable.activerAvec(objet);
  }

  public void franchir(Porte porte) throws PorteFermeException,PorteInexistanteDansLaPieceException{
    if(porte.getEtat().toString().equals("FERME"))
      throw new PorteFermeException("Porte fermée");
    if(!this.piece.aLaPorte(porte))
      throw new PorteInexistanteDansLaPieceException("La porte n'existe pas dans la piece !");

    this.piece=porte.getPieceAutreCote(this.piece);
  }


  public void franchir(String nom) throws PorteFermeException,PorteInexistanteDansLaPieceException{
    if (this.piece.getPorte(nom).getEtat().toString().equals("FERME"))
      throw new PorteFermeException("Porte fermée");
    if(!this.piece.aLaPorte(this.piece.getPorte(nom)))
      throw new PorteInexistanteDansLaPieceException("La porte n'existe pas dans la piece !");

    this.piece=this.piece.getPorte(nom).getPieceAutreCote(this.piece);
  }


  public void deposer(Objet obj) throws ObjetNonPossedeParLeVivantException{
    if(!this.listeObjet.containsValue(obj))
      throw new ObjetNonPossedeParLeVivantException(obj.getNom()+" n'est pas possede par le vivant");
      this.listeObjet.remove(obj);
  }


  public void deposer(java.lang.String nomObj) throws ObjetNonPossedeParLeVivantException{
    if(!this.listeObjet.containsValue(nomObj))
      throw new ObjetNonPossedeParLeVivantException(nomObj+" n'est pas possede par le vivant");
      this.listeObjet.remove(nomObj);
  }


  public boolean estMort(){
    return (this.pointVie==0);
  }

  public Objet getObjet(java.lang.String nomObjet) throws ObjetNonPossedeParLeVivantException{
    int i=0;
    if (!this.listeObjet.containsValue(nomObjet)){
      throw new ObjetNonPossedeParLeVivantException(nomObjet+" n'est pas possede par le vivant");
    }
    return this.listeObjet.get(nomObjet);
  }

  public Map<java.lang.String,Objet> getObjets(){
    return this.listeObjet;
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
    return this.listeObjet.containsValue(obj);
  }

  public void prendre(Objet obj) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException{
    if(!this.piece.contientObjet(obj))
      throw new ObjetAbsentDeLaPieceException(obj.getNom()+" est absent de la pièce");
    if (!obj.estDeplacable())
      throw new ObjetNonDeplacableException(obj.getNom()+"n'est pas déplacable");
      this.listeObjet.put(obj.getNom(),obj);
  }

  public void prendre(String nomObj) throws ObjetAbsentDeLaPieceException{
    if(!this.piece.contientObjet(nomObj))
      throw new ObjetAbsentDeLaPieceException(nomObj+" est absent de la pièce");
      this.listeObjet.put(nomObj,this.getPiece().getObjet(nomObj));
  }

  public void setPointsDeVie(int pointdevie){
    this.pointVie=pointdevie;
  }

  public void setPiece(Piece lapiece){
    this.piece=lapiece;
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
    for (String i : this.listeObjet.keySet()){
      desc.append("Objet ");
      desc.append(i+1).append(" ");
      desc.append(this.listeObjet.get(i)).append(" -- ");
    }
    return desc.toString();
  }
}
