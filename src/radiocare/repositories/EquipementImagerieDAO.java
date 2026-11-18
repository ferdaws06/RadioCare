package radiocare.repositories;

import radiocare.entities.EquipementImagerie;

public class EquipementImagerieDAO extends DAOgeneral <EquipementImagerie>{

	public EquipementImagerieDAO() {
		super("equipements.json", EquipementImagerie.class);
		
	}

	@Override
	public int getID(EquipementImagerie entite) {
		
		return entite.getId();
	}

	@Override
	public void setID(EquipementImagerie entite, int ID) {
		entite.setId(ID);
		
		
		
	}

	
	

}
