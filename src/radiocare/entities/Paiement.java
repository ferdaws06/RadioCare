package radiocare.entities;

import java.time.LocalDate;

public class Paiement {
	private String idPaiement;
	private int numFacture;
	private LocalDate datePaiement;
	private double montantRecu;
	private String modePaiement;
	private String referenceTextuellePreuve;
	public Paiement(String idPaiement, int numFacture, LocalDate datePaiement, double montantRecu, String modePaiement,
			String referenceTextuellePreuve) {
		super();
		this.idPaiement = idPaiement;
		this.numFacture = numFacture;
		this.datePaiement = datePaiement;
		this.montantRecu = montantRecu;
		this.modePaiement = modePaiement;
		this.referenceTextuellePreuve = referenceTextuellePreuve;
	}
	public String getIdPaiement() {
		return idPaiement;
	}
	public void setIdPaiement(String idPaiement) {
		this.idPaiement = idPaiement;
	}
	public int getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}
	public LocalDate getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(LocalDate datePaiement) {
		this.datePaiement = datePaiement;
	}
	public double getMontantRecu() {
		return montantRecu;
	}
	public void setMontantRecu(double montantRecu) {
		this.montantRecu = montantRecu;
	}
	public String getModePaiement() {
		return modePaiement;
	}
	public void setModePaiement(String modePaiement) {
		this.modePaiement = modePaiement;
	}
	public String getReferenceTextuellePreuve() {
		return referenceTextuellePreuve;
	}
	public void setReferenceTextuellePreuve(String referenceTextuellePreuve) {
		this.referenceTextuellePreuve = referenceTextuellePreuve;
	}
	
	


	
}
