public class VoyageFinder implements VoyageIterator {
	private int position;
	private ListeVoyage liste;


	public Container first() {
		//return liste.voyages.get(0);
	}

	public Container next() {
		if (hasNext()) {
			return liste.voyages.get(position++);
		} else {
			return null;
		}
	}

	public Container isDone() {
		// TODO - implement VoyageFinder.isDone
		return position >= liste.voyages.size();
	}
	public boolean hasNext() {
		return position < liste.voyages.size();
	}
	public Container currentItem() {
		return liste.voyages.get(position);
	}

	public Compagnie getCompagnie() {
		Voyage voy = liste.voyages.get(position)
		return voy.getCompagnie();
	}

	public Hub getHubA() {
		Voyage voy = liste.voyages.get(position)
		return voy.getHub_A();
	}
	public Hub getHubD() {
		Voyage voy = liste.voyages.get(position)
		return voy.getHub_D();
	}


	public boolean getLibre() {
		Voyage voy = liste.voyages.get(position)
		return voy.getLibre();
	}

	public string[] getDate() {
		Voyage voy = liste.voyages.get(position)
		return voy.getDate_heure_D();
	}

	public Transport getTransport() {
		Voyage voy = liste.voyages.get(position)
		return voy.getTrans();
	}

}