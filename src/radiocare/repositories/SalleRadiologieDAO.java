package radiocare.repositories;

import radiocare.entities.SalleRadiologie;

public class SalleRadiologieDAO extends  DAOgeneral <SalleRadiologie> {

	
	public SalleRadiologieDAO() {
		super("sallesRadiologies.json", SalleRadiologie.class);
	}
	
	
	@Override
	public int getID(SalleRadiologie entite) {
		return entite.getId();
	}

	@Override
	public void setID(SalleRadiologie entite, int ID) {
		
		entite.setId(ID);
	}
	

}
