package entites2;

public class Personne {

		// les attributs 
	public String nom;
	public String prenom;
	public String AdressePostale;
		// le constructeur
	public Personne(String nom, String prenom, String adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		AdressePostale = adressePostale;
	}
	// les guetters et les setters
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdressePostale() {
		return AdressePostale;
	}


	public void setAdressePostale(String adressePostale) {
		AdressePostale = adressePostale;
	}
	
	
	//Méthode afficher nom et prénom
	public void afficher() {
		System.out.println("Le nom est: " +nom.toUpperCase()+ " et le prénom est: " +prenom);
	}



	
	

}
