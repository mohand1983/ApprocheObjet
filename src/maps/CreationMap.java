package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, Integer> mapSalaires= new HashMap<>();
		mapSalaires.put("paul", 1750);
		mapSalaires.put("Hicham", 1750);
		mapSalaires.put("Yu", 1750);
		mapSalaires.put("Ingrid", 1750);
		mapSalaires.put("Chantal", 1750);
		System.out.println(mapSalaires.size());
		

	}

}
