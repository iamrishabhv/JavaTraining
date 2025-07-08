package ConstructorPractice;

public class Book {
	
	/*Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

	- One constructor takes title and author as parameters.
	- The other constructor takes title, author, and price as parameters.
	- Print the values of the variables for each constructor.*/
	
	String title;
	String author;
	double price;
	
	Book(){
		this.title = "Book 1";
		this.author = "Chetan Bhagat";
		this.price = 100.00;
	}
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book B1 = new Book();
		System.out.println("Book1 Title: " + B1.title);
		System.out.println("Book1 Author: " + B1.author);
		System.out.println("Book1 Price: " + B1.price);
		
		Book B2 = new Book("A Subtle Art of Not Giving a F*ck","Shakespear");
		System.out.println("Book2 Title: " + B2.title);
		System.out.println("Book2 Author: " + B2.author);
		
		Book B3 = new Book("Physics","H.C.Verma",250.00);
		System.out.println("Book3 Title: " + B3.title);
		System.out.println("Book3 Author: " + B3.author);
		System.out.println("Book3 Price: " + B3.price);

	}

}
