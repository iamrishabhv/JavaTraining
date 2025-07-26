package HashSetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet2Array {
	
	/*Write a Java program to convert a hash set to an array.*/
	
	public void Hash2Array() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> HS = new HashSet<String>();
		System.out.println("Enter your Elements: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS.add(name);
		}
		String[] text = new String[HS.size()];
		int i = 0;
		for(String ele : HS) {
			text[i] = ele;
			i++;
		}
		System.out.println("Hash Set: " + HS);
		for(String n : text) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet2Array HSA = new HashSet2Array();
		HSA.Hash2Array();

	}

}
