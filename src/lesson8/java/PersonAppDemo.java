package lesson8.java;
/** 
Develop an application which creates multiple objects of type Person class
Store them in an array, retrieve the objects from the array and call different methods on these objects.
*/
import java.util.*;
public class PersonAppDemo {

	public static void main(String[] args) {
		// declare an array of type Person
		Person people [];
		//to store the number of person to be crreated
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Person`s  will be created?");
		n = sc.nextInt();
		
		people = new Person[n];
		
		//local variables
		String name;
		int age;
		boolean enjoysReading;
		
		//for loop to take the users input in each iteration create an object of type Person using input and store it in array
		for(int i=0; i<n; i++) {
			System.out.println("Name: ");
			name = sc.next();
			System.out.println("Person`s age: ");
			age = sc.nextInt();
			System.out.println("Does person enjoys reading: ");
			enjoysReading = sc.nextBoolean();
			
			people[i] = new Person(name, age, enjoysReading);
		}//for
		
		//processing
		Person p;
		
		boolean enjoy;
		
		//traverse the array using loop
		for(int i = 0; i<people.length; i++) {
			//retrieve the person object located at index i
			p = people[i];
			
			p.displayMe();
			
			enjoy = p.isEnjoysReading();
			
			if(enjoy==true) {
				System.out.println("Enjoys reading");
			}else {
				System.out.println("Does not enjoy reading");
			}
		}
	}//main

}
