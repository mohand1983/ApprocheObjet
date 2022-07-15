package maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles= new HashMap<>(); 
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "bordeaux");
		System.out.println("La taille de ma map");
		System.out.println(mapVilles.size());
		System.out.println("Les clés de ma map");
		
		/*for (Iterator iterator = mapVilles.keySet().iterator(); iterator.hasNext();) {
			System.out.println("bonjour " +iterator.hasNext());
			
		}*/
		
		for (Integer Key : mapVilles.keySet()) {
			
			System.out.println(Key);
			
		}
		System.out.println("Les clés de ma map et les valeurs");
		for (Integer Key : mapVilles.keySet()) {
			
			System.out.println(Key+ " " +mapVilles.get(Key) );
			
		}
		
		

	}
	

}
