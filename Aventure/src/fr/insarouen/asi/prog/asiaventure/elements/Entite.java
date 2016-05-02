package fr.insarouen.asi.prog.asiaventure.elements;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.*;

/** Classe Entite : chaque Entite possede un nom et appartient a un seul monde
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public abstract class Entite extends java.lang.Object implements java.io.Serializable {
  private java.lang.String nomEntite;
  private Monde monde;


  /** Constructeur de Entite
  * @param nom     nom de l'entite
  * @param monde     monde auquel appartient l'entite
  */
  public Entite(java.lang.String nom, Monde monde) throws NomDEntiteDejaUtiliseDansLeMondeException{
    try{
      this.nomEntite=nom;
      this.monde=monde;
      monde.ajouter(this);
    }
    catch(EntiteDejaDansUnAutreMondeException e){
      System.err.println("Ne dois jamais arriver");
      System.err.println(e.getMessage());
      e.printStackTrace();
      System.exit(-1);
    }
  }

  /** Permet d'obtenir nom de l'entité
   *
   * @return			retourne nom de l'entité en caractères
   */
  public java.lang.String getNom() {
    return(this.nomEntite);
  }

  /** Permet d'obtenir le monde associé à cette entité
	 *
	 * @return			retourne le monde
	 */
  public Monde getMonde() {
    return(this.monde);
  }

  /** Permet d'afficher le nom de l'entité
   *
   * @return			retourne l'entité en caractères
   */
  public java.lang.String toString() {
    return(String.format("Nom de l'entité : %s",this.nomEntite));
  }

  /** Permet d'obtenir le hashcode de l'entité en additionant celui du nom et du monde
   *
   * @return			retourne le hashcode
   */
  public int hashCode() {
    return this.nomEntite.hashCode()+this.monde.hashCode();
  }

  /** Verifie l'égalité entre 2 objets
   *
   * @param o			objet
   * @return			retourne boolean
   */
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
