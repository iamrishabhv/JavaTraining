package ExceptionsPractice;

import java.util.Scanner;

class StringHasVowelsException extends Exception{
	public StringHasVowelsException(String message) {
		super(message);
	}
}

public class StringWithNoVowels {
	
	/*Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.*/
	
	public static void CheckString() throws StringHasVowelsException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your String: ");
		String str = sc.nextLine();
		if(str.matches(".*[aeiouAEIOU].*")) {
			throw new StringHasVowelsException("Input String Contains Vowels");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CheckString();
			System.out.println("No Vowels are present in the Input String");
		}
		catch(StringHasVowelsException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
