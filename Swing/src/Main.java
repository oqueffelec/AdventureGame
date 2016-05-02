import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{

  public static void main(String[] args){

      //------------Exercice 1 ------------------------
      /*
      JFrame exo1 = new JFrame("Exercice 1");
      TextFieldEffacable tf1 = new TextFieldEffacable("Entrez du texte ici",50);
      Container cp = exo1.getContentPane();
      cp.add(tf1);
      exo1.pack();
      exo1.setVisible(true);*/

      //---------------Exercie 2---------------------
      //2.1
      /*
      JFrame exo2 = new JFrame("Exercice 2");
      TextFieldEffacableAdapter tf2 = new TextFieldEffacableAdapter("Entrez du texte ici",50);
      Container cp = exo2.getContentPane();
      cp.add(tf2);
      exo2.pack();
      exo2.setVisible(true);*/

      //2.2
      /*
      JFrame exo2 = new JFrame("Exercice 2");
      JTextField tf2 = new JTextField("Entrez du texte ici",50);
      tf2.addMouseListener(new MouseAdapter(){
                               public void mouseClicked(MouseEvent e){
                                 tf2.setText("");
                               }
                             });
      Container cp = exo2.getContentPane();
      cp.add(tf2);
      exo2.pack();
      exo2.setVisible(true);*/

      //----------------------Exercice 3 ----------------------
      /*
      MouseListener MyListener = new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
          ((JTextField)e.getSource()).setText("");
        }
      };

      JFrame exo3 = new JFrame("Exercice 3");
      Container cp = exo3.getContentPane();
      cp.setLayout(new FlowLayout());
      JTextField[] list=new JTextField[Integer.parseInt(args[0])];
      for(int i=1;i<Integer.parseInt(args[0])+1;i++){
        list[i-1]=new JTextField("Champ "+i,15);
        cp.add(list[i-1]);
        list[i-1].addMouseListener(MyListener);
      }
      exo3.pack();
      exo3.setVisible(true);*/
  }

}
