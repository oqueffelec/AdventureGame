package fr.insarouen.asi.prog.asiaventure.elements.structure;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class TestPiece{

  Monde monde;
  Piece piece;
  Objet o1,o2;
  Objet[] listObj;

  @Before
  public void avantTest(){
    monde=new Monde("Neverwinter");
    try{
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
    listObj=new Objet[]{o1,o2};
    piece.deposer(listObj);
    }
    catch(NomDEntiteDejaUtiliseDansLeMondeException e){
  		System.err.println(e.getMessage());
    }
  }

  @Test
  public void testConstructeur(){
    assertThat(monde.getEntite("Salle de torture"),IsSame.sameInstance(piece));
  }

  @Test
  public void testgetObjets(){
    assertThat(piece.getObjets(),IsEqual.equalTo(listObj));

  }


}
