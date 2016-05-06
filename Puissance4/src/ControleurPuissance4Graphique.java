import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Observer;
import java.util.Observable;

public class ControleurPuissance4Graphique extends JFrame {

  private Puissance4 p4;
  JTextField jtf;

  public ControleurPuissance4Graphique(Puissance4 p4){
    super("");
    this.p4=p4;
    setLocationRelativeTo(null);
    monTextField();
  }

  public void monTextField(){
    jtf= new JTextField("",1);
    jtf.addKeyListener(new MyListener());
    JLabel jl = new JLabel("Colonne : ");
    Container c = this.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(jl);
    c.add(jtf);
    this.pack();
    this.setVisible(true);
  }

  class MyListener extends KeyAdapter{

    public void keyPressed(KeyEvent e){
      if(e.getKeyCode()==(KeyEvent.VK_ENTER))
      try{
        p4.joueColonne(Integer.valueOf(jtf.getText())-1);
      }catch(Puissance4ColonneException exep){}
      finally{
        jtf.setText("");
      }
    }
  }

}
