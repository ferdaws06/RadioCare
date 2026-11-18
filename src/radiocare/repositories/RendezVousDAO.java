package radiocare.repositories;

import radiocare.entities.RendezVous;

public class RendezVousDAO extends DAOgeneral<RendezVous> {

	public RendezVousDAO() {
		super("rendezvous.json", RendezVous.class);

	}

	@Override
	public int getID(RendezVous entite) {
		return entite.getIdRdv();
	}

	@Override
	public void setID(RendezVous entite, int ID) {
		entite.setIdRdv(ID);
		
	}

}
