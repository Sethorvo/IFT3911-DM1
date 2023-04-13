public class Trajet extends Voyage {

	private Gare[] itineraire;
	private string[] date_heure_A;

	public Gare[] getItineraire() {
		return this.itineraire;
	}

	/**
	 * 
	 * @param itineraire
	 */
	public void setItineraire(Gare[] itineraire) {
		this.itineraire = itineraire;
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

}