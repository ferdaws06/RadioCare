package radiocare.services;

import java.util.ArrayList;

import radiocare.entities.FactureMedicale;
import radiocare.repositories.FactureMedicaleDAO;

public class FactureMedicaleService {
	private FactureMedicaleDAO dao = new FactureMedicaleDAO();
	
	public void valider(FactureMedicale f) {
		if (f.getNumFacture() <= 0) {
			throw new IllegalArgumentException("numero de facture invalide ");
			
		}
		if (f.getIdPatient()<=0||f.getIdPatient()>99999999) {
			throw new IllegalArgumentException("id de patient invalide ");
		}
		if (f.getIdRdv()<=0||f.getIdRdv()>99999999) {
			throw new IllegalArgumentException("id de rendez-vous invalide ");
		}
		if(f.getMontantHT()<=0.0) {
			throw new IllegalArgumentException("montant hors taxe invalide ");
		}
		if (f.getTauxTva()!=0.19) {
			throw new IllegalArgumentException("taux de tva doit etre 19% ");
		}
		if (f.getPartAssurance()<0.0) {
			throw new IllegalArgumentException("part d'assurance invalide ");
		}
		if (f.getTauxPatient()<0.0) {
			throw new IllegalArgumentException("part de patient invalide ");
		}
		if (f.getStatutPaiement() == null ||!(f.getStatutPaiement().equals("Réglée") || !(f.getStatutPaiement().equals("Retard") || f.getStatutPaiement().equals("En Attente")))) {
			throw new IllegalArgumentException("status de paiement invalide ");
		}
	}
	
	
	public void ajouter(FactureMedicale f) {
		valider(f);
		if (dao.findByNum(f.getNumFacture()) != null) {
			throw new IllegalArgumentException("numero de facture deja existe");
		}
		dao.save(f);
	}
	



}
