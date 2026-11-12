package radiocare.entities;

import java.util.List;

public class MedecinRadiologue extends Personnel{
	private String Spécialité; 
	private double TarifPourcentageActe;
	private List<String> DispoPlanning;
	
	public MedecinRadiologue(String nom, String prenom, int iD, int cIN, String spécialité, double tarifPourcentageActe,
			List<String> dispoPlanning) {
		super(nom, prenom, iD, cIN);
		Spécialité = spécialité;
		TarifPourcentageActe = tarifPourcentageActe;
		DispoPlanning = dispoPlanning;
	}
	
	public String getSpécialité() {
		return Spécialité;
	}
	public void setSpécialité(String spécialité) {
		Spécialité = spécialité;
	}
	public double getTarifPourcentageActe() {
		return TarifPourcentageActe;
	}
	public void setTarifPourcentageActe(double tarifPourcentageActe) {
		TarifPourcentageActe = tarifPourcentageActe;
	}
	public List<String> getDispoPlanning() {
		return DispoPlanning;
	}
	public void setDispoPlanning(List<String> dispoPlanning) {
		DispoPlanning = dispoPlanning;
	}
	

	
	
	
	
	

}
