package HashSetPractice;

import java.util.HashSet;
import java.util.Scanner;

public class CompareHashSets {
	
	/*Write a Java program to compare two hash set.*/
	
	public void CompareHash() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> HS1 = new HashSet<>();
		HashSet<String> HS2 = new HashSet<>();
		System.out.println("Enter 1st Hash Set: ");
		
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS1.add(name);
		}
		System.out.println("Enter 2nd Hash Set: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS2.add(name);
		}
		
		if(HS1.equals(HS2)) {
			System.out.println("Both sets are EQUAL!");
		}
		else {
			System.out.println("Both sets are NOT equal!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareHashSets CHS = new CompareHashSets();
		CHS.CompareHash();
	}

}
