package lesson8.java;
import java.util.*;
public class CalcApp {
	 public static void main(String[] args) {

	        //declare [] to store integer elements
	        int numbers[];

	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the size of array: ");
	        int size = input.nextInt();

	        numbers = new int [size];

	        //input
	        for(int i =0; i < size; i++){
	            System.out.println("Enter value " + (i+1));
	            numbers[i] = input.nextInt();
	        }

	        //processing
	        AvgMaxMin amm = new AvgMaxMin();
	        amm.setNumbers(numbers);
	        amm.calcAvg();
	        amm.calcMax();
	        amm.calcMin();

	        double avg, max, min;

	        avg = amm.getAverage();
	        max = amm.getMax();
	        min = amm.getMin();

	        System.out.println("Average: " + avg);
	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);

	    }//end main
}
