package radiocare.repositories;

import java.util.List;

import com.google.gson.Gson;

import radiocare.utils.JsonUtil;

import radiocare.entities.Patient;

public class PatientDAO {
	private static final String fichier="data/patients.json"; //nom du fichier
	private List<Patient> patients;
	
	public PatientDAO() {
		this.patients = JsonUtil.lire(fichier, Patient.class);
	}
	
	
	//******CRUD******
	


}
        