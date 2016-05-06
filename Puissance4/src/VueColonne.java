import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Observer;
import java.util.Observable;

public class VueColonne extends JFrame {

  public VueColonne(String titre){
    super(titre);
    setLocationRelativeTo(null);
    monTextField();
  }

  public void monTextField(){
    JTextField jtf= new JTextField("",1);
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
        System.out.println("hhh");
    }
  }

}
