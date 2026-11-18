package radiocare.services;

import radiocare.entities.Patient;
import radiocare.repositories.PatientDAO;

public class PatientService extends ServiceGeneral <Patient> {
	
	public PatientService() {
		super(new PatientDAO());
	}
	
	//test de validation 
	 @Override
	 public void valider(Patient p) {
		 if(p.getCIN_Matricule()==0|| p.getCIN_Matricule() >99999999) {
			 throw new IllegalArgumentException("CIN non valide");
			 
		 }
		 if(p.getDateNaissance()==null) {
			 throw new IllegalArgumentException("date de naissance est obligatoire");
		 }
		 if(p.getTéléphone() < 10000000 || p.getTéléphone()>99999999 ) {
			 throw new IllegalArgumentException("numero non valide"); 
		 }
		 if(p.getEmail()==null||!p.getEmail().matches("^[\\w.+-]+@[\\w-]+{"
		 		+ "\\.[\\w.]+$")){
			 throw new IllegalArgumentException("e-mail non valide");  
		 }
		 if(p.getNom()==null||p.getPrenom()==null) {
			 throw new IllegalArgumentException("nom et prenom sont obligatoire");  
			 
		 }
		 
	 }
	 
	 public void mettreAjourSolde() {
		 
		 
		 
	 }
	 
	 
	 
	 
	
	 }
	 
	 



           