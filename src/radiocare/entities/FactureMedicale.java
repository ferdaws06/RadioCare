package radiocare.entities;

public class FactureMedicale {
	private int numFacture;
	private String idPatient;
	private String idRdv;
	private double montantHT;
	private double tauxTva;
	private double tauxTTC;
	private double partAssurance;
	private double tauxPatient;
	private String statutPaiement;
	public FactureMedicale(int numFacture, String idPatient, String idRdv, double montantHT, double tauxTva,
			double tauxTTC, double partAssurance, double tauxPatient, String statutPaiement) {
		super();
		this.numFacture = numFacture;
		this.idPatient = idPatient;
		this.idRdv = idRdv;
		this.montantHT = montantHT;
		this.tauxTva = tauxTva;
		this.tauxTTC = tauxTTC;
		this.partAssurance = partAssurance;
		this.tauxPatient = tauxPatient;
		this.statutPaiement = statutPaiement;
	}
	public int getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
	}
	public String getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(String idPatient) {
		this.idPatient = idPatient;
	}
	public String getIdRdv() {
		return idRdv;
	}
	public void setIdRdv(String idRdv) {
		this.idRdv = idRdv;
	}
	public double getMontantHT() {
		return montantHT;
	}
	public void setMontantHT(double montantHT) {
		this.montantHT = montantHT;
	}
	public double getTauxTva() {
		return tauxTva;
	}
	public void setTauxTva(double tauxTva) {
		this.tauxTva = tauxTva;
	}
	public double getTauxTTC() {
		return tauxTTC;
	}
	public void setTauxTTC(double tauxTTC) {
		this.tauxTTC = tauxTTC;
	}
	public double getPartAssurance() {
		return partAssurance;
	}
	public void setPartAssurance(double partAssurance) {
		this.partAssurance = partAssurance;
	}
	public double getTauxPatient() {
		return tauxPatient;
	}
	public void setTauxPatient(double tauxPatient) {
		this.tauxPatient = tauxPatient;
	}
	public String getStatutPaiement() {
		return statutPaiement;
	}
	public void setStatutPaiement(String statutPaiement) {
		this.statutPaiement = statutPaiement;
	}
	
	
	

}
