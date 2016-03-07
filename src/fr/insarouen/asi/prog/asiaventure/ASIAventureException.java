package fr.insarouen.asi.prog.asiaventure;

public class ASIAventureException extends java.lang.Exception {
  public ASIAventureException(){
    super();
  }
  public ASIAventureException(String message){
    super(message);
  }
  public ASIAventureException(String message, Exception e){
    super(message,e);
  }
}
