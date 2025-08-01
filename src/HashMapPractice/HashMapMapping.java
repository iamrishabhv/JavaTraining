package HashMapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMapping {
	
	/*Write a Java program to associate the specified value with the specified key in a HashMap.*/
	
	public void getKeyValue() {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> HM = new HashMap<String,Integer>();
		System.out.println("Enter the number of entries: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n; i++) {
			System.out.println("Enter the name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
			sc.nextLine();
			
			HM.put(name, age);
		}
		System.out.println("Entries in HashMap are: ");
		for(String key : HM.keySet()) {
			System.out.println("Name: " + key + " ," + "Age: " + HM.get(key));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapMapping HMM = new HashMapMapping();
		HMM.getKeyValue();

	}

}
