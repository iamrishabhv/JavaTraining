/* Q1. Write a Java program to get the character (Unicode code point) at the given index within the string.
 * Q2. Write a Java program to get the character (Unicode code point) before the specified index within the string.
 * https://www.w3resource.com/java-exercises/string/index.php
 */

package coreJavaTraining;

import java.util.Scanner;

public class unicodePointAtGivenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		System.out.printf("Original String: %s%n", s);
		System.out.printf("Character(unicode point) at the given index = %d%n", s.codePointAt(a));	//Output for Q1
		System.out.printf("Character(unicode point) before the specified index = %d%n", s.codePointBefore(a));	//Output for Q2

	}

}
