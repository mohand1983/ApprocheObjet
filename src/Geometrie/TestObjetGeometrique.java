package Geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique[] objets = new ObjetGeometrique[3];
		objets[0]=new Cercle(25.5);
		objets[1]=new Rectangle(48, 12);
		objets[2]=new Rectangle(48, 12);
		for (ObjetGeometrique objetGeometrique : objets) {
			System.out.println(objetGeometrique.toString());
		}
	}

}