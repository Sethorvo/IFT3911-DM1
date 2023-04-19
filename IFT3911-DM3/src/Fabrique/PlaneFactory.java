package Fabrique;

public class PlaneFactory implements VoyEntiteFactory {

	public Hub createHub() {
		return new Aeroport(null, null);
	}

	public Compagnie createCompagnie() {
		return new Aerienne(null, 0);
	}

	public Voyage createVoyage() {
		return new Vol(null, null, null, null, null, false, null);
	}

}