package HashSetPractice;

import java.util.HashSet;
import java.util.Scanner;

public class GetHashSize {
	
	/*Write a Java program to get the number of elements in a hash set.*/
	
	public void getHashSetSize() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> HS = new HashSet<>();
		System.out.println("Enter your elements: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS.add(name);
		}
		System.out.println("HashSet: " + HS);
		System.out.println("Size of the HashSet is: " + HS.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetHashSize gHS = new GetHashSize();
		gHS.getHashSetSize();

	}

}
