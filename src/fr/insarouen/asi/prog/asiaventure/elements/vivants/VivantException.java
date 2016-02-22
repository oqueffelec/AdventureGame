package fr.insarouen.asi.prog.asiaventure.elements.vivants

public class VivantException extends ASIAventureException{

  public VivantException(){

  }

  public VivantException(String msg){
    super(msg);
  }

  public VivantException(String msg,Throwable e){
    super(msg,e);
  }

}
