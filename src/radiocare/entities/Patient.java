package radiocare.entities;

import java.time.LocalDate;


import java.util.List;

public class Patient extends Personne {
	
	private int CIN_Matricule;
	private LocalDate DateNaissance;
	private int Téléphone;
	private String Email;
	private int NumAssurance;
	private double SoldeCompte;
	private List<String> HistoriqueExamensIDs;
	public int getCIN_Matricule() {
		return CIN_Matricule;
	}
	public void setCIN_Matricule(int cIN_Matricule) {
		CIN_Matricule = cIN_Matricule;
	}
	public LocalDate getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		DateNaissance = dateNaissance;
	}
	public int getTéléphone() {
		return Téléphone;
	}
	public void setTéléphone(int téléphone) {
		Téléphone = téléphone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getNumAssurance() {
		return NumAssurance;
	}
	public void setNumAssurance(int numAssurance) {
		NumAssurance = numAssurance;
	}
	public double getSoldeCompte() {
		return SoldeCompte;
	}
	public void setSoldeCompte(double soldeCompte) {
		SoldeCompte = soldeCompte;
	}
	public List<String> getHistoriqueExamensIDs() {
		return HistoriqueExamensIDs;
	}
	public void setHistoriqueExamensIDs(List<String> historiqueExamensIDs) {
		HistoriqueExamensIDs = historiqueExamensIDs;
	}
	
	public Patient() {};
	
	public Patient(String nom, String prenom, int cIN_Matricule, LocalDate dateNaissance, int téléphone,
			String email, int numAssurance, double soldeCompte, List<String> historiqueExamensIDs) {
		super(nom, prenom);
		CIN_Matricule = cIN_Matricule;
		DateNaissance = dateNaissance;
		Téléphone = téléphone;
		Email = email;
		NumAssurance = numAssurance;
		SoldeCompte = soldeCompte;
		HistoriqueExamensIDs = historiqueExamensIDs;
	}
	
	



	

}
