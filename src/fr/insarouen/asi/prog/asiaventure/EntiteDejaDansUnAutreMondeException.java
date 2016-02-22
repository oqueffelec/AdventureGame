package fr.insarouen.asi.prog.asiaventure

public class EntiteDejaDansUnAutreMondeException extends MondeException {
  public EntiteDejaDansUnAutreMondeException(){

  }
  public EntiteDejaDansUnAutreMondeException(String message){
    super(message);
  }
  public EntiteDejaDansUnAutreMondeException(String message, Exception e){
    super(message,e);
  }
}
