package lesson8.java;
/** 
Person.java demonstrates
	-- how to declare an instantiable class
	-- how to declare multiple constructors
		 --- constructor: during a program's execution, a constructor is used to initialize the object's instance variables when that object is created
	-- how to implement a class's attributes by declaring instance variables
	-- how to implement a class's behaviour by implementing a method (i.e. displayMe())
*/

//this is instansiable class
public class Person {
//instance variables
	private String name;
	private int age;
	private boolean enjoysReading;
	//default constructor
	public Person() {
		
	}
	//constructor with 1 parameter
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, boolean enjoysReading) {
		this.name = name;
		this.age = age;
		this.enjoysReading = enjoysReading;
	}
	
	public void displayMe() {
		System.out.println("Person`s name: " + name);
		System.out.println("Person`s age: " + age);
		System.out.println("Person enjoys reading: " + enjoysReading);
		System.out.println("=================");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isEnjoysReading() {
		return enjoysReading;
	}
	
	
	
	
	
	
	
	
	

}//class
