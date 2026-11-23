package radiocare.controllers;

import radiocare.entities.FactureMedicale;
import radiocare.services.FactureMedicaleService;

public class FactureMedicaleController {

	private FactureMedicaleService service =new FactureMedicaleService();
	
	
	
	public String ajouter(FactureMedicale f) {
		try {
			service.ajouter(f);
			return "facture ajoutee";
		} catch (IllegalArgumentException e) {
			return "erreur:" + e.getMessage();
		}
	}
}

