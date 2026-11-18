package radiocare.repositories;

import radiocare.entities.ExamenMedicale;

public class ExamenMedicalDAO extends DAOgeneral <ExamenMedicale>{

	public ExamenMedicalDAO(String fichier, Class<ExamenMedicale> classe) {
		super("exames.json", ExamenMedicale.class);
		
	

}

	@Override
	public int getID(ExamenMedicale entite) {
		
		return entite.getID_Examen();
	}

	@Override
	public void setID(ExamenMedicale entite, int ID) {
		entite.setID_Examen(ID);
	}
}
