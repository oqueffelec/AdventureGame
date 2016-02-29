package fr.insarouen.asi.prog.asiaventure.elements.objets;
import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class TestObjet{

  Monde monde;
  Entite objet;

  @Before
  public void avantTest(){
    monde=new Monde("Neverwinter");
    try{
    objet=new Objet("Marteau",monde){
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
    assertThat(monde.getEntite("Marteau"),IsSame.sameInstance(objet));
  }


}
