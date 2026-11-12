package radiocare.entities;

public class Personnel extends Personne {
	protected int ID;
	protected int CIN;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public Personnel(String nom, String prenom, int iD, int cIN) {
		super(nom, prenom);
		ID = iD;
		CIN = cIN;
	}
	

}
