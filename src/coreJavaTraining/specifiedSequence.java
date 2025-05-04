package coreJavaTraining;

import java.util.Scanner;

public class specifiedSequence {
	
	//Method to check if specified chars are present in a given string in the same sequence
	public void specificSequence() {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		String s = a.nextLine();
		String t = b.nextLine();
		System.out.printf("Original String: %s%n", s);
		System.out.printf("Specified sequence of char values: %s%n", t);
		if(s.contains(t)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specifiedSequence se = new specifiedSequence();
		se.specificSequence();
	}

}
