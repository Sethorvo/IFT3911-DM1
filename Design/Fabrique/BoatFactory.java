public class BoatFactory implements VoyEntiteFactory {

	public Hub createHub() {
		return new Port();
	}

	public Compagnie createCompagnie() {
		return new Navale();
	}

	public Voyage createVoyage() {
		return new Croisiere();
	}

}