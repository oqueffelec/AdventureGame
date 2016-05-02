package fr.insarouen.asi.prog.asiaventure.elements;

import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public interface Activable{

    boolean activableAvec(Objet obj);
    void activer() throws ActivationException;
    void activerAvec(Objet obj) throws ActivationException;

}
