package fr.insarouen.asi.prog.asiaventure;
import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.core.*;
import fr.insarouen.asi.prog.asiaventure.Monde;

public class TestMonde{

  @Test
  public void testConstructeur(){
    Monde monde=new Monde("Neverwinter");
    assertThat(monde.getNom(),IsEqual.equalTo("Neverwinter"));
  }
}
