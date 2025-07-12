package ConstructorPractice;

public class Singleton {
	
	/*Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.*/
	
	private static Singleton singleInstance = null;
	
	private Singleton() {
		System.out.println("Private Constructor is Created!");
	}
	
	public static Singleton getInstance() {
		if(singleInstance == null) {
		singleInstance = new Singleton();
		}
		return singleInstance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton S1 = Singleton.getInstance();
		Singleton S2 = Singleton.getInstance();
		System.out.println("Are both instances same? " + (S1 == S2));

	}

}
