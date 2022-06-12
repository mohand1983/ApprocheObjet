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
	
	

}
