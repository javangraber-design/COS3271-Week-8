//Programmer: Javan Graber
//Date: 10/19/26

package javanproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
    	
    	//Create the list
    	List<Object> userlist = new ArrayList<>();
    	
    	//Initialize the continue variable
    	String cont = "";
    	
    	System.out.println("The additions to the list can be strings, integers, characters, decimals, or anything you want saved!");
    	System.out.println();
    	//Allow the user to add anything they want to the list
    	while (!cont.equals("n")) {
    		
    		//Get the selection
    		System.out.println("Please enter the addition to the list: ");
    		String addition = userinput.nextLine();
    		
    		//Add it to the list and display the list
    		userlist.add(addition);
    		System.out.println(addition + " has been added!");
    		System.out.println("Here is the current list:" + userlist);

    		//Ask if they want to go again
    		System.out.println();
    		System.out.println("Do you want to add another value to the list? (y or n): ");
    		cont = userinput.nextLine();
    	}
    	
    	//Display the current list and ask if the user wants to adjust it
    	System.out.println("Here is the current list:" + userlist);
    	System.out.println();
    	System.out.println("Do you want to add, remove, or edit anything in the list? (y or n): ");
    	String change = userinput.nextLine();
    	
    	//If they want to adjust it, allow them to adjust it as many times as they want
    	while (!change.equals("n")) {
    		
    		//Display the list and the selections
    		System.out.println("Here is the current list:" + userlist);
    		System.out.println();
    		System.out.println("Options for Adjustment");
    		System.out.println("1. Add");
    		System.out.println("2. Remove");
    		System.out.println("3. Edit");
    		System.out.println();
    		
    		//Get the selection
    		System.out.println("Please enter your selection: ");
    		int selection = userinput.nextInt();
    		userinput.nextLine();
    		
    		//If they want to add something to the list, add it
    		if (selection == 1) {
    			System.out.println();
        		System.out.println("Please enter the addition to the list: ");
        		String addition = userinput.nextLine();
        		
        		//Add it to the list and display the list
        		userlist.add(addition);
        		System.out.println(addition + " has been added!");
        		System.out.println("Here is the current list:" + userlist);
        	}
    		
        	//If they want to remove something, remove it
    		if (selection == 2) {
    			System.out.println();
        		System.out.println("Please enter what you want removed: ");
        		String remove = userinput.nextLine();
        		
        		//Remove it from the list and display the list
        		int removeIndex = userlist.indexOf(remove);
        		userlist.remove(removeIndex);
        		System.out.println(remove + " has been removed!");
        		System.out.println("Here is the current list:" + userlist);
    		}
    		
    		//If they want to replace something, replace it
    		if (selection == 3) {
        		System.out.println("Please enter the value you want to replace: ");
        		String replace = userinput.nextLine();
        		
        		//Find the index of the item and remove the item
        		int replaceIndex = userlist.indexOf(replace);
        		userlist.remove(replaceIndex);
        		
        		//Get the new item, add it to the list, and display the list
        		System.out.println("Please enter the new value for that place: ");
        		String newValue = userinput.nextLine();
        		userlist.add(replaceIndex, newValue);
        		
        		System.out.println();
        		System.out.println("The change has been made!");
        		System.out.println("Here is the current list:" + userlist);
    		}
    		
    		//Ask if they want to go again
    		System.out.println();
    		System.out.println("Do you want to make another change? (y or n): ");
    		change = userinput.nextLine();
    	}
    	
    	System.out.println("Here is the final list:" + userlist);
    	
    	}
    	
    }
