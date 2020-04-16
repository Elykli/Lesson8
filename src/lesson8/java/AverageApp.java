package lesson8.java;
/**
Develop an application that accepts 5 integers from the user and stores them in an array.
The application should then calculate and output the average number in the array.
Save the class as AverageApp.java
*/
import java.util.*;
public class AverageApp {

	public static void main(String[] args) {
	
		//declare an [] 
		int numbers[] = new int[5];
		
		Scanner input = new Scanner (System.in);
		//input
		
		for(int i = 0; i< numbers.length; i++) {
			System.out.println("Please enter number: ");
			numbers[i] = input.nextInt();
		}//for loop to prompt the user input 5 times number
		//each interaction of the loop will store the  number provided by the user
		
		//process
		//calculate average of all the numbers from the array
		
		double avg;
		int sum = 0;
//		int counter = numbers.length;
		
		//traverse the array to calculate the sum of all the numbers
		for(int i=0; i< numbers.length; i++) {
			sum = sum+numbers[i];//in each interaction add the current element which is stored in array at index i, to sum
				
		}
		//compute avg
		avg = sum/numbers.length;
		
		//output
		System.out.println("average number is : " +avg);
		
		//display the content of array
		for(int i=0; i<numbers.length; i++) {
			System.out.println("number at # "+ (i+1)  + "is "+ numbers[i]);
		}
	}//main

}
