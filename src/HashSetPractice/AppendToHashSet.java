package HashSetPractice;

import java.util.HashSet;

public class AppendToHashSet {
	
	/*Write a Java program to append the specified element to the end of a hash set.*/
	
	public void AppendToSet(int num) {
		HashSet<Integer> HS = new HashSet<Integer>();
		HS.add(num);
		HS.add(45);
		HS.add(76);
		HS.add(24);
		System.out.println("Elements Present in HashSet are: " + HS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppendToHashSet AS = new AppendToHashSet();
		AS.AppendToSet(56);

	}

}
