package radiocare.repositories;

import java.util.List;

import radiocare.exceptions.ConflitException;
import radiocare.utils.JsonUtil;

public abstract class DAOgeneral <T> {

	protected final String fichier ;//nom du fichier
	protected final Class <T> classe; 
	
	public DAOgeneral(String fichier, Class<T> classe) {
		super();
		this.fichier = fichier;
		this.classe = classe;
	}
	
	
	
	
	//******CRUD******
	
	//chaque entitie a son propre id getter et setter
	public abstract int getID(T entite); // utiliser dans le test  et le recherche dans la liste
	public abstract void setID(T entite,int ID);//utiliser dans ajouter
	
	//create (ADD)
		public void ajouter(T entite){
			List<T> liste= AfficherTout();
			for (int i=0;i< liste.size();i++) {
				if(getID(liste.get(i))==getID(entite)) {
					throw new ConflitException("ce id "+getID(entite)+"deja exist");
				}
				else {
					liste.add(entite);
				}
			}
			JsonUtil.ecrire(fichier, liste);
		}
	
	//read all
	public List<T> AfficherTout(){
		return JsonUtil.lire(fichier,classe); 	
	}
	
	
	//read one object 
	public T AfficherParID(int ID) {
		for ( T c : AfficherTout() ) {
			if (getID(c)==ID) {
				return c;
			}
			
			
		}
		return null;	
	}
	// update 
	public void modifier(T entite) {
		List<T> liste= AfficherTout();
		for (int i=0;i< liste.size();i++) {
			if(getID(liste.get(i))==getID(entite)) {  //get et set predefinie  dans util.list
				liste.set(i,entite);
				break;
			}
		}
		JsonUtil.ecrire(fichier, liste);
		}
	
	
	
	
	//delete
	public void supprimer(T entite){
		List<T> liste= AfficherTout();
		for (int i=0;i< liste.size();i++) {
			if(getID(liste.get(i))==getID(entite)) {
				liste.remove(i);
			}
		}
		}
	
	
		
	
	
	
}
