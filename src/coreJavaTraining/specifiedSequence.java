package coreJavaTraining;

import java.util.Scanner;

public class specifiedSequence {
	
	Scanner a = new Scanner(System.in);
	Scanner b = new Scanner(System.in);
	
	//Method 1: to check if specified chars are present in a given string in the same sequence
	public void specificSequence() {
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
	
	//Method 2: Using String Buffer Class
	public void specificStringBuffer() {
		StringBuffer r = new StringBuffer(a.nextLine());
		StringBuffer p = new StringBuffer(b.nextLine());
		if(r.toString().contentEquals(p.toString())) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	//Program to check whether a given string ends with another string.
	public void endWith() {
		Scanner c = new Scanner(System.in);
		Scanner d = new Scanner(System.in);
		String u = c.nextLine();
		String v = d.nextLine();
		System.out.printf("String 1: %s%n", u);
		System.out.printf("String 2: %s%n", v);
		if(u.endsWith(v)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specifiedSequence se = new specifiedSequence();
		specifiedSequence sd = new specifiedSequence();
		specifiedSequence sf = new specifiedSequence();
		se.specificSequence();
		sd.specificStringBuffer();
		sf.endWith();
	}

}
