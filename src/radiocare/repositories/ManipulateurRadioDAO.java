package radiocare.repositories;

import radiocare.entities.ManipulateurRadio;

public class ManipulateurRadioDAO extends DAOgeneral <ManipulateurRadio>  {

	public ManipulateurRadioDAO() {
		super("manipulateursRadio.json",ManipulateurRadio.class);
	}

	@Override
	public int getID(ManipulateurRadio entite) {
		return entite.getID();
	}

	@Override
	public void setID(ManipulateurRadio entite, int ID) {
		entite.setID(ID);
		
	}

}
