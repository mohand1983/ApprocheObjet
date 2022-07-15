package sets;

import java.util.HashSet;

public class Pays {
	/*
	 * Créez une classe Pays possédant 3attributs: nom, nb d’habitants, PIB/habitant.
	 * •Créez unHashSet de pays contenant les pays suivants avec les informations correctes 
	 * de nombre d’habitants et de PIB/Hab:
	 * USA,France,Allemagne,UK,Italie,Japon,Chine,Russie,Inde
	 * •Recherchez le pays avec le PIB/habitant le plus important
	 * •Recherchez le pays avec le PIB total le plus important
	 * •Modifiez le contenu du HashSetpour mettre en majusculele 
	 * pays qui a le PIB total le plus petit •Supprimez le pays dont le PIB total est le plus petit•Affichez l’ensemble des paysainsi modifiés  avec leur  nom, nombre d’habitantset  PIB total
	 * */
	
	// Attributs
	
			public String nom;
			public int nb;
			public double PibH;
	//Constructeur
			
			public Pays(String nom, int nb, double pibH) {
				super();
				this.nom = nom;
				this.nb = nb;
				PibH = pibH;
			}

	public static void main(String[] args) {
		
		HashSet<String> pays=new HashSet<>();
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");

	}


}
