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
	private int[] HistoriqueExamensIDs;  // un nov patient avoir historique vide au lieu de null par defaut 
	public int getCIN_Matricule() {
		return CIN_Matricule;
	}
	public void setCIN_Matricule(int CIN) {
		CIN_Matricule = CIN;
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
	public int[] getHistoriqueExamensIDs() {
		return HistoriqueExamensIDs;
	}
	public void setHistoriqueExamensIDs(int[] historiqueExamensIDs) {
		HistoriqueExamensIDs = historiqueExamensIDs;
	}
	
	public Patient() {}; // pour la fichier json
	
	public Patient(String nom, String prenom, int CIN_Matricule, LocalDate DateNaissance, int Téléphone,
			String Email, int NumAssurance) {
		super(nom, prenom);
		this.CIN_Matricule = CIN_Matricule;
		this.DateNaissance = DateNaissance;
		this.Téléphone = Téléphone;
		this.Email = Email;
		this.NumAssurance = NumAssurance;
		SoldeCompte = 0;
		HistoriqueExamensIDs =new int[0];
	}
	
	
	//pour tester rapidement la creation d'un patient
	public String toString() {
		return CIN_Matricule +"|"+nom+" "+prenom +"|"+Téléphone+"|"+Email;
		
	}
	
	// ajout d'un id examen au tableau historique examen
	public void ajouterExamen(int idExamen) {
	    int[] nouveau = new int[HistoriqueExamensIDs.length + 1];
	    for (int i = 0; i < HistoriqueExamensIDs.length; i++) {
	        nouveau[i] = HistoriqueExamensIDs[i];
	    }
	    nouveau[nouveau.length - 1] = idExamen;
	    HistoriqueExamensIDs = nouveau;
	}



	

}
