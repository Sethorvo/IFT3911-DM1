package SystemeReservation;

import java.util.List;

import Fabrique.Compagnie;
import Fabrique.Hub;
import Fabrique.Transport;
import Fabrique.Voyage;

public class Database {

	public List<Voyage> listVoyage;
	
	//Compagnie et Hub
	
	Compagnie c1 = new Compagnie("AGF225", 500);
	Compagnie c2 = new Compagnie("TCJ232", 200);
	Compagnie c3 = new Compagnie("COK298", 514);
	Hub h1 = new Hub("MTL", "Montreal");
	Hub h2 = new Hub("NYC", "New York");
	Hub h3 = new Hub("FLO", "Floride");
	Hub h4 = new Hub("MAN", "Manchester");
	Hub h5 = new Hub("LON", "London");
	Hub h6 = new Hub("MAD", "Madrid");
	
	public void Voyages() {
	Voyage v1 = new Voyage(c1, h1, h2, "2023.04.20:09.00-2023.04.20:11.00", "AG251T", true, Transport.AVION);
	Voyage v2 = new Voyage(c2, h3, h4, "2023.04.22:06.30-2023.04.22:11.30", "TC91WK2", true, Transport.BATEAU);
	Voyage v3 = new Voyage(c3, h5, h6, "2023.04.21:03.35-2023.04.28:01.45", "CO15234A", true, Transport.TRAIN);		
	
	listVoyage.add(v1);
	listVoyage.add(v2);
	listVoyage.add(v3);
	}
	

	
	
	
	
}
