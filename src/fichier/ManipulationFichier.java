package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) { 
    // Creer une représentation du chemain du fichier
		
	Path path= Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\donnees_communes.csv");
	
	Path pathDestinantionMove=Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\donnees_communes_move.csv");
	System.out.println(path.getRoot());
	System.out.println(path.getParent());
	System.out.println(path.getFileName());
	// verification du type de fichier
	boolean estFichier= Files.isRegularFile(path);
	boolean estLisible= Files.isReadable(path);
	if(estFichier) {System.out.println("c'est un fichier");} 
		
	if(estLisible) {System.out.println("Il es lisible");}
	
	boolean estRepertoire= Files.isDirectory(path);
	boolean estRepertoireLisible= Files.isReadable(path);
	
	if(estRepertoire) {System.out.println("c'est un Répertoire");} 
	
	if(estRepertoireLisible) {System.out.println("c'est un répertoire lisible");}
	
	
	
	// copier un fichier
	
	Path pathDestinantionCopy=Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\donnees_communes_copy.csv");
	try {
		System.out.println("On va essayer une copie");
		Files.copy(path, pathDestinantionCopy);
	} catch (IOException ioe) {
		// TODO Auto-generated catch block
		ioe.printStackTrace();
		
		
		}finally{ System.out.println("On n'a essayer une copie");}
	// supprimer 
	Path pathToDelete= Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\donnees_communes_copy.csv");
	
	
	try {
		Files.delete(pathToDelete);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
		
		}
	
	// parcour d'un repertoire
	
	Path pathDirectory= Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\donnees_communes.csv");
	DirectoryStream<Path> stream;
	try {
		stream = Files.newDirectoryStream(pathDirectory);
		Iterator<Path> iterator= stream.iterator();
		while(iterator.hasNext()) 
		{
			Path pathDirectory1= iterator.next();
		System.out.println(pathDirectory1);
		
		}
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	// lire les lignes
	
	
	try {
		List<String> lines= Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String line : lines) {
			System.out.println(line);
		}
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	// ecrrire dans un fichier
	
	try {
		List<String> lines= new ArrayList<>();
		lines.add("bonjour");
		lines.add("le");
		lines.add("monde");
		Path pathToWrite=Paths.get("C:\\Users\\BOUDI\\Desktop\\Diginamic\\Java\\bonjourlemonde.txt");
		Files.write(pathToWrite, lines);
	System.out.println(lines);
		
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	
	

	
	
	
	}
	
	
	
	
	
	
	}
	





