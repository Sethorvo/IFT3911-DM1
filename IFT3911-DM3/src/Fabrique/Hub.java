package Fabrique;
public class Hub {

	private String ID_Hub;
	private String Ville;

	public Hub(String iD_Hub, String ville) {
		super();
		ID_Hub = iD_Hub;
		Ville = ville;
	}

	public String getID_Hub() {
		return this.ID_Hub;
	}

	/**
	 * 
	 * @param ID_Hub
	 */
	public void setID_Hub(String s) {
		this.ID_Hub = s;
	}

	public String getVille() {
		return this.Ville;
	}

	/**
	 * 
	 * @param Ville
	 */
	public void setVille(String v) {
		this.Ville = v;
	}

}