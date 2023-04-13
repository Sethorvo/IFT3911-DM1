public class PlaneFactory implements VoyEntiteFactory {

	public Hub createHub() {
		return new Aeroport();
	}

	public Compagnie createCompagnie() {
		return new Aerienne();
	}

	public Voyage createVoyage() {
		return new Vol();
	}

}