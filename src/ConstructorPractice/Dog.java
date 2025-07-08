package ConstructorPractice;

public class Dog {
	
	/*Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables.*/
	
	String name;
	String color;
	
	Dog(String name, String color){
		this.name = name;
		this.color = color;
		System.out.println(name + " " + color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog D1 = new Dog("Lucky","Golden");
		Dog D2 = new Dog("Rocky","Black");
		Dog D3 = new Dog("Bruno","White");
		Dog D4 = new Dog("Sheru","Brown");

	}

}
