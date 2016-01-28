package fr.insarouen.asi.prog.asiaventure.elements;

import fr.insarouen.asi.prog.asiaventure.Monde;

/** Classe Entite : chaque Entite possede un nom et appartient a un seul monde
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public class Entite extends java.lang.Object implements java.io.Serializable {
  private java.lang.String nomEntite;
  private Monde monde;

 
  /** Constructeur de Entite
  * @param nom     nom de l'entite
  * @param monde     monde auquel appartient l'entite
  */
  public Entite(java.lang.String nom, Monde monde) {
    this.nomEntite=nom;
    this.monde=monde;
  }
  

  public java.lang.String getNom() {
    return(this.nomEntite);
  }

  public Monde getMonde() {
    return(this.monde);
  }
  
  public java.lang.String toString() {
    return(String.format("Nom de l'entité : %s",this.nomEntite));
  }

  public int hashCode() { 
    return this.nomEntite.hashCode()+this.monde.hashCode();
  }

  public boolean equals(java.lang.Object o) {
    if (o==this)
      return true;
    if (o.getClass()==getClass()) {
      Entite entite=(Entite)o;
      return entite.getNom().equals(getNom()) && entite.getMonde()==this.getMonde();
    }
    return false;
  }

}
