//Programmer: Javan Graber
//Date: 10/19/26

package javanproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
    	
    	//Create the map
    	Map<String,String> identification = new HashMap<>();
    	Map<String,String> messages = new HashMap<>();
    	
    	//Initialize the maps with their respective user names, passwords, and messages
    	identification.put("Jblake2370", "SuperSecretPassword007");
    	identification.put("Pmason4250", "YouWillNeverGuessThis555");
    	identification.put("SDonald1515", "MyDogIsNamedPeter679");
    	identification.put("KRichardson1678", "StealthModeMan0000");
    	identification.put("GSmith1231", "idk41567892");
    	identification.put("SMartin3458", "HiddenButterfly306");
    	
    	messages.put("Jblake2370", "Hi, Jason! Are you going to the game this Friday?");
    	messages.put("Pmason4250", "You have a package on your front porch, Peter.");
    	messages.put("SDonald1515", "Sam, why are you still gone? It is nearly 8:00!");
    	messages.put("KRichardson1678", "Do you remember the garage code, Kyle?");
    	messages.put("GSmith1231", "I noticed that you were not here this morning, Greg. Is something wrong?");
    	messages.put("SMartin3458", "I already swept the floor and cleaned the table for you, Sandra.");
    	
    	//Get the user name
    	System.out.println("Enter your user name: ");
    	String userName = userinput.nextLine();
    	System.out.println();
    	
    	//Get the password
    	System.out.println("Enter your password: ");
    	String password = userinput.nextLine();
    	System.out.println();
    	
    	//Set the found variable to false
    	boolean found = false;
    	
    	//Check each key for the provided user name
    	for (String i: identification.keySet()) {
    		//If it is found...
    		if (i.equals(userName)) {
    			//Check to see if the password provided equals the password for that user name
				if (password.equals(identification.get(userName))) {
					System.out.println(messages.get(userName));
					found = true;
				}
    		}
    		
    	}
    	//Display an error message if it is not found
    	if (!found) {
    		System.out.println("Error! That information was incorrect!");
    	}
    	
    	}
    	
    }
