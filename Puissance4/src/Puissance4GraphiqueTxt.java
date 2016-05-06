import java.awt.*;
import javax.swing.*;

public class Puissance4GraphiqueTxt {

    public static void main(String[] args) {
	Puissance4 p4 = new Puissance4(5,6);

	JFrame frame=new JFrame("Puissance 4");

	ControleurVuePuissance4Graphique cvp4gr = new ControleurVuePuissance4Graphique(p4);
	ControleurPuissance4Graphique cp4gr = new ControleurPuissance4Graphique(p4);
	VuePuissance4Txt vp4txt = new VuePuissance4Txt(p4);
	ControleurPuissance4Txt cp4txt = new ControleurPuissance4Txt(p4);

	frame.setContentPane(cvp4gr);
  frame.setPreferredSize(new Dimension(500,600));
	frame.pack();
	frame.setVisible(true);

	// en dernier pour ne pas bloquer l'appel suivant
	// sinon utilisation de threads
	cp4txt.joue();
    }
}
