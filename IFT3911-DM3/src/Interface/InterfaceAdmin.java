package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import SystemeReservation.Database;

public class InterfaceAdmin {
	
		public void launch() throws IOException {
			System.out.println("Choisir Option"
				+ "\n1- Consultation"
				+ "\n2- Menu Voyage"
				+ "\n3- Menu Compagnie"
				+ "\n4- Menu Hub"
				+ "\n5- Assign Price");
			
			BufferedReader reader = new BufferedReader(
		    new InputStreamReader(System.in));
		    String choix = reader.readLine();
			
		    if(choix.equals("1")){
		    	System.out.println("Consultation : ");
		    	Database d = new Database();
		    	System.out.println(d.listVoyage);
		    	
		    }
		    	
		    else if(choix.equals("2")){
		    	System.out.println("Menu Voyage : ");
		    }
		    	
		    else if(choix.equals("3")){
		    	System.out.println("Menu Compagnie : ");
		    }
		    	
		    else if(choix.equals("4")){
		    	System.out.println("Menu Hub : ");
		    }
		    	
		    else if(choix.equals("5")){
		    	System.out.println("Assignation de Prix : ");

		    }
		    else{
		    	System.out.println("Erreur");
		    } 
		   
		}
		
		
	
}
