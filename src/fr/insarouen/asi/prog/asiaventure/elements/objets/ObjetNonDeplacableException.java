package fr.insarouen.asi.prog.asiaventure.elements.objets

public class ObjetNonDeplacableException extends ObjetException {
  public ObjetNonDeplacableException(){

  }
  public ObjetNonDeplacableException(String message){
    super(message);
  }
  public ObjetNonDeplacableException(String message, Exception e){
    super(message,e);
  }
}
