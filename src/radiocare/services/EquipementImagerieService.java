package radiocare.services;

import radiocare.entities.EquipementImagerie;
import radiocare.repositories.EquipementImagerieDAO;
import radiocare.utils.Parametres;

public class EquipementImagerieService extends ServiceGeneral<EquipementImagerie>{
	

	public EquipementImagerieService() {
		super(new EquipementImagerieDAO());
		
	}
	//test validation
	@Override 
	public void valider(EquipementImagerie e) {
		if (e.getId()==0) {
			throw new IllegalArgumentException("equipement introuvable ");
		}
		if (e.getType()==null || !Parametres.Types.contains(e.getStatut())){
			throw new IllegalArgumentException("ce type d'equipement n'est pas disponible ");
		}
		if (e.getStatut()==null || !Parametres.Status.contains(e.getStatut())) {
			throw new IllegalArgumentException("status non disponible");
		}
		if (e.getHeuresCumulees()  <0) {
			throw new IllegalArgumentException("les heures cumulees doivent etre superieur a 0");
		}
		if (e.getHeuresRestantesMaintenance()  <0) {
			throw new IllegalArgumentException("les heures de maintenance doivent etre superieur a 0");
		}
		if(e.getMarque()==null) {
			throw new IllegalArgumentException("l'equipement doit avoir une marque non vide ");
		}
		
	}

}
