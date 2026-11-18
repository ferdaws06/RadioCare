package radiocare.services;
import java.util.List;

import radiocare.repositories.DAOgeneral;

public abstract class ServiceGeneral<T> {
	
	protected final DAOgeneral<T> dao;

	public ServiceGeneral(DAOgeneral<T> dao) {
		super();
		this.dao = dao;
	}
	
	// pour la validation de chaque service
	public abstract void valider(T e);
	
	// ajout apres validation
	public void ajouter(T e) {
		valider(e);
		dao.ajouter(e);
	}
	
	// modifier apres validation
	public void modifier(T e) {
		valider(e);
		e=dao.AfficherParID(dao.getID(e));
		if (e==null) {
			throw new IllegalArgumentException("introuvable id"+dao.getID(e));
		}
		
		dao.modifier(e);
	}
	
	// supprimer apres validation 
	public void supprimer(T e) {
		e=dao.AfficherParID(dao.getID(e));
		if (e==null) {
			throw new IllegalArgumentException("introuvable id"+dao.getID(e));
		}
		dao.supprimer(e);
	}
	// afficher par id
	public T rechercher(int id) {
		return dao.AfficherParID(id);
		
	}
	//afficher tous 
	public List<T> lister(){
		return dao.AfficherTout();
		
	}
	

}
