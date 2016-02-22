package fr.insarouen.asi.prog.asiaventure.elements.vivants

public class CommandeImpossiblePourLeVivantException extends VivantException {
  public CommandeImpossiblePourLeVivantException(){

  }
  public CommandeImpossiblePourLeVivantException(String message){
    super(message);
  }
  public CommandeImpossiblePourLeVivantException(String message, Exception e){
    super(message,e);
  }
}
