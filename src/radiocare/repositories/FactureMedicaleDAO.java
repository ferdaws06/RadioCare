package radiocare.repositories;

import radiocare.entities.FactureMedicale;

public abstract class FactureMedicaleDAO extends DAOgeneral <FactureMedicale> {

	public FactureMedicaleDAO(String fichier, Class<FactureMedicale> classe) {
		super("factures.json", FactureMedicale.class);
		
	}
	@Override
	public int getID(FactureMedicale entite) {
		
		return entite.getNumFacture();
	}

	@Override
	public void setID(FactureMedicale entite, int ID) {
		entite.setNumFacture(ID);
		
	}

}

