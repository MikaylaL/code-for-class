/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* HW 1
****************************************************************
*********/
package Homework1;
import java.util.Scanner;

public class Homework1 {
	
	public static void main(String[] args) {
		//Part 1
		//creating variables
		String prefix = "Los ";
		String name = "Angeles";
		//adds prefix to the name
		String place = prefix.concat(name);
		//prints the concatenated string
		System.out.println(place);
		//replaces one word of string with another
		String newPlace = place.replace("Angeles", "Vegas");
		System.out.println(newPlace);
		
		//Part 2
		//creating scanner object and asking for user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 10 and 20: ");
		int number = input.nextInt();
		/*if else statement checking if integer is above or below 15 
		 * and spitting out response*/
		if (number >= 15) {
			System.out.println("The number is 15 or greater.");
		} else {
			System.out.println("The number is less than 15.");
		}
		
		//Part 3
		//generating random number between 20 and 60 inclusive and printing
		int randomNumber = 20 + (int)(Math.random() * (41));
		System.out.print(randomNumber);
	}
}
