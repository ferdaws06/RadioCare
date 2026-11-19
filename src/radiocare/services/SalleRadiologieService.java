package radiocare.services;


import radiocare.entities.SalleRadiologie;
import radiocare.repositories.EquipementImagerieDAO;
import radiocare.repositories.SalleRadiologieDAO;
public class SalleRadiologieService extends ServiceGeneral<SalleRadiologie>{
    private final EquipementImagerieDAO equipement =new EquipementImagerieDAO();
    
	public SalleRadiologieService() {
		super(new SalleRadiologieDAO());
		
	}
	



	@Override
	public void valider(SalleRadiologie e) {
		// TODO Auto-generated method stub
		
	}
	

}
