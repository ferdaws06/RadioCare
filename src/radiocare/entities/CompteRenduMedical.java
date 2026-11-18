package radiocare.entities;

import java.time.LocalDate;

public class CompteRenduMedical {
	private int ID_CompteRendu;
	private int ID_Rdv;
	private LocalDate Date;
	private String RefOrdonnanceTextuelle;
	private String TranscriptionDiagnosticTextuel;
	private CodeRes CodeResultat ;
	
	public enum CodeRes{         //liste des valeurs autorises//
		normal,anomalie,urgent
	}
	
	public CompteRenduMedical() {};
	
	public CompteRenduMedical(int iD_CompteRendu, int iD_Rdv, LocalDate date, String refOrdonnanceTextuelle,
			String transcriptionDiagnosticTextuel, CodeRes codeResultat) {
		super();
		ID_CompteRendu = iD_CompteRendu;
		ID_Rdv = iD_Rdv;
		Date = date;
		RefOrdonnanceTextuelle = refOrdonnanceTextuelle;
		TranscriptionDiagnosticTextuel = transcriptionDiagnosticTextuel;
		CodeResultat = codeResultat;
	}

	public int getID_CompteRendu() {
		return ID_CompteRendu;
	}
	

	public void setID_CompteRendu(int iD_CompteRendu) {
		ID_CompteRendu = iD_CompteRendu;
	}

	public int getID_Rdv() {
		return ID_Rdv;
	}

	public void setID_Rdv(int iD_Rdv) {
		ID_Rdv = iD_Rdv;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public String getRefOrdonnanceTextuelle() {
		return RefOrdonnanceTextuelle;
	}

	public void setRefOrdonnanceTextuelle(String refOrdonnanceTextuelle) {
		RefOrdonnanceTextuelle = refOrdonnanceTextuelle;
	}

	public String getTranscriptionDiagnosticTextuel() {
		return TranscriptionDiagnosticTextuel;
	}

	public void setTranscriptionDiagnosticTextuel(String transcriptionDiagnosticTextuel) {
		TranscriptionDiagnosticTextuel = transcriptionDiagnosticTextuel;
	}

	public CodeRes getCodeResultat() {
		return CodeResultat;
	}

	public void setCodeResultat(CodeRes codeResultat) {
		CodeResultat = codeResultat;
	}
	
	

}
