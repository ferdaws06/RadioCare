package radiocare.repositories;

import radiocare.entities.Paiement;

public class PaiementDAO extends DAOgeneral <Paiement>{

	public PaiementDAO() {
		super("Paiement.json",Paiement.class);
	
	}

	@Override
	public int getID(Paiement entite) {
		return entite.getIdPaiement();
	}

	@Override
	public void setID(Paiement entite, int ID) {
		entite.setIdPaiement(ID);
		
	}

}
