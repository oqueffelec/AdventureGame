package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import org.junit.*;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.*;
import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.structure.*;
import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class TestJoueurHumain{

    JoueurHumain pj;
    Monde monde;
    Piece piece,piece2;
    Objet o1,o2,o3;
    Porte p1;
    Map<String,Objet> listeOb;

    @Before
    public void avantTest() throws NomDEntiteDejaUtiliseDansLeMondeException{
       monde= new Monde("monde");
       piece=new Piece("Salle de Torture",monde);
       piece2=new Piece("piece2",monde);
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
       o3=new Objet("Excalibur",monde){
               public boolean estDeplacable(){
                 return true;
               }
           };

      p1=new Porte("p1",monde,piece,piece2);
      listeOb=new HashMap<>();
      listeOb.put(o1.getNom(),o1);
      listeOb.put(o2.getNom(),o2);
      pj=new JoueurHumain("Drizzt",monde,0,0,piece,listeOb);
       piece.deposer(o1);
       piece.deposer(o2);
       piece.deposer(o3);
       piece.addPorte(p1);
      }

    @Test(expected=NomDEntiteDejaUtiliseDansLeMondeException.class)
    public void testConstructeur() throws NomDEntiteDejaUtiliseDansLeMondeException{
      assertThat(pj,IsSame.sameInstance(new JoueurHumain("Drizzt",monde,0,0,piece,listeOb)));
    }

    @Test
    public void testExecuter() throws CommandeImpossiblePourLeVivantException,IllegalAccessException,Throwable{
      pj.setOrdre("Prendre Excalibur");
      pj.executer();
      assertTrue(pj.possede(o3));
    }

}
