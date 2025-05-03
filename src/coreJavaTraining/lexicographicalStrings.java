//Write a Java program to compare two strings lexicographically.
//Write a Java program to compare two strings lexicographically, ignoring case differences.

package coreJavaTraining;

import java.util.Scanner;

public class lexicographicalStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String s = a.nextLine();
		Scanner b = new Scanner(System.in);
		String t = b.nextLine();
		System.out.printf("String 1: %s%n", s);
		System.out.printf("String 2: %s%n", t);
/* The below commented case would not work in all corner cases as it will only check for equal & less than strings.
 * 		if(s.equals(t) && s.length() == t.length()) {
//			System.out.printf("%s is equal to %s",s,t);
//		}
//		else {
//			System.out.printf("%s is less than %s",s,t);
		}
*/	
//		Below case will work in all corner cases in case of lexicographical comparison of two strings
//		System.out.println(s.compareTo(t));
		if(s.compareToIgnoreCase(t) == 0) {
			System.out.printf("%s is equal to %s%n", s, t);
		}
		else if(s.compareToIgnoreCase(t) > 0) {
			 System.out.printf("%s is greater than %s%n", s, t);
		}
		else {
			 System.out.printf("%s is less than %s%n", s, t);
		}
	}
}
