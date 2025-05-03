package coreJavaTraining;

import java.util.Scanner;

public class stringConcatenation {
	
	//Simple Method for Concatenation
	public void stringConcat() {
		String a = "Hello";
		String b = "World";
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringConcatenation sc = new stringConcatenation();	//Object created for calling method defined in public class
		
		//Below is the second method for concatenating two strings
		Scanner s = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		StringBuffer t = new StringBuffer(s.nextLine());
		StringBuffer u = new StringBuffer(r.nextLine());
		sc.stringConcat();
		System.out.println(t.append(" " + u));
	}

}
