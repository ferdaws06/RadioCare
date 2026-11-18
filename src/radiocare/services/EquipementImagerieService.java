package radiocare.services;

import radiocare.entities.EquipementImagerie;
import radiocare.repositories.EquipementImagerieDAO;

public class EquipementImagerieService extends ServiceGeneral<EquipementImagerie>{
	

	public EquipementImagerieService() {
		super(new EquipementImagerieDAO());
		
	}
	//test validation
	@Override 
	public void valider(EquipementImagerie e) {
		if (e.getId()==0) {
			throw new IllegalArgumentException("id doit etre different de 0");
		}
	
	}

}
