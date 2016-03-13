package fr.insarouen.asi.prog.asiaventure.elements.structure;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;

public class TestPorte{

  Monde monde;
  Piece p1,p2;
  Porte porte;
  Objet o1;

  @Before
  public void avantTest() throws NomDEntiteDejaUtiliseDansLeMondeException{
    monde=new Monde("Neverwinter");
    p1=new Piece("p1",monde);
    p2=new Piece("p2",monde);
    porte=new Porte("La Porte",monde,p1,p2);
    o1=new Objet("Marteau",monde){
        public boolean estDeplacable(){
          return true;
        }
    };
  }

  @Test
  public void testConstructeur(){
    assertTrue(porte.getNom().equals("La Porte"));
  }

  @Test
  public void testActivableAvec() throws ActivationImpossibleAvecObjetException,ActivationImpossibleException{
    porte.activerAvec(o1);
    assertTrue(porte.activableAvec(o1));
  }

  @Test
  public void testgetPieceAutreCote(){
    assertTrue(porte.getPieceAutreCote(p1).equals(p2));
  }

  @Test
  public void testgetEtat(){
    assertTrue(porte.getEtat().toString().equals("FERME"));
  }
}
