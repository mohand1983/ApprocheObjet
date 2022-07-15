package fr.diginamic.testenumeration;

public class TestEnumerartion {

	public static void main(String[] args) {
		System.out.println("Les saisons sont: ");
		for (Saison saison : Saison.values()) {
			System.out.println(saison.afficherSaison());
		}
		
		// Retrouver une instance par son nom
		String nom="ETE";
		Saison SaisonTrouv�e=Saison.valueOf(nom);
		System.out.println("saison trouv�e pour ete: " +SaisonTrouv�e.afficherSaison());

		String libelleToFind="Hiver";
		Saison saisonTrouv�e=Saison.getSaison(libelleToFind);
		
		System.out.println("saison trouv�e pour Hiver: " +SaisonTrouv�e);
	}

}
