package entites;

import entites2.Personne;

public class TestAdressePostale {

	public static void main(String[] args) {
		// Création de deux instances de la classe Adresse postale
		
		AdressePostale adressePostale= new AdressePostale(41,"rue du genou","34000","Montpellier");
		AdressePostale adressePostale1 = new AdressePostale(3,"ruelle courte","33000","Bordeaux");
	    Personne personne = new Personne("Boudi", "Mohand","1000 avenue du pere soulas");
	    personne.afficher();
	    personne.setNom("toto");
	    personne.afficher();
	    adressePostale.setCodePostale("34090");
	    System.out.println(adressePostale.toString());
	
		
	}

}
