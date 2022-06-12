package entites;

import entites2.Personne;

public class TestAdressePostale {

	public static void main(String[] args) {
		// Création de deux instances de la classe Adresse postale
		AdressePostale adressePostale= new AdressePostale();
		adressePostale.numeroDeRue=1092;
		adressePostale.libelleDeLaRue="avenue du père soulas";
		adressePostale.codePostale="30000";
		adressePostale.ville="Montpellier";
		Personne personne1= new Personne();
		personne1.nom="mohand";
		personne1.prenom="mohand";
		personne1.AdressePostale="1000 Montpellier";
		System.out.println(adressePostale.numeroDeRue+ "  " +adressePostale.libelleDeLaRue);
		
	}

}
