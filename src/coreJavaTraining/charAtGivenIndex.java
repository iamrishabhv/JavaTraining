/*Write a Java program to get the character at the given index within the string.
 * https://www.w3resource.com/java-exercises/string/index.php*/

package coreJavaTraining;

import java.util.Scanner;

public class charAtGivenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		Scanner i = new Scanner(System.in);
		int j = i.nextInt();
//		System.out.println("The character at position" + " " + j + " " + "is" + " " + t.charAt(j));
		System.out.printf("The character at position %d is %c%n", j, t.charAt(j));

	}

}
