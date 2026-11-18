package radiocare.repositories;
import radiocare.entities.MedecinRadiologue;


public class MedecinRadiologueDAO extends DAOgeneral <MedecinRadiologue> {
  
	public MedecinRadiologueDAO() {
		super("medecinsRadiologue.json", MedecinRadiologue.class);
	}


	@Override
	public int getID(MedecinRadiologue entite) {
		return entite.getID();
	}

	@Override
	public void setID(MedecinRadiologue entite, int ID) {
		entite.setID(ID);
		
	}

	
 
		
	
		

}
