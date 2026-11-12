package radiocare.entities;

public class SalleRadiologie extends Ressource {
	private String nom;
	private int numeroEtage;
	private String typeSalle;
	private String equipementAttributID;
	private boolean statutDispo;
	public SalleRadiologie(String id, String nom, int numeroEtage, String typeSalle, String equipementAttributID,
			boolean statutDispo) {
		super(id);
		this.nom = nom;
		this.numeroEtage = numeroEtage;
		this.typeSalle = typeSalle;
		this.equipementAttributID = equipementAttributID;
		this.statutDispo = statutDispo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNumeroEtage() {
		return numeroEtage;
	}
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	public String getTypeSalle() {
		return typeSalle;
	}
	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}
	public String getEquipementAttributID() {
		return equipementAttributID;
	}
	public void setEquipementAttributID(String equipementAttributID) {
		this.equipementAttributID = equipementAttributID;
	}
	public boolean isStatutDispo() {
		return statutDispo;
	}
	public void setStatutDispo(boolean statutDispo) {
		this.statutDispo = statutDispo;
	}
	
}
