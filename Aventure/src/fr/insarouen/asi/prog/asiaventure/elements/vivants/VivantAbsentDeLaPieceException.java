package fr.insarouen.asi.prog.asiaventure.elements.vivants;

import fr.insarouen.asi.prog.asiaventure.elements.structure.*;

public class VivantAbsentDeLaPieceException extends PieceException{

  public VivantAbsentDeLaPieceException(){
    super();
  }

  public VivantAbsentDeLaPieceException(String msg){
    super(msg);
  }

  public VivantAbsentDeLaPieceException(String msg,Exception e){
    super(msg,e);
  }
}
