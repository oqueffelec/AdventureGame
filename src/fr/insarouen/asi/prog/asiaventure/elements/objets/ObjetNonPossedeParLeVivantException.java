package fr.insarouen.asi.prog.asiaventure.elements.objets;

import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;

public class ObjetNonPossedeParLeVivantException extends VivantException{

  public ObjetNonPossedeParLeVivantException(){
    super();
  }

  public ObjetNonPossedeParLeVivantException(String msg){
    super(msg);
  }

  public ObjetNonPossedeParLeVivantException(String msg,Exception e){
    super(msg,e);
  }

}
