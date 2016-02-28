package fr.insarouen.asi.prog.asiaventure.elements.structure;

public class PieceException extends ElementStructurelException{

  public PieceException(){
    super();
  }

  public PieceException(String msg){
    super(msg);
  }

  public PieceException(String msg,Exception e){
    super(msg,e);
  }

}
