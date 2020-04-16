package lesson8.java;

public class AvgMax {

	//declare variables
	private int numbers[];
	private double average;
	private int max;
	
	
	public AvgMax() {
		
	}
	
	
	public void setNumbers(int numbers[]) {
		this.numbers = numbers;
	}

	
	public int computeMax() {
		max = numbers[0];
		for(int i=1; i< numbers.length; i++) {
			//if the current element of [] located at i>than value stored in max
			//update max with current element
			if(numbers[i]>max) {
				//update the max with current value
				max = numbers[i];
			}
		}
		return max;
	}
	//getter to retrieve the max


	public int getMax() {
		return max;
	}
	
}
