package ConstructorPractice;

public class Classroom {
	
	/*Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.*/
	
	String className;
	String[] students;
	
	Classroom(String className, String[] students){
		this.className = className;
		this.students = students;
		System.out.println("Class Name: " + className);
		System.out.println("Students : ");
		for(String student : students) {
			System.out.println(student + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentArray = {"Mohan","Sohan","Rohit"};
		Classroom C = new Classroom("Science 101",studentArray);
		

	}

}
