package fr.insarouen.asi.prog.asiaventure.elements;

import fr.insarouen.asi.prog.asiaventure.elements.objets.*;

public interface Activable{

    boolean activableAvec(Objet obj) throws ActivationException;
    void activer() throws ActivationException;
    void activerAvec(Objet obj) throws ActivationImpossibleAvecObjetException,ActivationImpossibleException;

}
