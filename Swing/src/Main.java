import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{

  public static void main(String[] args){

      //Exercice 1
      JFrame exo1 = new JFrame("Exercice 1");
      TextFieldEffacable tf1 = new TextFieldEffacable("Entrez du texte ici",50);
      Container cp = exo1.getContentPane();
      cp.add(tf1);
      exo1.pack();
      exo1.setVisible(true);

  }
}
