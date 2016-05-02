package fr.insarouen.asi.prog.asiaventure.elements.objets.serrurerie;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.objets.serrurerie.*;

public class TestSerrure{

  Monde monde;
  Serrure s;
  Clef c,c2;

  @Before
  public void avantTest() throws NomDEntiteDejaUtiliseDansLeMondeException{
    monde=new Monde("Neverwinter");
    s=new Serrure(monde);
    c=s.creerClef();
  }

  @Test
  public void testConstructeur(){
    assertTrue(s.getMonde()==monde && s.getNom()!=null);
  }

  @Test(expected=NomDEntiteDejaUtiliseDansLeMondeException.class)
  public void testCreerClef() throws NomDEntiteDejaUtiliseDansLeMondeException{
    assertTrue(c==s.creerClef());
  }

  @Test
  public void testActivableAvec() throws ActivationException{
    assertTrue(s.activableAvec(c));
  }

  @Test
  public void testGetEtat(){
    assertTrue(s.getEtat().toString().equals("VEROUILLE"));
  }

  @Test(expected=ActivationImpossibleAvecObjetException.class)
  public void testActiverAvec() throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
    s.activerAvec(c2);
  }

  @Test
  public void testActiverAvec2() throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
    s.activerAvec(c);
    assertTrue(s.getEtat().toString().equals("DEVEROUILLE"));
  }

  @Test(expected=ActivationImpossibleException.class)
  public void testActiver() throws ActivationImpossibleException,ActivationException{
    s.activer();
  }
}
