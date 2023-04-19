package SystemeReservation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interface.InterfaceAdmin;

public class Systeme {

	public Systeme() throws IOException {
		
		System.out.println("Écrire A pour Session Admin ou C pour Session Client : ");
        
			BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            String session = reader.readLine();
            session = session.toUpperCase();
		if (session.equals("A")) {
			System.out.println("Admin");
			InterfaceAdmin iA = new InterfaceAdmin(); 
			iA.launch();
		}
		
		else if(session.equals("C"))
			System.out.println("Client");
		
		else 
			System.out.println("Erreur");
	}


}
