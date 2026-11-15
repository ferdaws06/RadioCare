package radiocare.entities;

public class EquipementImagerie extends Ressource{
	private String type;
	private String marque;
	private int heuresCumulees;
	private int heuresRestantesMaintenance;
	private StatutEqIm statut;
	
	public enum StatutEqIm{
		en_service,en_panne,en_maintenance
	}
	
	public EquipementImagerie() {};
	
	public EquipementImagerie(int id, String type, String marque, int heuresCumulees, int heuresRestantesMaintenance,
			StatutEqIm statut) {
		super(id);
		this.type = type;
		this.marque = marque;
		this.heuresCumulees = heuresCumulees;
		this.heuresRestantesMaintenance = heuresRestantesMaintenance;
		this.statut = statut;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getHeuresCumulees() {
		return heuresCumulees;
	}
	public void setHeuresCumulees(int heuresCumulees) {
		this.heuresCumulees = heuresCumulees;
	}
	public int getHeuresRestantesMaintenance() {
		return heuresRestantesMaintenance;
	}
	public void setHeuresRestantesMaintenance(int heuresRestantesMaintenance) {
		this.heuresRestantesMaintenance = heuresRestantesMaintenance;
	}
	public StatutEqIm getStatut() {
		return statut;
	}
	public void setStatut(StatutEqIm statut) {
		this.statut = statut;
	}
	
	

}
