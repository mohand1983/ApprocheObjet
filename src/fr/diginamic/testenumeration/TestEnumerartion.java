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

		String libelleToFind="Hivers";
		SaisonTrouv�e=Saison.getSaison(libelleToFind);
		
		System.out.println("la saison qui a pour libell�");
	}

}
