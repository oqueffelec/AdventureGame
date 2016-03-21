package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
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

  private Monde monde;

  public Simulateur(ObjectInputStream ois) throws IOException,ClassNotFoundException{
    ois.readObject();
    ois.close();
  }

  public Simulateur(Reader reader) throws IOException{/*
    StreamTokenizer st=new StreamTokenizer(reader);
    st.nextToken();
    switch(st.sval){
      case "Monde" :  construireMonde(st);
      break;
      case "Piece" :
      break;
      case "Porte" :
      break;
      case "PorteSerrure" :
      break;
      case "Clef" :
      break;
      case "JoueurHumain" :
      break;
    }*/
  }

  public void enregistrer(ObjectOutputStream oos) throws IOException{
    oos.writeObject(this.monde);
    oos.close();
  }
}
