package ConstructorPractice;

public class Student {
	
	/*Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.*/
	
	int studentId;
	String studentName;
	double grade;
	
	Student(){
		this(856,"Rishabh",7.2);
	}
	
	Student(int studentId, String studentName, double grade){
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Grade: " + grade);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student();
		Student S2 = new Student(956,"Shivani",8.9);

	}

}
