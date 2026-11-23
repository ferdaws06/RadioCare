package radiocare.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import radiocare.entities.Patient;
import radiocare.services.PatientService;

public class PatientController {
	
	private PatientService service=new PatientService();
	
	public String ajouter(String nom, String prenom, int cIN_Matricule, LocalDate dateNaissance, int téléphone,
			String email, int numAssurance) {
		try {
			service.ajouter(new Patient(nom,prenom,cIN_Matricule,dateNaissance,téléphone,email,numAssurance));
			return "patient ajoute";
		}catch(IllegalArgumentException e) {
			return "erreur:"+e.getMessage();
		}
		
	}
	
	
	public String modifier(Patient p) {
		try {
			service.modifier(p);
			return "patient modifie";
		}catch(IllegalArgumentException e) {
			return "erreur:"+e.getMessage();
		}

	}
	
	public String supprimer(Patient p) {
		try {
			service.supprimer(p);
			return "patient supperime";
		}catch(IllegalArgumentException e) {
			return "erreur:"+e.getMessage();
		}

	}
	
	public Patient rechercherCIN(int cin) {
		return service.rechercherCIN(cin);
	}
	
	public ArrayList rechercherNom(String nom) {
		return service.rechercheNom(nom);
	}
	
	public ArrayList rechercherPrenom(String prenom) {
		return service.recherchePrenom(prenom);
	}
	
	public ArrayList listerTous() {
		return service.listerTous();
	}
	

	
	
	
	
	
}