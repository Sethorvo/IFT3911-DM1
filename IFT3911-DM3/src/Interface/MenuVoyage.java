package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuVoyage {

	
	public void launch() throws IOException {
		System.out.println("Choisir Option"
			+ "\n1- Creation Vol"
			+ "\n2- Creation Croisière"
			+ "\n3- Creation Rail"
			+ "\n4- Modifier Voyage"
			+ "\n5- Supprimer Voyage");
		
		BufferedReader reader = new BufferedReader(
	    new InputStreamReader(System.in));
	    String choix = reader.readLine();
		
	    if(choix.equals("1")) {
	    	System.out.println("Creation Vol : ");
	    }
	    	
	    else if(choix.equals("2")){
	    	System.out.println("Creation Croisière : ");
	    }
	    	
	    else if(choix.equals("3")){
	    	System.out.println("Creation Rail : ");
	    }
	    	
	    else if(choix.equals("4")){
	    	System.out.println("Modifier Voyage : ");
	    }
	    	
	    else if(choix.equals("5")){
	    	System.out.println("Supprimer Voyage : ");
	    }
	    	
	    else System.out.println("Erreur");
	   
	}
	
	
}
