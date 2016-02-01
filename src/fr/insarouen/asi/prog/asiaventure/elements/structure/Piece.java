package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class Piece extends ElementStructurel{

  Objet[] listeObj;

  public Piece(String nom,Monde monde){
    super(nom,monde);
    this.listeObj=new Objet[0];
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

  public String toString(){
    StringBuilder desc=new StringBuilder();
    for(int i=0;i<this.listeObj.length;i++){
      desc.append("Objet ");
      desc.append(i);
      desc.append(" : ");
      desc.append(this.listeObj[i].getNom());
      desc.append(" --- ");
    }
    return desc.toString();
  }
}
