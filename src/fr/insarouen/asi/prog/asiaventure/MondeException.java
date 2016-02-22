package fr.insarouen.asi.prog.asiaventure;

public class MondeException extends ASIAventureException {
  public MondeException(){

  }
  public MondeException(String message){
    super(message);
  }
  public MondeException(String message, Exception e){
    super(message,e);
  }
}
