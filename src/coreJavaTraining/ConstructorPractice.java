package coreJavaTraining;

public class ConstructorPractice {
	
	/*Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.*/
	
	String name;
	int age;
	
	ConstructorPractice(){
		this.name = "Unknown";
		this.age = 0;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice CP = new ConstructorPractice();

	}

}
