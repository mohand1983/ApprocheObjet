package fr.diginamic.banque.entites;

import java.util.ArrayList;
import java.util.List;

public class TestBanque {

	public static void main(String[] args) {
		// Instanciation de la classe Compte
		Compte compte= new Compte("20452542d", 2500L);
		System.out.println(compte.toString());
		// Création d'un tableau vide
		List tab= new ArrayList();
		tab.add(compte);
		Compte compteTaux= new CompteTaux("5254157m", 3000L, 2);
		tab.add(compteTaux);
		for (Object object : tab) {
			System.out.println(object);
		}
	}

}
