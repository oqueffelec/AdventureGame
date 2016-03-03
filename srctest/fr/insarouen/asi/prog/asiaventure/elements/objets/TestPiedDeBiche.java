package fr.insarouen.asi.prog.asiaventure.elements.objets;
import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class TestPiedDeBiche{

  Monde monde;
  Entite pdb;

  @Before
  public void avantTest(){
    monde=new Monde("Neverwinter");
    try{
    pdb=new PiedDeBiche("Excalibur",monde){
        public boolean estDeplacable(){
          return true;
        }
    };
    }
    catch(NomDEntiteDejaUtiliseDansLeMondeException e){
  		System.err.println(e.getMessage());
    }
  }

  @Test
  public void testConstructeur(){
    assertThat(monde.getEntite("Excalibur"),IsSame.sameInstance(pdb));
  }


}
