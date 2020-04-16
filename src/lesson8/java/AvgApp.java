package lesson8.java;
import java.util.*;
public class AvgApp {

	public static void main(String[] args) {
		//declare [] to store integer elements
		int numbers[];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");

		int size = input.nextInt();
		
		numbers = new int[size];
		
		//input
		//loop to prompt the user to input the numbers
		//in each iterations of loop to store the number provided by user in the number []at the index i
		for(int i=0; i< size; i++) {
			System.out.println("Enter value" + (i+1) );
			numbers[i] = input.nextInt();
		}
		
		//processing
		AvgMax avgMax = new AvgMax();
		//use the setter to store the numbers provided by the user
		avgMax.setNumbers(numbers);
		avgMax.computeMax();
		double b = avgMax.getMax();
		
		Avg myAvg = new Avg();
		myAvg.setNumbers(numbers);
		myAvg.calculateAverage();
		double a = myAvg.getAverage();
		
		AvgMin min = new AvgMin();
		min.setNumbers(numbers);
		min.calculateMin();
		double c = min.getMin();
		
		
		System.out.println("Average is: " +a);
		System.out.println("Max is: " +b);
		System.out.println("Min is: " +c);
		
	}//main

}
