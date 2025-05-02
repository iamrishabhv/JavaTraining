package coreJavaTraining;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
//		String s = "madam";
		String t = "";
		for (int i = s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);			
		 	}
	if(s.equals(t)) {					// if(s==t) doesn't work in Java as it compares the reference of two objects in memory.
			System.out.println("String is a Palindrome");
		}
	else {
			System.out.println("String is NOT a Palindrome");
		}
				
	}
}
