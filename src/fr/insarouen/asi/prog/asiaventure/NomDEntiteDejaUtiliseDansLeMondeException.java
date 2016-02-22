package fr.insarouen.asi.prog.asiaventure

public class NomDEntiteDejaUtiliseDansLeMondeException extends MondeException {
  public NomDEntiteDejaUtiliseDansLeMondeException(){

  }
  public NomDEntiteDejaUtiliseDansLeMondeException(String message){
    super(message);
  }
  public NomDEntiteDejaUtiliseDansLeMondeException(String message, Exception e){
    super(message,e);
  }
}
