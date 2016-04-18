package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.serrurerie.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.lib.ListeObjet;
import fr.insarouen.asi.prog.asiaventure.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.io.*;
import java.lang.*;


public class Simulateur extends java.lang.Object {

  protected Monde monde;

  public Simulateur(ObjectInputStream ois) throws IOException,ClassNotFoundException{
    ois.readObject();
    ois.close();
  }

  public Simulateur(Reader reader) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    StreamTokenizer st=new StreamTokenizer(reader);
    while(st.nextToken()!=st.TT_EOF){
      switch(st.sval){//ERREUR VIENT DU FAIT QU IL FAUT TRAITER LE RESTE DES CASE ///
        case "Monde" :  construireMonde(st);
        break;
        case "Piece" :  construirePiece(st);
        break;
        case "Porte" :  construirePorte(st);
        break;
        case "PorteSerrure" : construirePorteSerrure(st);
        break;
        case "Clef" : construireClef(st);
        break;
        case "JoueurHumain" : construireJoueurHumain(st);
        break;
        case "ConditionDeFinVivantDansPiece" : construireConditionDeFinVivantDansPiece(st);
        break;
      }
    }
  }

  public void enregistrer(ObjectOutputStream oos) throws IOException{
    oos.writeObject(this.monde);
    oos.close();
  }

  public void construireMonde(StreamTokenizer st) throws IOException{
    st.nextToken();
    monde=new Monde(st.sval);
  }

  public void construirePiece(StreamTokenizer st) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    st.nextToken();
    new Piece(st.sval,this.monde);
  }

  public void construirePorte(StreamTokenizer st) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    st.nextToken();
    String nomPorte=st.sval;
    st.nextToken();
    String nomP1=st.sval;
    st.nextToken();
    String nomP2=st.sval;
    new Porte(nomPorte,this.monde,(Piece)(this.monde.getEntite(nomP1)),(Piece)(this.monde.getEntite(nomP2)));
  }

  public void construirePorteSerrure(StreamTokenizer st) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    st.nextToken();
    String nomPorte=st.sval;
    st.nextToken();
    String nomP1=st.sval;
    st.nextToken();
    String nomP2=st.sval;
    new Porte(nomPorte,this.monde,(Piece)(this.monde.getEntite(nomP1)),(Piece)(this.monde.getEntite(nomP2)),new Serrure(this.monde));
  }

  public void construireClef(StreamTokenizer st) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    st.nextToken();
    ((Porte)this.monde.getEntite(st.sval)).getSerrure().creerClef();
  }

  public void construireJoueurHumain(StreamTokenizer st) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    st.nextToken();
    String nomPorte=st.sval;
    st.nextToken();
    int hp=(int)st.nval;
    st.nextToken();
    int str=(int)st.nval;
    st.nextToken();
    String nomP=st.sval;
    Map hm=new HashMap<String,Objet>();
    new JoueurHumain(nomPorte,this.monde,hp,str,(Piece)(this.monde.getEntite(nomP)),hm);
    System.out.println(monde);
  }

  public void construireConditionDeFinVivantDansPiece(StreamTokenizer st) throws IOException,NomDEntiteDejaUtiliseDansLeMondeException{
    st.nextToken();
    EtatDuJeu s=EtatDuJeu.valueOf(st.sval);
    st.nextToken();
    String nomV=st.sval;
    st.nextToken();
    String nomP=st.sval;
    new ConditionDeFinVivantDansPiece(s,(Vivant)(this.monde.getEntite(nomV)),(Piece)(this.monde.getEntite(nomP)));
  }
}
