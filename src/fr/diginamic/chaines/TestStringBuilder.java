package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder val= new StringBuilder();
		long debut= System.currentTimeMillis();
		for(int i=1; i<=100000; i++) {
			val.append(i);
			System.out.println(i);
			
			
		}
		//String val1=val.toString();
		
		/* Chronometre pour calculter le temps de r�alisation */
		
		
		// Code �chronom�trerlongfin= System.currentTimeMillis();
		long fin= System.currentTimeMillis();
		
		System.out.println("Temps �coul�en millisecondes :"+ (fin-debut));
		
	

	}

}
