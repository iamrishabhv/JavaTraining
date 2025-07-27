package HashSetPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class HashSet2TreeSet {
	
	/*Write a Java program to convert a hash set to a tree set.*/
	
	public void Hash2Tree() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> HS = new HashSet<>();
		System.out.println("Enter your Elements: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS.add(name);
		}
		TreeSet<String> TS = new TreeSet<>(HS);
		System.out.println("Hash Set: " + HS);
		System.out.println("Tree Set: " + TS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet2TreeSet H2T = new HashSet2TreeSet();
		H2T.Hash2Tree();

	}

}
