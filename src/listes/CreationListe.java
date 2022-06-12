package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {
		// tablear Arraylist
		
		List<Integer> centPremiersEntiers = new ArrayList<>();
		for(int i=1; i<=100;i++) {
			centPremiersEntiers.add(i);	
		}
		System.out.println(centPremiersEntiers.size());
	}

}
