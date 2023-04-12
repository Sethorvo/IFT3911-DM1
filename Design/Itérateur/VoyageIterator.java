public interface VoyageIterator extends Iterator {

	Voyage current();

	Compagnie getCompagnie();

	Hubs[] getHubs();

	boolean getLibre();

	string[] getDate();

	Transport getTransport();

}