package fr.insarouen.asi.prog.asiaventure

public class ASIAventureException extends java.lang.Exception {
  public ASIAventureException(){

  }
  public ASIAventureException(String message){
    super(message);
  }
  public ASIAventureException(String message, Exception e){
    super(message,e);
  }
}
