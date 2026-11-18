package radiocare.entities;

public class ExamenMedicale {
	private int ID_Examen;
	private int CodeActe;
	private String Libelle;
	private int DureeEstimeeMinutes;
	private double TarifHT; 
	
	
	public ExamenMedicale() {};
	
	public ExamenMedicale(int iD_Examen, int codeActe, String libelle, int dureeEstimeeMinutes, double tarifHT) {
		super();
		ID_Examen = iD_Examen;
		CodeActe = codeActe;
		Libelle = libelle;
		DureeEstimeeMinutes = dureeEstimeeMinutes;
		TarifHT = tarifHT;
	}

	public int getID_Examen() {
		return ID_Examen;
	}

	public void setID_Examen(int iD_Examen) {
		ID_Examen = iD_Examen;
	}

	public int getCodeActe() {
		return CodeActe;
	}

	public void setCodeActe(int codeActe) {
		CodeActe = codeActe;
	}

	public String getLibelle() {
		return Libelle;
	}

	public void setLibelle(String libelle) {
		Libelle = libelle;
	}

	public int getDureeEstimeeMinutes() {
		return DureeEstimeeMinutes;
	}

	public void setDureeEstimeeMinutes(int dureeEstimeeMinutes) {
		DureeEstimeeMinutes = dureeEstimeeMinutes;
	}

	public double getTarifHT() {
		return TarifHT;
	}

	public void setTarifHT(double tarifHT) {
		TarifHT = tarifHT;
	}
	
	
}
