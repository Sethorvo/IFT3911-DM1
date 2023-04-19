public class VoyEntiteFactory {

	private VoyEntiteFactory instance;

	/**
	 * 
	 * @param ID_hub
	 * @param Ville
	 */
	public void createHub(string ID_hub, string Ville) {
		// TODO - implement VoyEntiteFactory.createHub
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID_compagnie
	 */
	public Compagnie createCompagnie(string ID_compagnie) {
		// TODO - implement VoyEntiteFactory.createCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date_heure_D
	 * @param ID_trajet
	 */
	public void createVoyage(string[] date_heure_D, string ID_trajet) {
		// TODO - implement VoyEntiteFactory.createVoyage
		throw new UnsupportedOperationException();
	}

	public VoyEntiteFactory getInstance() {
		return this.instance;
	}

}