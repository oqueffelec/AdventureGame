package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.elements.objets.*;
import fr.insarouen.asi.prog.asiaventure.*;

public class ObjetException extends ASIAventureException {
  public ObjetException(){
    super();
  }
  public ObjetException(String message){
    super(message);
  }
  public ObjetException(String message, Exception e){
    super(message,e);
  }
}
