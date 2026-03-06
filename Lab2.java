/***************************************************************
****************
*
* Kean University
* Spring 2026
* Course: CPS2231 - Computer Programming
*
* Author: Mikayla Long, 2231*02
*
* Lab 2
****************************************************************
*********/
package Unit2;
import java.util.Arrays;
import java.util.Scanner;

public class Lab2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
			int employees = input.nextInt();
			double[] employeeList = new double[employees];
			
		System.out.print("Enter minimum salary: ");
			double minSalary = input.nextDouble();
			
		System.out.print("Enter maximum salary: ");
			double maxSalary = input.nextDouble();
			
		double[] salaryList = salaries(employeeList, minSalary, maxSalary);
		System.out.println("Salaries: " + Arrays.toString(salaryList));
		
		double averageSalary = calculateAverage(salaryList);
		System.out.println("Average salary: " + averageSalary);
		
		double[] CSArray = new double[employees/2];
		double[] ITArray = new double[employees - employees/2];
		int half1 = employees/2;
		int half2 = employees - employees/2;
		
		System.arraycopy(salaryList, 0, CSArray, 0, (employees/2));
		System.arraycopy(salaryList, (employees/2), ITArray, 0, (employees-employees/2));
		System.out.println("CS Group: " + Arrays.toString(CSArray));
		System.out.println("IT Group: " + Arrays.toString(ITArray));
	}
	
	//this method generates a random array between 10 and 20 (inclusive)
	public static double[] salaries(double[] arr, double minSal, double maxSal) {
		for (int i = 0; i < arr.length; i++) {
				double randomNumber = minSal + (Math.random() * (maxSal - minSal + 1));
				arr[i] = randomNumber;
			}
		return arr;
			
	}
	
	public static double calculateAverage(double[] arr) {
		double sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		double average = sum/arr.length;
		return average;
	}
}
