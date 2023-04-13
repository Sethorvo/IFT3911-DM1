public class Croisiere extends Voyage {

	private int duree;
	private string[] date_heure_A;
	private Port[] itineraire;

	public int getDuree() {
		return this.duree;
	}

	/**
	 *
	 * @param duree
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}

	public string[] getDate_heure_A() {
		return this.date_heure_A;
	}

	/**
	 *
	 * @param date_heure_A
	 */
	public void setDate_heure_A(string[] date_heure_A) {
		this.date_heure_A = date_heure_A;
	}

	public Port[] getItineraire() {
		return this.itineraire;
	}

	/**
	 *
	 * @param itineraire
	 */
	public void setItineraire(Port[] itineraire) {
		this.itineraire = itineraire;
	}

}