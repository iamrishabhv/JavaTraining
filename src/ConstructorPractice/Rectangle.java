package ConstructorPractice;

public class Rectangle {
	
	/*Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables.*/
	
	int length;
	int width;
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}
	
	Rectangle(Rectangle rishabh){
		this.length = rishabh.length;
		this.width = rishabh.width;
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle R1 = new Rectangle(40,30);
		Rectangle R2 = new Rectangle(70,50);
		

	}

}
