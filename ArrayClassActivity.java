// Created on 2/5/2026
package Unit2;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayClassActivity {
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
				System.out.print("Enter a whole number: ");
				numbers[i]=scanner.nextInt();
		}
		scanner.close();
		
		int min = arrayMin(numbers);
		System.out.println("The min of the array is: " + min);
		int max = arrayMax(numbers);
		System.out.println("The max of the array is: " + max);
		int sum = arraySum(numbers);
		System.out.println("The sum of the array is: " + sum);

		System.out.println("Before shuffling, the array is: " + Arrays.toString(numbers));
		
		randomShuffle(numbers);
		System.out.println("After shifting, the array is: " + Arrays.toString(numbers));
		
		
		System.out.println("Before shifting, the array is: " + Arrays.toString(numbers));
		


		
	}
	
	public static int arrayMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int arrayMin(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int arraySum(int[] array) {
		int sum = array[0];
		for (int i = 1; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	public static void randomShuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array [1];
			//generate a random index in [0, array.length-1]
			int randIdx = (int) (Math.random()*array.length);
			//swap values stored at i and randIdx
			array[i] = array[randIdx];
			array[randIdx] = temp;
		}
	}
	
	public static void leftShift(int[] array) {
		int temp = array [0];
		for (int i = 1; i < array.length; i++) {
			array[i-1]=array[i];
		}
	}
}
