package fr.diginamic.banque.entites;

public abstract class Operation {
	/**
	 * Attributs
	 */
	protected String dateOperation;
	protected float montant;
	/**
	 * 
	 * @param dateOperation
	 * @param montant
	 */
	public Operation(String dateOperation, float montant) {
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	@Override
	public String toString() {
		return "Operation [dateOperation=" + dateOperation + ", montant=" + montant + "]";
	}
	
	public abstract  String getType();
	
	
	

}
