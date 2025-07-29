package HashSetPractice;

import java.util.HashSet;
import java.util.Scanner;

public class SaveCommonElements {
	
	/*Write a Java program to compare two sets and retain elements that are the same.*/
	
	public void RetainCommonElements() {
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
		HS1.retainAll(HS2);
		System.out.println("Retained Common Elements are: " + HS1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaveCommonElements SCE = new SaveCommonElements();
		SCE.RetainCommonElements();

	}

}
