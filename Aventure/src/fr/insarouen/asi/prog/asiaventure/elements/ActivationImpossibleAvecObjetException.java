package fr.insarouen.asi.prog.asiaventure.elements;

public class ActivationImpossibleAvecObjetException extends ActivationImpossibleException{

  public ActivationImpossibleAvecObjetException(){
    super();
  }
  public ActivationImpossibleAvecObjetException(String message){
    super(message);
  }
  public ActivationImpossibleAvecObjetException(String message, Exception e){
    super(message,e);
}
}
