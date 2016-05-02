package fr.insarouen.asi.prog.asiaventure;
import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class TestMonde{

  Monde monde;
  Entite entite;

  @Before
  public void avantTest(){
    monde=new Monde("Neverwinter");
    try{
      entite=new Entite("Archer",monde){};
    }
    catch(NomDEntiteDejaUtiliseDansLeMondeException e){
  		System.err.println(e.getMessage());
    }
  }

  @Test
  public void testgetNom(){
    assertEquals(monde.getNom(),"Neverwinter");
  }

  @Test
  public void testConstructeur(){
    assertEquals(monde.getNom(),"Neverwinter");
  }

  @Test
  public void testajouter(){
    assertEquals(monde.getEntite("Archer"),entite);
  }
}
