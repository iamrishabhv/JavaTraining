package HashSetPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class IterateHashSet {
	
	/*Write a Java program to iterate through all elements in a hash list.*/
	
	public void TraverseHashSet() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> HS = new HashSet<String>();
		System.out.print("Enter your Elements: ");
		while(sc.hasNextLine()) {
			String name = sc.nextLine();
			if(name.isEmpty()) break;
			HS.add(name);
		}
		sc.close();
		System.out.println("Elements in HashSet are: " + HS);
		
		Iterator<String> i = HS.iterator();
		for(int j = 0; j<HS.size(); j++) {
			System.out.printf("Element at Index %d in HashSet: %s%n",j,i.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterateHashSet iHS = new IterateHashSet();
		iHS.TraverseHashSet();

	}

}
