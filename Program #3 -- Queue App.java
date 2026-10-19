//Programmer: Javan Graber
//Date: 10/19/26

package javanproject;

import java.util.LinkedList;
import java.util.Queue;

public class MyProject {   

    public static void main(String[] args) {
    	
    	//Create the queues
    	Queue<String> line1 = new LinkedList<>();
    	Queue<String> line2 = new LinkedList<>();
    	
    	//Initialize the character, time, random number, and person
    	char let = 'A';
    	int time = 0;
    	int rn;
    	String person = "" + let + let + let;
    	
    	//Add the first person to line 1, but leave line 2 empty for now
    	line1.add(person);
    	
    	//Create a while loop that iterates 40 times
    	while (time < 40) {
    		
    		//Get the length of the queues
    		int length1 = line1.size();
    		int length2 = line2.size();
    		
    		//If the length of either queue is too long, lower it
    		if (length1 >= 9) {
    			System.out.println("The line was too long. No one joined until it lowered.");
    			line1.poll();
    		}
    		
    		if (length2 >= 9) {
    			System.out.println("The line was too long. No one joined until it lowered.");
    			line1.poll();
    		}
    		
    		//If none of the lines are too long, continue the line process
    		else {
    			
    		//Generate a random number from 0-5
	    	rn = (int)(Math.random() * 6);
	    	System.out.println();
	    	
	    	//If the random number is 1 or 2...
	    	if ((rn == 1) || (rn == 2)) {

	    		//Generate either 0 or 1
	    		rn = (int)(Math.random() * 2);
	    		
	    		//If the number is 1, add the person to the first queue
	    		if (rn == 1) {
	    			let++; person = "" + let + let + let; line1.add(person);
	    		}
	    		
	    		//If the number is 0, add the person to the second queue
	    		else {
	    			let++; person = "" + let + let + let; line2.add(person);
	    		}
	    	}
	    	
	    	//If the random number is 3, 4, or 5...
	    	if ((rn == 3) || (rn == 4) || (rn == 5)) {
	    		
	    		//Generate either 0 or 1
	    		rn = (int)(Math.random() * 2);
	    		
	    		//If the number is 1, take away a person from the first line
	    		if (rn == 1) {
	    			let++; person = "" + let + let + let; line1.poll();
	    		}
	    		
	    		//If the number is 0, take away a person from the second line
	    		else {
	    			let++; person = "" + let + let + let; line2.poll();
	    		}

	    	}
    		}
    		
	    	//Display and increment the time
	    	System.out.println("Time " + time);
	    	System.out.println("\tline 1 " + line1);
	    	System.out.println("\tline 2 " + line2);
	    	time ++;
    	}
    	
    	}
    	
    }
