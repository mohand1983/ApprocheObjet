package fr.diginamic.banque.entites;
/**
 * 
 * @author BOUDI
 * @Entity (ComteTaux)
 */
public class CompteTaux extends Compte {
	/**
	 * Attributs
	 */
	private float tauxRemuniration;
	/**
	 * 
	 * @param numeroCompte
	 * @param soldeCompte
	 * @param tauxRemuniration
	 */

	public CompteTaux(String numeroCompte, Long soldeCompte, float tauxRemuniration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuniration = tauxRemuniration;
	}
	
	/**
	 * 
	 * @return
	 */
	public float getTauxRemuniration() {
		return tauxRemuniration;
	}
	/**
	 * 
	 * @param tauxRemuniration
	 */
	public void setTauxRemuniration(float tauxRemuniration) {
		this.tauxRemuniration = tauxRemuniration;
	}

	@Override
	public String toString() {
		return  "le taux de rémunération est " +getTauxRemuniration() + " " + super.toString() ;
	}
	
	
	
	

	
	
	

	
	
	
	
	
	

}
