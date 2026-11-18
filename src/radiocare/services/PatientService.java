package radiocare.services;

import radiocare.entities.Patient;
import radiocare.repositories.PatientDAO;

public class PatientService {
	private final PatientDAO dao;

	public PatientService(PatientDAO dao) {
		super();
		this.dao = dao;
	}
	
	//test de validation 
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
	 
	 public void ajouter(Patient p) {
		 valider(p);
		 dao.ajouter(p);
		 
	 }
	 
	 public void modifier(Patient p) {
		 valider(p);
		 if(dao.AfficherParID(p.getCIN_Matricule())==null) {
			 throw new IllegalArgumentException("patient introuvable");
		 }
		 dao.modifier(p);
	 }
	 
	 public void supprimer(Patient p) {
		 if(dao.AfficherParID(p.getCIN_Matricule())==null) {
			 throw new IllegalArgumentException("patient introuvable");
		 }
		 else {
			 dao.supprimer(p);
		 }
	 }
	 public Patient rechercher(Patient p) {
		 return dao.AfficherParID(p.getCIN_Matricule());
		 
	 }
	 
	 

}

           