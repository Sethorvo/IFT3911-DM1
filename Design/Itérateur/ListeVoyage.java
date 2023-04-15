import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
public class ListeVoyage implements Iterable {
	private List<Voyage> voyages;

	public ListeVoyage() {
		voyages = new ArrayList<>();
	}
	public void addVoyage(voy Voyage) {
		voyages.add(voy);
	}

	public void removeVoyage(voy Voyage) {
		voyages.remove(voy);
	}

}