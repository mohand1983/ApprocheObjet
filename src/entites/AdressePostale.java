package entites;

public class AdressePostale {
	// les attributs
	
	public int numeroDeRue;
	public String libelleDeLaRue;
	public String codePostale;
	public String ville;
	// le constructeur
	
	public AdressePostale(int numeroDeRue, String libelleDeLaRue, String codePostale, String ville) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.libelleDeLaRue = libelleDeLaRue;
		this.codePostale = codePostale;
		this.ville = ville;
	}
	

	public int getNumeroDeRue() {
		return numeroDeRue;
	}


	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}


	public String getLibelleDeLaRue() {
		return libelleDeLaRue;
	}


	public void setLibelleDeLaRue(String libelleDeLaRue) {
		this.libelleDeLaRue = libelleDeLaRue;
	}


	public String getCodePostale() {
		return codePostale;
	}


	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "L'adresse est la  suivante " + numeroDeRue + "--" +libelleDeLaRue+ "--"
				+ codePostale + "-- "+ ville + "]";
	}


	
	
	// la méthode toString
	
	
	
	

}
