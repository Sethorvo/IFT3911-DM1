public class Voyage {

	private Compagnie compagnie;
	private Hub hub_D;
	private Hub hub_A;
	private string[] date_heure_D;
	private string ID_trajet;
	private boolean libre;
	private Transport trans;

	public Compagnie getCompagnie() {
		return this.compagnie;
	}

	/**
	 * 
	 * @param compagnie
	 */
	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public Hub getHub_D() {
		return this.hub_D;
	}

	/**
	 * 
	 * @param hub_D
	 */
	public void setHub_D(Hub hub_D) {
		this.hub_D = hub_D;
	}

	public Hub getHub_A() {
		return this.hub_A;
	}

	/**
	 * 
	 * @param hub_A
	 */
	public void setHub_A(Hub hub_A) {
		this.hub_A = hub_A;
	}

	public string[] getDate_heure_D() {
		return this.date_heure_D;
	}

	public string getID_trajet() {
		return ID_trajet;
	}

	/**
	 * 
	 * @param ID_trajet
	 */
	public void setID_trajet(string ID_trajet) {
		this.ID_trajet = ID_trajet;
	}

	public boolean getLibre() {
		return this.libre;
	}

	/**
	 * 
	 * @param libre
	 */
	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public Transport getTrans() {
		return this.trans;
	}

	/**
	 * 
	 * @param trans
	 */
	public void setTrans(Transport trans) {
		this.trans = trans;
	}

}