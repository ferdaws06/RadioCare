/**package radiocare.services;

import radiocare.entities.CompteRenduMedical;
import radiocare.entities.Patient;
import radiocare.entities.RendezVous;
import radiocare.repositories.CompteRenduMedicalDAO;
import radiocare.repositories.DAOgeneral;
import radiocare.repositories.RendezVousDAO;

//public class CompteRenduMedicalService extends ServiceGeneral <CompteRenduMedical> {
	final RendezVousDAO rdvDAO=new RendezVousDAO();
	public CompteRenduMedicalService() {
		
		
	}

	@Override
	public void valider(CompteRenduMedical e) {
		if(e.getID_CompteRendu()==0) {
			throw new IllegalArgumentException("ID non valide");
		}
		
		RendezVous rdv =rdvDAO.AfficherParID(e.getID_Rdv());
		if(rdv==null) {
			throw new IllegalArgumentException("rendez vous non trouvable");
			
		}
		
		if(e.getDate()==null) {
			 throw new IllegalArgumentException("date introuvable");
			
		}
		
		if(e.getRefOrdonnanceTextuelle()==null) {
			 throw new IllegalArgumentException("reference de l'ordonance  introuvable");
		}
		
		if(e.getTranscriptionDiagnosticTextuel()==null) {
			throw new IllegalArgumentException("reference de l'ordonance  introuvable");
			
		}
		if(e.getCodeResultat()==null) {
			throw new IllegalArgumentException("code resultat introuvable");
		}
			
	
		}
		
	}*/


	

	