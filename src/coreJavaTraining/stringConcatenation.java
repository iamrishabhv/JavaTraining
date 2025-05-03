//https://www.codechef.com/blogs/strings-in-java
//Write a Java program to concatenate a given string to the end of another string.
package coreJavaTraining;

import java.util.Scanner;

public class stringConcatenation {
	
	//Method 1 for Concatenation using String Literal class
	public void literalConcat() {
		String a = "Hello";
		String b = "World";
		System.out.println(a + " " + b);
	}
	
	//Method 2 to concatenate a given string to the end of another string
	public void endConcate() {
		Scanner sa = new Scanner(System.in);
		Scanner sb = new Scanner(System.in);
		String c = sa.nextLine();
		String d = sb.nextLine();
		System.out.printf("String 1: %s%n", c);
		System.out.printf("String 2: %s%n", d);
		System.out.printf("The concatenated string: %s %n", c.concat(" " + d));
	}
	
	//Method 3 to concatenate two string using StringBuffer Class
	public void bufferConcate() {
		Scanner s = new Scanner(System.in);
		Scanner r = new Scanner(System.in);
		StringBuffer t = new StringBuffer(s.nextLine());
		StringBuffer u = new StringBuffer(r.nextLine());
		System.out.printf("Appended String is: %s %n",t.append(" " + u));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringConcatenation sc = new stringConcatenation();	//Object created for calling method defined in public class
		stringConcatenation sd = new stringConcatenation();
		stringConcatenation se = new stringConcatenation();
		sc.literalConcat();
		sd.endConcate();
		se.bufferConcate();
	}

}
