package fr.insarouen.asi.prog.asiaventure.elements.vivant;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;


public abstract class Vivant extends Entite implements {
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
