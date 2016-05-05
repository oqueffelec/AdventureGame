import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{

  public static void main(String[] args){

      //Exercice 1
      /*
      JFrame exo1 = new JFrame("Exercice 1");
      TextFieldEffacable tf1 = new TextFieldEffacable("Entrez du texte ici",50);
      Container cp = exo1.getContentPane();
      cp.add(tf1);
      exo1.pack();
      exo1.setVisible(true);*/

      //Exercie 2
      //2.1
      /*JFrame exo2 = new JFrame("Exercice 2");
      TextFieldEffacableAdapter tf2 = new TextFieldEffacableAdapter("Entrez du texte ici",50);
      Container cp = exo2.getContentPane();
      cp.add(tf2);
      exo2.pack();
      exo2.setVisible(true);

      //2.2

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


            //Exercice 4
            /*
            JFrame exo4 = new JFrame("exo 4");
            TextFieldEffacableAdapter tf3=new TextFieldEffacableAdapter("Entrez du texte ici",50);
             class MyListener extends MouseAdapter{
              public void mouseClicked(MouseEvent e){
                  tf3.setText("");
              }
            }
            MonBoutton boutton=new MonBoutton("Effacer");
            boutton.addMouseListener(new MyListener());
            Container cp=exo4.getContentPane();
            cp.setLayout(new FlowLayout());
            cp.add(tf3);
            cp.add(boutton);
            exo4.pack();
            exo4.setVisible(true);*/

        //Exercice 5
        JFrame exo5 = new JFrame("Exercice 5");
        Container cp = exo5.getContentPane();
        cp.setLayout(new BorderLayout());
        JPanel milieu = new JPanel();
        milieu.setLayout(new BoxLayout(milieu,BoxLayout.Y_AXIS));

        GestionListe l1= new GestionListe();
        GestionListe l2= new GestionListe();

        MyButton b1 = new MyButton(">");
        b1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        b1.addActionListener(new MyListener(l2,l1));
        MyButton b2 = new MyButton("<");
        b2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        b2.addActionListener(new MyListener(l1,l2));

        milieu.add(b1);
        milieu.add(b2);
        cp.add(milieu,BorderLayout.CENTER);
        cp.add(l1,BorderLayout.EAST);
        cp.add(l2,BorderLayout.WEST);
        exo5.pack();
        exo5.setVisible(true);

  }
}

  class MyListener implements ActionListener{
    GestionListe l1,l2;
    public MyListener(GestionListe l1, GestionListe l2){
        this.l1=l1;
        this.l2=l2;
    }
    public void actionPerformed(ActionEvent e){
      l2.addElement(l1.removeSelection());
    }
}
