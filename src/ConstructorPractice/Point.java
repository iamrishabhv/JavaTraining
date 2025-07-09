package ConstructorPractice;

public class Point {
	
	/*Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

	- One constructor takes int parameters.
	- Another constructor takes double parameters.
	- Print the values of the variables for each constructor.*/
	
	private int x;
	private int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println(x + " " + y);
	}
	
	Point(double x, double y){
		this.x = (int) x;
		this.y = (int) y;
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point P1 = new Point(5,6);
		Point P2 = new Point(5.67,6.34);

	}

}
