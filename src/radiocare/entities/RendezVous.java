package radiocare.entities;

import java.time.LocalDate;

public class RendezVous {
	private int idRdv;
	private LocalDate date;
	private int heureDebut;
	private int dureeMinutes;
	private int idPatient;
	private int idMedecin;
	private int idManip;
	private int idSalle;
	private int idExamen;
	private String status;
	public RendezVous(int idRdv, LocalDate date, int heureDebut, int dureeMinutes, int idPatient, int idMedecin,
			int idManip, int idSalle, int idExamen, String status) {
		super();
		this.idRdv = idRdv;
		this.date = date;
		this.heureDebut = heureDebut;
		this.dureeMinutes = dureeMinutes;
		this.idPatient = idPatient;
		this.idMedecin = idMedecin;
		this.idManip = idManip;
		this.idSalle = idSalle;
		this.idExamen = idExamen;
		this.status = status;
	}
	public int getIdRdv() {
		return idRdv;
	}
	public void setIdRdv(int idRdv) {
		this.idRdv = idRdv;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(int heureDebut) {
		this.heureDebut = heureDebut;
	}
	public int getDureeMinutes() {
		return dureeMinutes;
	}
	public void setDureeMinutes(int dureeMinutes) {
		this.dureeMinutes = dureeMinutes;
	}
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public int getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
	}
	public int getIdManip() {
		return idManip;
	}
	public void setIdManip(int idManip) {
		this.idManip = idManip;
	}
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public int getIdExamen() {
		return idExamen;
	}
	public void setIdExamen(int idExamen) {
		this.idExamen = idExamen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
