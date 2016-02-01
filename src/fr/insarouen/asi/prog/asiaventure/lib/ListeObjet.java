package fr.insarouen.asi.prog.asiaventure.lib;

import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class ListeObjet{

  private Objet[] listeObj;

  public ListeObjet(){
    this.listeObj=new Objet[0];
  }

  public ListeObjet(Objet[] obj){
    Objet[] tmp=new Objet[ob.length];
    for(int i=0;i<obj.length;i++)
      tmp[i]=obj[i];
    this.listeObj=tmp;
  }

  public Objet getObjet(int i){
    return this.listeObj[i];
  }

  public Objet[] getObjets(){
    return this.listeObj;
  }

  public int getTaille(){
    return this.listeObj.length;
  }

  public Objet retirer(Objet obj){
    return retirer(obj.getNom());
  }

  public Objet retirer(String nom){
    if(this.contientObjet(nom)){
      Objet[] tmp=new Objet[this.listeObj.length-1];
      int i=0;int j=0;Objet o=null;
      while(i<this.listeObj.length){
        if(!(this.listeObj[i].getNom().equals(nom))){
          tmp[j]=this.listeObj[i];
          j++;
        }
        else
          o=this.listeObj[i];
        i++;
      }
      this.listeObj=tmp;
      return o;
    }
    else
      return null;

  }

  public boolean contientObjet(Objet objet){
    return contientObjet(objet.getNom());
  }

  public boolean contientObjet(String nom){
    boolean contient=false;
    int i=0;
    while(i<this.listeObj.length && !contient){
      if (this.listeObj[i].getNom().equals(nom))
        contient=true;
      i++;
    }
    return contient;
  }

  public void deposer(Objet obj){
    Objet[] tmp=new Objet[this.listeObj.length+1];
    for(int i=0;i<this.listeObj.length;i++)
      tmp[i]=this.listeObj[i];
    tmp[tmp.length-1]=obj;
    this.listeObj=tmp;
  }

}
