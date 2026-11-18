package radiocare.services;
import radiocare.repositories.ManipulateurRadioDAO;
import radiocare.utils.Parametres;
import radiocare.entities.ManipulateurRadio;
import radiocare.repositories.DAOgeneral;

public class ManipulateurRadioService extends ServiceGeneral<ManipulateurRadio> {

	public ManipulateurRadioService() {
		super(new ManipulateurRadioDAO());
			
	}

	@Override
	public void valider(ManipulateurRadio e) {
		if(e.getNom()==null) {
			throw new IllegalArgumentException("nom est obligatoire");
		}
		if(e.getPrenom()==null) {
			throw new IllegalArgumentException("prenom est obligatoire");
		}
		if(e.getID()==0) {
			throw new IllegalArgumentException("id non valide");
				
		}
		if(e.getHabilitations()==null) {
			throw new IllegalArgumentException("habilitation non valide");
		}
		if(e.getTarifHoraire()<00) {
			throw new IllegalArgumentException("tarifhoraire non valide (negatif)");
		}
		if(e.getStatutDispo()==null||!Parametres.Types.contains( e.getStatutDispo() ) ) {
			throw new IllegalArgumentException("statut non valide ");
		}
	}
		
		public double calculerSalaire() {
			
			
			
			return 0;
		}
		
	
	
	

}
