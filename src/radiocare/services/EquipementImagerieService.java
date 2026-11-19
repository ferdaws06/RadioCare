package radiocare.services;

import java.util.ArrayList;
import java.util.List;

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
	
	// enregistrement des heures d'utilisation et leurs ajout au heures cumulees
		public void utilisation(int id, int heures) {
			EquipementImagerie e=dao.AfficherParID(id);
			if (e==null) {
				throw new IllegalArgumentException("on a pas un equipement avec ce id  ");
			}
			if (heures <= 0 ) {
				throw new IllegalArgumentException("les heures doivent etre superieur a 0");
			}
			if (!"En Service".equals(e.getStatut())) {
				throw new IllegalArgumentException("l'equipement non disponible");
			}
			if (heures <e.getHeuresRestantesMaintenance()) {
				throw new  IllegalArgumentException("la duree de cette utilisation depasse les heures restantes avant faire la maintenance d'equipement");
			}
			e.setHeuresCumulees(e.getHeuresCumulees()+heures);
			e.setHeuresRestantesMaintenance(e.getHeuresRestantesMaintenance()-heures);
			dao.modifier(e);
		}
			
	// alerte en cas d'échéance proche
			public List<EquipementImagerie> equipementEnAlerte () {
				List <EquipementImagerie> equipementEnAlerte = new ArrayList<>();
				for( EquipementImagerie e :dao.AfficherTout()  ) {
					if (e.getHeuresRestantesMaintenance() <= Parametres.heure_alerte_maintenance) {
						equipementEnAlerte.add(e);
					}
				}
				return  equipementEnAlerte;
			}

	

}
