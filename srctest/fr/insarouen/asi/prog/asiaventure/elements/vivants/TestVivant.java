package fr.insarouen.asi.prog.asiaventure.vivants;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.Monde;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.Vivant;
import fr.insarouen.asi.prog.asiaventure.elements.structure.Piece;
import fr.insarouen.asi.prog.asiaventure.elements.objets.Objet;

public class TestVivant{
  Vivant vivant;
  Monde monde;
  Entite entite;
  @Before
  public void avantTest(){
     monde= new Monde("monde");
     try {
       Objet o1=new Objet("marteau",m){
           public boolean estDeplacable(){
             return true;
           }
       };
       Objet o2=new Objet("carquois",m){
           public boolean estDeplacable(){
             return true;
           }
       };
       vivant= new Vivant("bidule",monde,50,50,new Piece("Lapiece",monde),new Objet("o1",monde){},new Objet("o2",monde){});
     }
     catch(NomDEntiteDejaUtiliseDansLeMondeException e) {
       System.err.println(e.getMessage());
     }
  }

  @Test
  public void test_constructeur_Vivant() {
    try {
      vivant2= new Vivant("monVivant",monde,50,50,new Piece("Lapiece",monde),new Objet("o1",monde){}, new Objet("o2",monde){});
    }
    catch(NomDEntiteDejaUtiliseDansLeMondeException e) {
      System.err.println(e.getMessage());
  }
}
}
