package Fabrique;

public class Trajet extends Voyage {

	public Trajet(Compagnie compagnie, Hub hub_D, Hub hub_A, String date_heure_D, String iD_trajet, boolean libre,
			Transport trans) {
		super(compagnie, hub_D, hub_A, date_heure_D, iD_trajet, libre, trans);
		// TODO Auto-generated constructor stub
	}

	private Gare[] itineraire;
	private String[] date_heure_A;

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

	public String[] getDate_heure_A() {
		return this.date_heure_A;
	}

	/**
	 *
	 * @param date_heure_A
	 */
	public void setDate_heure_A(String[] date_heure_A) {
		this.date_heure_A = date_heure_A;
	}

}