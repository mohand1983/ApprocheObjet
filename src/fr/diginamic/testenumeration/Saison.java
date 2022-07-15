package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS ("Printemps",1),
	ETE ("Eté",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private String  libelle;
	private Integer numeroDordre;
	
	private Saison(String libelle, Integer numeroDordre) {
		this.libelle = libelle;
		this.numeroDordre = numeroDordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getNumeroDordre() {
		return numeroDordre;
	}

	public void setNumeroDordre(Integer numeroDordre) {
		this.numeroDordre = numeroDordre;
	}
	public String afficherSaison() {
		return (" la saison " +this.numeroDordre+ " et " +this.libelle);
	}
	
	public static Saison getSaison(String libelleofSaisonToFind) {
		Saison saisonTrouvée=null;
		for (Saison saison : Saison.values()) {
			if(saison.getLibelle().equals(libelleofSaisonToFind)) {
				saisonTrouvée=saison;
			}
		}
		return saisonTrouvée;
	}
	
	
	
}
