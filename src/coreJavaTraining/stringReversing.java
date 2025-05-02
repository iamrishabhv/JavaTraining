/* Problem solved from
 * https://www.geeksforgeeks.org/reverse-a-string/
*/
package coreJavaTraining;

import java.util.Scanner;

public class stringReversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StringBuilder t = new StringBuilder(s.nextLine());
		System.out.println(t.reverse());
	}

}
