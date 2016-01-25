package fr.insarouen.asi.prog.asiaventure.elements;

import java.lang.Object;
import java.io.Serializable;

public class Entite extends java.lang.Object implements java.io.Serializable {
  private java.lang.String nomEntite;
  private Monde monde;

  //Constructeur//

  public Entite(java.lang.String nom, Monde monde) {
    this.nomEntite=nom;
    this.monde=monde;
  }
  // Methodes//

  public java.lang.String getNom() {
    
  }
}
