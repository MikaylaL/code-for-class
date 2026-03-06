/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* Lab 3
****************************************************************
*********/
package Unit3;
import java.util.*;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int rows = input.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = input.nextInt();
		
		int[][] emptyArray = new int[rows][columns];
		int[][] array = createArray(emptyArray);
		
		System.out.println("\nOriginal Array:");
		for (int[] row : array) {
			System.out.println(Arrays.toString(row));
		}
		System.out.print("\n");

		
		findAverage(array, columns);
		
		int[][] updatedArray = getUpdatedArray(array);
		System.out.println("Updated Array (odd values doubled): ");
		for (int[] row : updatedArray) {
			System.out.println(Arrays.toString(row));
		}
		System.out.print("\n");
		
	}
	
	public static int[][] createArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int randomNumber = 10 + (int)(Math.random() * 100);
				arr [i][j] = randomNumber;
			}
		}
		return arr;
	}
	
	public static void findAverage(int[][] arr, int columns) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row index (0 to " + (arr.length-1) + "): ");
		int chosenRow = input.nextInt();
		int sum = 0;
		for (int j = 0; j < arr[chosenRow].length; j++) {
			sum += arr[chosenRow][j];
		}
		int average = sum/columns;
		System.out.println("Average of row " + chosenRow + " = " + average + "\n");
	}
	
	public static int[][] getUpdatedArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((arr[i][j])%2 != 0) {
					arr[i][j] = arr[i][j]*2;
				}
			}
		}
		return arr;
	}
}
