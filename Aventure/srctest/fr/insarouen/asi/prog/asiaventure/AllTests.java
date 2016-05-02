package fr.insarouen.asi.prog.asiaventure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import fr.insarouen.asi.prog.asiaventure.elements.SuiteElements;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.SuiteVivants;
import fr.insarouen.asi.prog.asiaventure.elements.structure.SuiteStructure;
import fr.insarouen.asi.prog.asiaventure.elements.objets.SuiteObjets;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  SuiteAsiaventure.class,
  SuiteElements.class,
  SuiteVivants.class,
  SuiteObjets.class,
  SuiteStructure.class
})

public class AllTests{
}
