package fr.insarouen.asi.prog.asiaventure.elements.objets

public class ObjetNonPossedeParLeVivantException extends VivantException{

  public ObjetNonPossedeParLeVivantException(){

  }

  public ObjetNonPossedeParLeVivantException(String msg){
    super(msg);
  }

  public ObjetNonPossedeParLeVivantException(String msg,Throwable e){
    super(msg,e);
  }

}
