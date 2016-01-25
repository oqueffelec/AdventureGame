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
    return(this.nomEntite);
  }

  public Monde getMonde() {
    return(this.monde);
  }

  public java.lang.String toString() {
    return(String.Format("Nom de l'entité : %s",this.nomEntité))
  }

  public boolean equals(java.lang.Object o) {
    if (o==this)
      return true;
    if (o.getClass()==getClass()) {
      Entite entite=(Entite)o;
      return(entite.getNom().equals(getNom()) && entite.getMonde());
    }
    return false;
  }

}
