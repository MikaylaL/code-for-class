/***************************************************************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, CPS2231, Section 02
*
* Lab 1
****************************************************************/
package Unit2;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		int count = 0;
		
		//this loop makes the method run 5 times before ending the program
		while (count !=5) {
			
			//gets scanner input for users name
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your first name: ");
			String firstName = input.nextLine();
			System.out.print("Enter your last name: ");
			String lastName = input.nextLine();
			
			//creates the participant name
			String fullName = (firstName + " " + lastName);
			
			//calls methods
			String username = generateUsername(firstName, lastName);
			int password = generatePassword();
			
			//prints the results
			System.out.println("Participant: " + fullName);
			System.out.println("Username: " + username);
			System.out.println("Password: " + password); 
			System.out.println("-----------------------------");
			
			//increases count by 1
			count++;
		}	
	}
	
	//this method generates a string based on the first initial, and users last name
	public static String generateUsername(String firstName, String lastName) {
		String initial = firstName.substring(0,1);
		String userFirst = (String)initial;
		String userHalf = userFirst.concat(lastName);
		String userUpper = userHalf.concat("_keancup");
		String user = userUpper.toLowerCase();
		return user;
	}
	
	//this method generates a random password between 10000 and 99999 (inclusive)
	public static int generatePassword() {
		int randomNumber = 10000 + (int)(Math.random() * 90000);
		return randomNumber;
	}
}
