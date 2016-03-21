package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.EntiteDejaDansUnAutreMondeException;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;
import java.util.*;


public class Monstre extends Vivant{



  // Constructeur

  public Monstre(java.lang.String nom, Monde monde, int pointVie, int pointForce, Piece piece, Map<String,Objet> listeOb) throws NomDEntiteDejaUtiliseDansLeMondeException {
    super(nom,monde,pointVie,pointForce,piece,listeOb);

  }

  // Methodes

  public void franchirUnePorte(Porte porte) throws ObjetAbsentDeLaPieceException,PorteInexistanteDansLaPieceException,ActivationImpossibleException{
    if(!getPiece().aLaPorte(porte))
      throw new PorteInexistanteDansLaPieceException("La porte n'existe pas dans la piece !");
    if(porte.getEtat().toString().equals("FERME"))
      porte.activer();
    setPiece(porte.getPieceAutreCote(getPiece()));
    setPointsDeVie(getPointVie()-1);
  }


  public void transfertObjets() throws ObjetNonDeplacableException,ObjetAbsentDeLaPieceException{
    Map<String,Objet> listeObjetTemp=new HashMap<>();
    for (Objet value : getPiece().getObjets()){
      if (getPiece().retirer(value).estDeplacable())
        listeObjetTemp.put(value.toString(),value);
        getPiece().getObjets().remove(value);
    }
    for (Objet value : getObjets().values()){
      getPiece().getObjets().add(value);
      getObjets().remove(value);
    }
    for(Objet value : listeObjetTemp.values()){
      getObjets().put(value.toString(),value);
    }
  }

  public Porte porteAlea()throws ObjetAbsentDeLaPieceException{
    Random generator = new Random();
    Object[] values = getPiece().getPortes().toArray();
    Porte aleaporte=(Porte)values[generator.nextInt(values.length)];
    return aleaporte;
  }

  public void executer()throws ObjetAbsentDeLaPieceException,PorteInexistanteDansLaPieceException,ActivationImpossibleException,ObjetNonDeplacableException{
    while(!estMort()){
      franchirUnePorte(porteAlea());
      transfertObjets();
    }
  }
}
