package radiocare.services;

import java.util.ArrayList;

import radiocare.entities.Patient;
import radiocare.repositories.PatientDAO;
import radiocare.repositories.PatientDAO;

public class PatientService  {
	 private PatientDAO dao = new PatientDAO();
	 
	
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
		 if(p.getEmail()==null||!p.getEmail().contains("@")){
			 throw new IllegalArgumentException("e-mail non valide");  
		 }
		 if(p.getNom()==null) {
			 throw new IllegalArgumentException("nom est obligatoire");   
		 }
		 if(p.getPrenom()==null) {
			 throw new IllegalArgumentException("prenom est obligatoire");
			 
		 }
		 
	 }
	 
	 public void ajouter(Patient p) {
		 valider(p);
		 if(dao.findByCin(p.getCIN_Matricule())!=null) {
			 throw new IllegalArgumentException("CIN deja existe");
		 }
		 dao.save(p);
	 }
	 
	 public void modifier(Patient p) {
		 valider(p);
		 if(dao.findByCin(p.getCIN_Matricule())==null) {
			 throw new IllegalArgumentException("patient introuvable");
			 
		 }
		 dao.update(p);
	 }
	 
	 public void supprimer(Patient p) {
		 if(dao.findByCin(p.getCIN_Matricule())==null) {
			 throw new IllegalArgumentException("patient introuvable"); 
		 }
		 dao.delete(p.getCIN_Matricule());
	 }
	 
	 public Patient rechercherCIN(int cin ) {
		 return dao.findByCin(cin);
	 }
	 
	 public ArrayList rechercheNom(String nom) {
		 ArrayList resultat= new ArrayList();
		 ArrayList patients =dao.findAll();
		 for(int i=0;i<patients.size();i++) {
			 Patient p=(Patient)patients.get(i);
			 if(p.getNom()==nom) {
				 resultat.add(p);
			 }
			 
		 }
		 return resultat;
	 }
	 
	 public ArrayList recherchePreom(String prenom) {
		 ArrayList resultat= new ArrayList();
		 ArrayList patients =dao.findAll();
		 for(int i=0;i<patients.size();i++) {
			 Patient p=(Patient)patients.get(i);
			 if(p.getNom()==prenom) {
				 resultat.add(p);
			 }
			 
		 }
		 return resultat;
	 }
	 
	 public ArrayList listerTous() {
		 return dao.findAll();
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
		 
		 
		 
		 
	 
	 
	 
	 
	 
	
	 }
	 
	 



           