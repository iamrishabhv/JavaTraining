package ExceptionsPractice;

public class OddNumberException {
	
	/*Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.*/
	
	public static void checkOddNumber(int num) {
		if(num%2 != 0) {
			throw new IllegalArgumentException("The number is Odd");
			}
		else {
			System.out.println("The number is Even");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkOddNumber(9);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
