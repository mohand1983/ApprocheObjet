package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		/*Créer un nouveau package sets.
		 * •Dans le packagesets, créez une classe TestSetDoubleexécutable.
		 * •Dans cette classe instanciez un HashSetde doubleset placez y
		 les éléments suivants:o1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01
		 *  •
		 *  •
		 *  •
		 *  •Affichez enfin le contenu de la collection ainsi modifiée*/
		//tableau HashSet
		HashSet<Double> test= new HashSet<>();
		test.add(1.5);
		test.add(8.25);
		test.add(-7.32);
		test.add(13.3);
		test.add(-12.45);
		test.add(48.5);
		test.add(0.01);
		//Affichez tous les éléments de la collection
		/*for (Double double1 : test) {
			System.out.println(double1);
		}*/
		
		Iterator<Double> iterator = test.iterator();
			while(iterator.hasNext()) {
				Double test1 = iterator.next();
				System.out.println(test1);
				}
		//Recherchez le plus grand élément de la collection
			
			Double max = Double.MAX_VALUE;
			for (Double doubles : test) {
				if(doubles>max) 
					max=doubles;
					
				
			}
			 System.out.println("l'élement le plus grand est = "
                     + max);
			 
		//Supprimez le plus petit élément de la collection
			 Double min = Double.MIN_VALUE;
				for (Double doubles : test) {
					if(doubles<min) 
						min=doubles; 
				}
				System.out.println("l'élement le plus petit est = "
	                     + min);
		//Affichez enfin le contenu de la collection ainsi modifiée*/
				
				for (Double double1 : test) {
					System.out.println(double1);
				}
				
				
	}			

}
