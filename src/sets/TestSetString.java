package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		
		//Dans cette classe instanciez unHashSet de String
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
	//Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		//TODO	.....
		String paysLePlusLong="";
		for (String p : pays) {
			if(p.length()>paysLePlusLong.length()) {
				paysLePlusLong=p;
			}
			System.out.println("le pays le plus long  " +p);
		}
	
		
		
	//Supprimez ce pays
		
		pays.remove(pays);
	//Affichez enfin le contenu de la collection ainsi modifiée
			
		
		

	}

}
