package radiocare.entities;



public class MedecinRadiologue {
	private int ID_Medcin;
	private int CIN;
	private String nom;
	private String prenom;
	private String specialite;
	private double TarifPourcentageActe; 
	private String[] DispoPlanning;
	
	public MedecinRadiologue(int iD_Medcin, int cIN, String nom, String prenom, String specialite,
			double tarifPourcentageActe, String[] dispoPlanning) {
		super();
		ID_Medcin = iD_Medcin;
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.specialite = specialite;
		TarifPourcentageActe = tarifPourcentageActe;
		DispoPlanning = dispoPlanning;
	}

	public int getID_Medcin() {
		return ID_Medcin;
	}

	public void setID_Medcin(int iD_Medcin) {
		ID_Medcin = iD_Medcin;
	}

	public int getCIN() {
		return CIN;
	}

	public void setCIN(int cIN) {
		CIN = cIN;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public double getTarifPourcentageActe() {
		return TarifPourcentageActe;
	}

	public void setTarifPourcentageActe(double tarifPourcentageActe) {
		TarifPourcentageActe = tarifPourcentageActe;
	}

	public String[] getDispoPlanning() {
		return DispoPlanning;
	}

	public void setDispoPlanning(String[] dispoPlanning) {
		DispoPlanning = dispoPlanning;
	}
	
	
	
	
	

}
