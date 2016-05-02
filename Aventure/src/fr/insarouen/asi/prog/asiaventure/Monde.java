package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;
import fr.insarouen.asi.prog.asiaventure.elements.vivants.*;
import fr.insarouen.asi.prog.asiaventure.elements.*;
import java.util.*;
import java.util.HashMap;



/** Classe Monde : chaque monde possede un nom et une/plusieurs entites
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public class Monde extends java.lang.Object implements java.io.Serializable{

	private String nomDuMonde;
	private Map<String,Entite> entites;


	/** Constructeur de Monde
	* @param nomDuMonde			nom du Monde
	*/
	public Monde(String nomDuMonde){
		this.nomDuMonde=nomDuMonde;
		this.entites=new HashMap();
	}

	/** Permet d'ajouter une entite au monde
	 *
	 * @param entite			on ajoute une entite au monde
	 */
	public void ajouter(Entite entite) throws NomDEntiteDejaUtiliseDansLeMondeException,EntiteDejaDansUnAutreMondeException{
		if(!(entite.getMonde()==this))
			throw new EntiteDejaDansUnAutreMondeException(entite.getNom()+" Existe déja dans un autre monde");
		if(!(this.getEntite(entite.getNom())==null))
			throw new NomDEntiteDejaUtiliseDansLeMondeException(entite.getNom() + " Existe déja dans ce monde");

		entites.put(entite.getNom(),entite);
	}

	/** Permet d'obtenir une entite du monde a partir du nom de celle ci
	 *
	 * @param nomEntite			le nom de l'entite
	 * @return			retourne l'entite
	 */
	public Entite getEntite(String nomEntite){
		for(Entite ite : entites.values()){
			if(entites.containsKey(nomEntite))
				return entites.get(nomEntite);
		}
		return null;
	}

	public List<JoueurHumain> getJoueurHumains(){
		List<JoueurHumain> jh=new ArrayList();
		for(Entite e : entites.values()){
			if(e instanceof JoueurHumain){
				jh.add((JoueurHumain)e);
			}
		}
			return jh;
	}

	/** Getter de Monde
	 * @return			Nom du Monde
	 */
	public String getNom(){
		return this.nomDuMonde;
	}

	public Collection<Executable> getExecutables(){
		Collection c=new ArrayList<Executable>();
		for(Entite ite : entites.values()){
			if(entites.get(ite) instanceof Executable){
				c.add(ite);
			}
		}
		return c;
	}

	public String toString(){
		StringBuilder desc=new StringBuilder();
		desc.append("Monde ");
		desc.append(this.getNom());
		for(String ite:entites.keySet()){
			desc.append(this.entites.get(ite));
			desc.append("  ");
		}
		return desc.toString();
	}
}
