import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldEffacable extends JTextField implements MouseListener{

  public TextFieldEffacable(String titre,int i){
    super(titre,i);
    this.addMouseListener(this);
  }
  public void mouseClicked(MouseEvent e){
    this.setText("");
  }
  public void mousePressed(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}



}
