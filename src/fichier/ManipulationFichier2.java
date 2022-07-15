package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier2 {

	public static void main(String[] args) {
		
		//donnees csv
	Path path= Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\donnees_communes.csv");
	Path path2= Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\big_donnees_communes.csv");

	
	try {
		List<String> lines= Files.readAllLines(path);
		List<String> linesToWrite= new ArrayList<>();
		for (String line : lines) {
			String[] columns=line.split(";");
			int populationTotale=0;
			try {
				
			} catch (Exception e) {
				
			}
		}
		Files.write(path2,linesToWrite);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
/*
 * package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\totow\\Documents\\workspace_spring\\ensemble\\donnees_communes.csv");
		
		Path pathDestination = Paths.get("C:\\Users\\totow\\Documents\\workspace_spring\\ensemble\\donnees_communes_25000_habitants_minimum.csv");
		
		List<String> fichier = new ArrayList<>();
		
		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			String[] data = line.split(";");
			if(Integer.parseInt(data[9]) > 25000){
				String ville = new String(data[6] + ";" + data[0] + ";" + data[9]);
				fichier.add(ville);
			}
		}
		Files.write(pathDestination, fichier);

	}

}*/
