package tri;


public class Ville2 implements Comparable<Ville2> {
	private String nom;
	private Integer nbHabitants;
	public Ville2(String nom,Integer nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getNbHabitants() {
		return nbHabitants;
	}
	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
	}
	
	@Override
	public int compareTo(Ville2 ville) {
		return this.nbHabitants.compareTo(ville.getNbHabitants());
		}
	
	

	

}
