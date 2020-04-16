package lesson8.java;

public class AvgMaxMin {
	//declare instance variables
    private int numbers[];
    private double average;
    private int max;
    private int min;

    //constructor
    public AvgMaxMin() {
    }

    //setter
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    //getters
    public double getAverage() {
        return average;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    //processing
    //avg
    public void calcAvg(){
        int sum; //to store sum af all elements
        sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        average = (double) sum/numbers.length;
    }

    public void calcMax(){
        max = numbers[0];
        for(int i=1; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
    }//end max

    public void calcMin(){
        min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
    }//end min

}
