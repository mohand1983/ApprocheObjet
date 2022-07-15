package fr.diginamic.banque.entites;

public class Compte {
	/**
	 * Création des deux attributs de la classe Compte
	 */
	private String numeroCompte;
	private Long soldeCompte;
	
	//Constructeur de la classe Compte 
	/**
	 * 
	 * @param numeroCompte
	 * @param soldeCompte
	 */
	public Compte(String numeroCompte, Long soldeCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}
	//Attributs de la classe compte
	/**
	 * 
	 * @return
	 */

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Long getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(Long soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	@Override
	public String toString() {
		return "Le numéro de compte est " +numeroCompte + " est le solde est = " + soldeCompte ;
	}
	
	
	
	
	

}
