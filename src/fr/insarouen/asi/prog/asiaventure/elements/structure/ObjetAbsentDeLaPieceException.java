package fr.insarouen.asi.prog.asiaventure.elements.structure

public class ObjetAbsentDeLaPieceException extends PieceException {
  public ObjetAbsentDeLaPieceException(){

  }
  public ObjetAbsentDeLaPieceException(String message){
    super(message);
  }
  public ObjetAbsentDeLaPieceException(String message, Exception e){
    super(message,e);
  }
}
