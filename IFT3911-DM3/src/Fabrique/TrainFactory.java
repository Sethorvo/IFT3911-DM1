package Fabrique;

public class TrainFactory implements VoyEntiteFactory {

	public Hub createHub() {
		return new Gare(null, null);
	}

	public Compagnie createCompagnie() {
		return new Ferroviaire(null, 0);
	}

	public Voyage createVoyage() {
		return new Trajet(null, null, null, null, null, false, null);
	}

}