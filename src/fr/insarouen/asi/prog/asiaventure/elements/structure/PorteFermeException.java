package fr.insarouen.asi.prog.asiaventure.elements.structure;

public class PorteFermeException extends ElementStructurelException{

  public PorteFermeException(){
    super();
  }

  public PorteFermeException(String msg){
    super(msg);
  }

  public PorteFermeException(String msg,Exception e){
    super(msg,e);
  }

}
