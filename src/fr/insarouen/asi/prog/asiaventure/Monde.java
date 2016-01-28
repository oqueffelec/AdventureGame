package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;

/** Classe Monde : chaque monde possede un nom et une/plusieurs entites
 *
 * @author Queffelec Octave
 * @author Le Lain Alexandre
 * @version 1.0 , Janvier 2016.
 */
public class Monde extends java.lang.Object implements java.io.Serializable{

	private String nomDuMonde;
	private Entite[] entites=new Entite[0];

	/** Constructeur de Monde
	* @param nomDuMonde			nom du Monde
	*/
	public Monde(String nomDuMonde){
		this.nomDuMonde=nomDuMonde;
	}

	/** Permet d'ajouter une entite au monde
	 * 
	 * @param entite			on ajoute une entite au monde
	 */
	public void ajouter(Entite entite){
		Entite[] tmp=new Entite[this.entites.length+1];
		for(int i=0;i<this.entites.length;i++){
			tmp[i]=this.entites[i];
		}
		tmp[tmp.length-1]=entite;
		this.entites=tmp;
	}

	/** Permet d'obtenir une entite du monde a partir du nom de celle ci
	 * 
	 * @param nomEntite			le nom de l'entite
	 * @return			retourne l'entite
	 */
	public Entite getEntite(String nomEntite){
		for(int i=0;i<this.entites.length;i++){
			if(this.entites[i].getNom().equals(nomEntite))
				return this.entites[i];
		}
		return null;
	}

	/** Getter de Monde
	 * @return			Nom du Monde
	 */
	public String getNom(){
		return this.nomDuMonde;
	}

	public String toString(){
		StringBuilder desc=new StringBuilder();
		desc.append("Monde ");
		desc.append(this.getNom());
		for(int i=0;i<this.entites.length;i++){
			desc.append(" Entité ");
			desc.append(i+1);
			desc.append(" : ");
			desc.append(this.entites[i].getNom());
			desc.append("  ");
		}
		return desc.toString();
	}
}
