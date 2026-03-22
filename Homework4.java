/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* Homework 4
****************************************************************
*********/
package Unit5;

public class Homework4 {
	public static void main (String[] args) {
		//Integer Wrapper Class
		Integer random = new Integer("2");
		//Displays double value of the random integer
		System.out.println("Double of random integer: " + random.doubleValue());
		//Displays long value of the random integer
		System.out.println("Long of random integer: " + random.longValue());
		//Parse binary string into decimal value
		Integer binary = Integer.parseInt("11000", 2);
		System.out.println("Binary \"11000\" is: " + binary);
		System.out.print("\n");
		
		//String Class
		String message = new String("I Love Learning Java");
		//displaying only substring
		System.out.println(message.substring(16));
		String otherMessage = new String("I#Love$Learning:Java");
		//comparing the two string objects
		System.out.println("Are the two messages the same? " + (message==otherMessage));
		//replacing characters in the second string object
		String split = otherMessage.replaceAll("[$#:]", " ");
		System.out.println(split+"\n");
		
		//StringBuilder Class
		StringBuilder sb = new StringBuilder("Kean University New Jersey");
		//prints substring
		System.out.println(sb.substring(5,6));
		//adding to the object
		sb.insert(0, "Study at ");
		sb.append("!");
		System.out.println(sb);
	}
}
