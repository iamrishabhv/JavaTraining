package ConstructorPractice;

public class Car {
	
	/*Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.*/
	
	String make;
	String model;
	int year;
	
	Car(String make, String model, int year){
		this.make = ((make == null || make.isEmpty()) ? "Maruti" : make);
		this.model = ((model == null || model.isEmpty()) ? "Swift" : model);
		this.year = (year <= 0 ? 2017 : year);
		
		System.out.println("Manufacturer: " + this.make);
		System.out.println("Model Name: " + this.model);
		System.out.println("Year of Manufacturing: " + this.year);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car C1 = new Car("Tata","Punch",2023);
		Car C2 = new Car("","",-1);			
		Car C3 = new Car("Kia","Seltos",2024);

	}

}
