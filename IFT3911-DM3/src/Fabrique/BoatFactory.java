package Fabrique;
public class BoatFactory implements VoyEntiteFactory {

	public Hub createHub() {
		return new Port(null, null);
	}

	public Compagnie createCompagnie() {
		return new Navale(null, 0);
	}

	public Voyage createVoyage() {
		return new Croisiere(null, null, null, null, null, false, null);
	}

}