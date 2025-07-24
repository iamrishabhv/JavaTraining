package HashSetPractice;

import java.util.HashSet;
import java.util.Scanner;

public class ClearHashSet {
	
	/*Write a Java program to empty an hash set.*/
	
	public void emptyHashSet() {
		HashSet<String> HS = new HashSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Elements: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS.add(name);
		}
		
		System.out.println("Elements in Hash Set are: " + HS);
		System.out.println("Do you want to all remove elements from HashSet? (Y/N)");
		String answer = sc.nextLine();
		if(answer.equalsIgnoreCase("Y")){
			HS.clear();
			System.out.println("Elements in Hash Set after clearing: " + HS);
		}
		else {
			System.out.println("All elements in HashSet are Intact");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClearHashSet cHS = new ClearHashSet();
		cHS.emptyHashSet();

	}

}
