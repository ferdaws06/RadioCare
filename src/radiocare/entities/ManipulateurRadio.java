package radiocare.entities;

public class ManipulateurRadio extends Personnel{
	private String Habilitations;
	private double TarifHoraire;
	private boolean StatutDispo;
	
	public ManipulateurRadio(String nom, String prenom, int iD, int cIN, String habilitations, double tarifHoraire,
			boolean statutDispo) {
		super(nom, prenom, iD, cIN);
		Habilitations = habilitations;
		TarifHoraire = tarifHoraire;
		StatutDispo = statutDispo;
	}

	public String getHabilitations() {
		return Habilitations;
	}

	public void setHabilitations(String habilitations) {
		Habilitations = habilitations;
	}

	public double getTarifHoraire() {
		return TarifHoraire;
	}

	public void setTarifHoraire(double tarifHoraire) {
		TarifHoraire = tarifHoraire;
	}

	public boolean isStatutDispo() {
		return StatutDispo;
	}

	public void setStatutDispo(boolean statutDispo) {
		StatutDispo = statutDispo;
	}
	
	
	
	
}
