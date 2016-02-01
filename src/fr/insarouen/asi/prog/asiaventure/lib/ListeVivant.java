package fr.insarouen.asi.prog.asiaventure.lib;

import fr.insarouen.asi.prog.asiaventure.elements.vivant.*;

public class ListeVivant{

  private Vivant[] listeViv;

  public ListeVivant(){
    this.listeViv=new Vivant[0];
  }

  public Vivant getVivant(int i){
    return this.listeViv[i];
  }

  public Vivant[] getVivants(){
    return this.listeViv;
  }

  public int getTaille(){
    return this.listeViv.length;
  }

  public Vivant retirer(Vivant viv){
    return retirer(viv.getNom());
  }

  public Vivant retirer(String nom){
    if(this.contientVivant(nom)){
      Vivant[] tmp=new Vivant[this.listeViv.length-1];
      int i=0;int j=0;Vivant o=null;
      while(i<this.listeViv.length){
        if(!(this.listeViv[i].getNom().equals(nom))){
          tmp[j]=this.listeViv[i];
          j++;
        }
        else
          o=this.listeViv[i];
        i++;
      }
      this.listeViv=tmp;
      return o;
    }
    else
      return null;

  }

  public boolean contientVivant(Vivant Vivant){
    return contientVivant(Vivant.getNom());
  }

  public boolean contientVivant(String nom){
    boolean contient=false;
    int i=0;
    while(i<this.listeViv.length && !contient){
      if (this.listeViv[i].getNom().equals(nom))
        contient=true;
      i++;
    }
    return contient;
  }

  public void deposer(Vivant viv){
    Vivant[] tmp=new Vivant[this.listeViv.length+1];
    for(int i=0;i<this.listeViv.length;i++)
      tmp[i]=this.listeViv[i];
    tmp[tmp.length-1]=viv;
    this.listeViv=tmp;
  }

}
