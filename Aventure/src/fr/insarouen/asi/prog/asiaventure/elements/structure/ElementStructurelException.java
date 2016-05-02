package fr.insarouen.asi.prog.asiaventure.elements.structure;

import fr.insarouen.asi.prog.asiaventure.*;

public class ElementStructurelException extends ASIAventureException {
  public ElementStructurelException(){
    super();
  }
  public ElementStructurelException(String message){
    super(message);
  }
  public ElementStructurelException(String message, Exception e){
    super(message,e);
  }
}
