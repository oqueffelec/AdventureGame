package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.Monde;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.lang.reflect.*;

public class JoueurHumain extends Vivant{

  private String ordre;

  public JoueurHumain(String nom, Monde monde, int pointVie, int pointForce, Piece piece, Map<String,Objet> listeOb) throws NomDEntiteDejaUtiliseDansLeMondeException{
    super(nom,monde,pointVie,pointForce,piece,listeOb);
    this.ordre=null;
  }

  public void executer() throws CommandeImpossiblePourLeVivantException,IllegalAccessException,Throwable{
    String[] tab = ordre.split(" ");
    Class[] tabf = new Class[tab.length-1];
    for(int i =0;i<tabf.length;i++){
      tabf[i]=tab[i+1].getClass();
    }
    Object[] tabe = new Object[tab.length-1];
      for(int i=0;i<tabe.length;i++)
        tabe[i]=tab[i+1];

    Method m=this.getClass().getDeclaredMethod("commande" +tab[0],tabf);
    m.invoke(this,tabe);
  }

  public void setOrdre(String ordre){
    this.ordre=ordre;
  }

  private void commandePrendre(String nomObjet) throws ObjetAbsentDeLaPieceException, ObjetNonDeplacableException{
    prendre(nomObjet);
  }
  private void commandePoser(String nomObjet) throws ObjetNonPossedeParLeVivantException{
    deposer(nomObjet);
  }
  private void commandeFranchir(String nomPorte) throws PorteFermeException, PorteInexistanteDansLaPieceException{
    franchir(nomPorte);
  }
  private void commandeOuvrirPorte(String nomPorte)throws ActivationException, PorteInexistanteDansLaPieceException{
    getPiece().getPorte(nomPorte).activer();
  }
  private void commandeOuvrirPorte(String nomPorte, String nomObjet) throws ActivationException, PorteInexistanteDansLaPieceException,ObjetNonPossedeParLeVivantException{
    getPiece().getPorte(nomPorte).activerAvec(getObjet(nomObjet));
  }

}
