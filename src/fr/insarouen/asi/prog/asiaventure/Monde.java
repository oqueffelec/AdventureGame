package fr.insarouen.asi.prog.asiaventure;

import fr.insarouen.asi.prog.asiaventure.elements.Entite;

public class Monde extends java.lang.Object implements java.io.Serializable{

	private String nomDuMonde;
	private Entite[] entites=new Entite[0];

	public Monde(String nomDuMonde){
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

	public String getNom(){
		return this.nomDuMonde;
	}

	public String toString(){
		StringBuilder desc=new StringBuilder();
		desc.append("Monde ");
		desc.append(this.getNom());
		desc.append(" ");
		for(int i=0;i<this.entites.length;i++){
			desc.append("Entité ");
			desc.append(this.entites[i].getNom());
		}
		return desc.toString();
	}
}
