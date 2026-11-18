package radiocare.repositories;

import radiocare.entities.CompteRenduMedical;

public class CompteRenduMedicalDAO extends DAOgeneral <CompteRenduMedical> {

	public CompteRenduMedicalDAO() {
		super("compteRenduMedical.json", CompteRenduMedical.class);
	}

	@Override
	public int getID(CompteRenduMedical entite) {
		return entite.getID_CompteRendu();
	}

	@Override
	public void setID(CompteRenduMedical entite, int ID) {
		entite.setID_CompteRendu(ID);
		
	}
}
