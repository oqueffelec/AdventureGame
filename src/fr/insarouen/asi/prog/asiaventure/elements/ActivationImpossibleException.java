package fr.insarouen.asi.prog.asiaventure.elements;

public class ActivationImpossibleException extends ActivationException{

  public ActivationImpossibleException(){
    super();
  }
  public ActivationImpossibleException(String message){
    super(message);
  }
  public ActivationImpossibleException(String message, Exception e){
    super(message,e);
  }
}
