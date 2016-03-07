package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public class TestVivant{
  Vivant vivant;
  Monde monde;
  Piece piece;
  Entite entite;
  Objet o1,o2;
/*
  @Before
  public void avantTest() throws NomDEntiteDejaUtiliseDansLeMondeException{
     monde= new Monde("monde");
     piece=new Piece("Salle de Torture",monde);
     o1=new Objet("marteau",monde){
           public boolean estDeplacable(){
             return true;
           }
       };
     o2=new Objet("carquois",monde){
           public boolean estDeplacable(){
             return true;
           }
       };
     vivant=new Vivant("Drizzt",monde,0,0,piece,o1){};
     piece.deposer(new Objet[]{o1,o2});

    }

    @Test
    public void testestMort() {
      assertTrue(vivant.estMort());
    }

    @Test
    public void testDeposer() throws ObjetNonPossedeParLeVivantException{
      vivant.deposer(o1);
      assertFalse(vivant.possede(o1));
    }

    @Test
    public void testPrendre() throws ObjetAbsentDeLaPieceException,ObjetNonDeplacableException{
      vivant.prendre(o1);
      assertTrue(vivant.possede(o1));
    }

    @Test(expected=NomDEntiteDejaUtiliseDansLeMondeException.class)
    public void testConstructeurVivant() throws NomDEntiteDejaUtiliseDansLeMondeException{
      Vivant vivant2=new Vivant("Drizzt",monde,0,0,piece,o1){};
    }*/
}
