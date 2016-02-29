package fr.insarouen.asi.prog.asiaventure.elements;


import fr.insarouen.asi.prog.asiaventure.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;

public class TestEntite {
  Monde monde;
  Entite ent1;
  Entite ent2;
  @Before
  public void avantTest(){
     monde= new Monde("monde");
     try {
       ent1= new Entite("bidule",monde){};
     }
     catch(NomDEntiteDejaUtiliseDansLeMondeException e) {
       System.err.println(e.getMessage());
     }
  }

  @Test()
  public void test_constructeurs(){
    try {
      ent2= new Entite("bidule",monde){};
    }
    catch(NomDEntiteDejaUtiliseDansLeMondeException e) {
      System.err.println(e.getMessage());
    }
  }

    @Test
    public void test_getNom(){
      assertEquals(ent1.getNom(),"bidule");
    }

    @Test
    public void test_getMonde(){
      assertEquals(ent1.getMonde(),monde);
    }

    @Test
    public void test_equals(){
      assertTrue(ent1.equals(ent1));
    }

}
