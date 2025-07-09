package ConstructorPractice;

public class Account {
	
	/*Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

	- accountNumber should be non-null and non-empty.
	- balance should be non-negative.
	- Print an error message if the validation fails.*/
	
	String accountNumber;
	double balance;
	
	Account(String accountNumber, double balance){
		if(accountNumber == null || accountNumber.isEmpty()) {
			throw new IllegalArgumentException("Account Number cannot be empty");
		}
		
		if(balance < 0) {
			throw new IllegalArgumentException("Balance cannot be negative");
		}
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account A1 = new Account("987654321",1450.45);
//		Account A2 = new Account("324324243",-453.95);
//		Account A3 = new Account("",5650.85);

	}

}
