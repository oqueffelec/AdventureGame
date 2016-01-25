package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.Entite;

public class Monde extends java.lang.Object implements java.io.Serializable{

	private String nomDuMonde;
	private Entite[] entites=new Entite[0];

	public void Monde(String nomDuMonde){
		this.nomDuMonde=nomDuMonde;
	}

	public void ajouter(Entite entite){
		Entite[] tmp=new Entite[this.entites.length+1];
		for(int i=0;i<this.entites.length;i++){
			tmp[i]=this.entites[i];
		}
		tmp[tmp.length-1]=entite;
		this.entites=tmp;
	}

	public Entite getEntite(String nomEntite){
		for(int i=0;i<this.entites.length;i++){
			if(this.entites[i].getNom().equals(nomEntite))
				return this.entites[i];
		}
		return null;
	}
	pu
}
