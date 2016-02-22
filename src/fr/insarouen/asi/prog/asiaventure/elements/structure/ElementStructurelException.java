package fr.insarouen.asi.prog.asiaventure.elements.structure

public class ElementStructurelException extends ASIAventureException {
  public ElementStructurelException(){

  }
  public ElementStructurelException(String message){
    super(message);
  }
  public ElementStructurelException(String message, Exception e){
    super(message,e);
  }
}
