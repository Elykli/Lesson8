package lesson8.java;

public class Avg {

	private int numbers[];
    private double average;

    public Avg() {
    }

    //declare setter
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    //processing
    //compute the average of all numbers from array
    public void calculateAverage(){
        int sum; //to store sum af all elements
        int currentElement; //to store the current element from the array
        sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }

        average = (double) sum / numbers.length;
    }

    //getter
    public double getAverage() {
        return average;
    }


}
