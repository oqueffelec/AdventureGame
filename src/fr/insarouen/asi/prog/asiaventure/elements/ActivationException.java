package fr.insarouen.asi.prog.asiaventure.elements;
import fr.insarouen.asi.prog.asiaventure.ASIAventureException;

public class ActivationException extends ASIAventureException{

  public ActivationException(){
    super();
  }
  public ActivationException(String message){
    super(message);
  }
  public ActivationException(String message, Exception e){
    super(message,e);
  }
}
