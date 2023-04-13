public class TrainFactory implements VoyEntiteFactory {

	public Hub createHub() {
		return new Gare();
	}

	public Compagnie createCompagnie() {
		return new Ferroviaire();
	}

	public Voyage createVoyage() {
		return new Trajet();
	}

}