package radiocare.entities;

public class ManipulateurRadio {
	private int ID_Manip;
	private int CIN;
	private String nom;
	private String prenom;
	private String habiliations;
	private Double tarifHoraire;
	private boolean statusDispo;
	public ManipulateurRadio(int iD_Manip, int cIN, String nom, String prenom, String habiliations, Double tarifHoraire,
			boolean statusDispo) {
		super();
		ID_Manip = iD_Manip;
		CIN = cIN;
		this.nom = nom;
		this.prenom = prenom;
		this.habiliations = habiliations;
		this.tarifHoraire = tarifHoraire;
		this.statusDispo = statusDispo;
	}
	public int getID_Manip() {
		return ID_Manip;
	}
	public void setID_Manip(int iD_Manip) {
		ID_Manip = iD_Manip;
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
	public String getHabiliations() {
		return habiliations;
	}
	public void setHabiliations(String habiliations) {
		this.habiliations = habiliations;
	}
	public Double getTarifHoraire() {
		return tarifHoraire;
	}
	public void setTarifHoraire(Double tarifHoraire) {
		this.tarifHoraire = tarifHoraire;
	}
	public boolean isStatusDispo() {
		return statusDispo;
	}
	public void setStatusDispo(boolean statusDispo) {
		this.statusDispo = statusDispo;
	}
	
}
