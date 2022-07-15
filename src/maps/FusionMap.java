package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FusionMap {

	public static void main(String[] args) {
		// Création 
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		// Création 
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		//Création map3
		HashMap<Integer, String> map3= new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);
		System.out.println("La map fusionnée map3 a : "+map3.size()+ 
				" élément(s).");
		

	}

}
