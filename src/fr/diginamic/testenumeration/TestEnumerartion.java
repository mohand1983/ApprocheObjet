package fr.diginamic.testenumeration;

public class TestEnumerartion {

	public static void main(String[] args) {
		System.out.println("Les saisons sont: ");
		for (Saison saison : Saison.values()) {
			System.out.println(saison.afficherSaison());
		}
		
		// Retrouver une instance par son nom
		String nom="ETE";
		Saison SaisonTrouvée=Saison.valueOf(nom);
		System.out.println("saison trouvée pour ete: " +SaisonTrouvée.afficherSaison());

		String libelleToFind="Hivers";
		SaisonTrouvée=Saison.getSaison(libelleToFind);
		
		System.out.println("la saison qui a pour libellé");
	}

}
