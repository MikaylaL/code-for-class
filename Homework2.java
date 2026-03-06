/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* HW 2
****************************************************************
*********/
package homeworkAssignments;

import java.util.*;

public class Homework2 {
	public static void main(String[] args) {
		int[][] array = new int [2][4];
		array = generateArray(array);
		System.out.println("Original 2D Array: ");
		for (int[] row : array) {
			System.out.println(Arrays.toString(row));
		}
		
		int[] firstRow = new int [4];
		int[] secondRow = new int[4];
		System.arraycopy(array[0], 0, firstRow, 0, array[0].length);
		System.arraycopy(array[0], 0, secondRow, 0, array[1].length);
		System.out.println("First Row Copied to 1D Array: ");
		System.out.println(Arrays.toString(firstRow));
		System.out.println("Second Row Copied to 1D Array: ");
		System.out.println(Arrays.toString(secondRow));
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number betwen 10 and 20: ");
		int userNumber = input.nextInt();
		
		boolean found = findUserNumber(array, userNumber);
		if (found) {
			System.out.print("Your number is present.");
		} else {
			System.out.print("Your number is not present.");
		}

		
	}
	
	
	//this method generates a random array between 10 and 20 (inclusive)
	public static int[][] generateArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int randomNumber = 10 + (int)(Math.random() * 10);
				arr [i][j] = randomNumber;
			}
		}
		return arr;
	}
	
	public static boolean findUserNumber(int[][] arr, int userNum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (userNum == arr[i][j]) {
					boolean found = true;
					return found;	
				}
			}
		}
		boolean found = false;
		return found;
	}
}
