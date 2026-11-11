package entities;

import java.time.LocalDate;

public class Patient {
	private String cinMatricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String telephone;
	private String email;
	private String numAssurance;
	private double soldeCompte;
	private String[] historiqueExamensIDs;
	public Patient(String cinMatricule, String nom, String prenom, LocalDate dateNaissance, String telephone,
			String email, String numAssurance, double soldeCompte, String[] historiqueExamensIDs) {
		super();
		this.cinMatricule = cinMatricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.telephone = telephone;
		this.email = email;
		this.numAssurance = numAssurance;
		this.soldeCompte = soldeCompte;
		this.historiqueExamensIDs = historiqueExamensIDs;
	}
	public String getCinMatricule() {
		return cinMatricule;
	}
	public void setCinMatricule(String cinMatricule) {
		this.cinMatricule = cinMatricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumAssurance() {
		return numAssurance;
	}
	public void setNumAssurance(String numAssurance) {
		this.numAssurance = numAssurance;
	}
	public double getSoldeCompte() {
		return soldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	public String[] getHistoriqueExamensIDs() {
		return historiqueExamensIDs;
	}
	public void setHistoriqueExamensIDs(String[] historiqueExamensIDs) {
		this.historiqueExamensIDs = historiqueExamensIDs;
	}
	

}
