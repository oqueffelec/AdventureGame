package fr.insarouen.asi.prog.asiaventure.elements.structure;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class TestPiece{

  Monde monde;
  Piece piece;
  Vivant v1,v2;
  Objet o1,o2;
  Objet[] listObj;

  @Before
  public void avantTest() throws NomDEntiteDejaUtiliseDansLeMondeException{
    monde=new Monde("Neverwinter");
    piece=new Piece("Salle de torture",monde);
    o1=new Objet("Marteau",monde){
        public boolean estDeplacable(){
          return true;
        }
    };
    o2=new Objet("Arc",monde){
        public boolean estDeplacable(){
          return true;
        }
    };
    v1=new Vivant("Sir Lancelot",monde,10,4,piece,o1){};
    v2=new Vivant("Demogorgon",monde,50,6,piece,o1){};
    piece.deposer(o1);
  }

  @Test
  public void testConstructeur(){
    assertThat(monde.getEntite("Salle de torture"),IsSame.sameInstance(piece));
  }
/*
  @Test
  public void testDeposerObj() throws NomDEntiteDejaUtiliseDansLeMondeException{
    Objet o3=new Objet("Masse",monde){
        public boolean estDeplacable(){
          return true;
        }
    };
    piece.deposer(o3);
    assertThat(piece.getObjets(),IsEqual.equalTo(new Objet[]{o1,o2,o3}));
  }
*/
  @Test
  public void testEntrer() throws VivantAbsentDeLaPieceException{
    piece.sortir(v1);
    piece.entrer(v1);
    assertTrue(piece.contientVivant(v1));
  }

  @Test
  public void testgetObjets(){
    assertTrue(piece.getObjets().contains(o1));
  }

  @Test
  public void testretirerObj() throws ObjetAbsentDeLaPieceException,ObjetNonDeplacableException{
    piece.retirer(o1);
    assertFalse(piece.getObjets().contains(o1));
  }

  @Test
  public void testretirerNom() throws ObjetAbsentDeLaPieceException,ObjetNonDeplacableException{
    piece.retirer("Marteau");
    assertFalse(piece.getObjets().contains(o1));
  }

  @Test
  public void testcontientVivantViv(){
    assertTrue(piece.contientVivant(v1));
  }

  @Test
  public void testcontientVivantNom(){
    assertTrue(piece.contientVivant("Sir Lancelot"));
  }

  @Test
  public void testsortirVivant() throws VivantAbsentDeLaPieceException{
    piece.sortir(v1);
    assertFalse(piece.contientVivant(v1));
  }

  @Test
  public void testsortirNom() throws VivantAbsentDeLaPieceException{
    piece.sortir("Sir Lancelot");
    assertFalse(piece.contientVivant(v1));
  }

  @Test
  public void testcontientObjetObj(){
    assertTrue(piece.contientObjet(o1));
  }

  @Test
  public void testcontientObjetNom(){
    assertTrue(piece.contientObjet("Marteau"));
  }

}
