package radiocare.entities;

public abstract class Ressource {
	protected String id;

	public Ressource(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
