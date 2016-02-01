package fr.insarouen.asi.prog.asiaventure.elements.vivant;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.Monde;


public abstract class Vivant extends Entite {
  private int pointVie;
  private int pointForce;
  private Piece piece;
  private Objet objets;

  // Construteur
  public Vivant(java.lang.String nom, Monde monde, int pointVie, int pointForce, Piece piece, Objet objets) {
    super(nom,monde);
    this.pointVie=pointVie;
    this.pointForce=pointForce;
    this.piece=piece;
    this.objets=objets;
  }
}
