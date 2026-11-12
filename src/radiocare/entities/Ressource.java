package radiocare.entities;

public abstract class Ressource {
	protected int id;

	public Ressource(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
