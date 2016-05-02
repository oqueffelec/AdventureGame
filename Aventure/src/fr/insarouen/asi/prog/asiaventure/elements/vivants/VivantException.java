package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import fr.insarouen.asi.prog.asiaventure.*;

public class VivantException extends ASIAventureException{

  public VivantException(){
    super();
  }

  public VivantException(String msg){
    super(msg);
  }

  public VivantException(String msg,Exception e){
    super(msg,e);
  }

}
