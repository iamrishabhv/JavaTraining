package HashSetPractice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class LessThan7 {
	
	/*Write a Java program to find numbers less than 7 in a tree set.*/
	
	public void FindElements() {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> TS = new TreeSet<>();
		System.out.println("Enter your Elements: ");
		while(true) {
			String input = sc.nextLine();
			if(input.trim().isEmpty()) break;
			
			try {
				int num = Integer.parseInt(input);
				TS.add(num);
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid Number, Try Again!");
			}
		}
		System.out.println("Numbers less than 7 are: " + TS.headSet(7));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LessThan7 lt7 = new LessThan7();
		lt7.FindElements();

	}

}


/*
 * Input/Output Tested:
 * Enter your Elements: 
1
5
7
12
4
2
7
8
9
6
5
3

Numbers less than 7 are: [1, 2, 3, 4, 5, 6]*/
