package HashSetPractice;

import java.util.HashSet;
import java.util.Scanner;

public class checkEmptyHash {
	
	/*Write a Java program to test if a hash set is empty or not.*/
	
	public void isHashEmpty() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> HS = new HashSet<String>();
		System.out.println("Enter your Elements: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS.add(name);
		}
		System.out.println("Elements in Hash Set are: " + HS);
		if(HS.isEmpty()){
			System.out.println("Hash Set is Empty!");
		}
		else {
			System.out.println("Hash Set is NOT Empty");
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEmptyHash cHS = new checkEmptyHash();
		cHS.isHashEmpty();

	}

}
