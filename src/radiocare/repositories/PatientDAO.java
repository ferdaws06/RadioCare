package radiocare.repositories;
import radiocare.entities.Patient;

public class PatientDAO extends DAOgeneral <Patient>{

	public PatientDAO() {
		super("patients.json", Patient.class);
	}
		
	


	@Override
	public int getID(Patient entite) {
	
		return entite.getCIN_Matricule();
	}

	@Override
	public void setID(Patient entite, int ID) {
		entite.setCIN_Matricule(ID);
		
	}
	
	
	



}
        