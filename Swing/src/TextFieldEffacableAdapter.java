import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldEffacableAdapter extends JTextField {

  public TextFieldEffacableAdapter(String titre,int i){
    super(titre,i);
    this.addMouseListener(new MyListener());
  }

  public class MyListener extends MouseAdapter{
    public void mouseClicked(MouseEvent e){
        setText("");
    }
  }
}
