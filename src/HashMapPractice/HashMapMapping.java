package HashMapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMapping {
	
	public Scanner sc = new Scanner(System.in);
	
	/*Write a Java program to associate the specified value with the specified key in a HashMap.*/
	
	public void getKeyValue() {
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

	/*Write a Java program to count the number of key-value (size) mappings in a map.*/
	
	public void getHashMapSize() {
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
		int size = HM.size();
		System.out.println("Size of HashMap is: " + size);
	}
	
	/*Write a Java program to copy all mappings from the specified map to another map.*/
	
	public void copyMapping() {
		HashMap<String, Integer> HM1 = new HashMap<String, Integer>();
		System.out.println("Enter the number of entries: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n1; i++) {
			System.out.println("Enter the Key: ");
			String key = sc.nextLine();
			
			System.out.println("Enter the Value: ");
			int value = sc.nextInt();
			sc.nextLine();
			
			HM1.put(key, value);
		}
		
		HashMap<String, Integer> HM2 = new HashMap<String, Integer>();
		System.out.println("Enter the number of entries: ");
		int n2 = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n2; i++) {
			System.out.println("Enter the Key: ");
			String key = sc.nextLine();
			
			System.out.println("Enter the Value: ");
			int value = sc.nextInt();
			sc.nextLine();
			
			HM2.put(key, value);
		}
		HM2.putAll(HM1);
		System.out.println(HM2);
	}
	
	/*Write a Java program to remove all mappings from a map.*/
	
	public void removeAllMapping() {
		HashMap<String, Integer> HM = new HashMap<String, Integer>();
		System.out.print("Enter the number of entries: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i<n; i++) {
			String name = sc.nextLine();
			System.out.println("Enter the Key: ");
			String key = sc.nextLine();
			
			System.out.println("Enter the Value: ");
			int value = sc.nextInt();
			sc.nextLine();
			
			HM.put(key, value);
		}
		System.out.println("Current Entries in HashMap are: " + HM);
		System.out.println("Do you want to remove all entries from HashMap? (Y/N)");
		String reply = sc.nextLine();
		if(reply.equalsIgnoreCase("Y")) {
			HM.clear();
			System.out.println("Entries in HashMap are: " + HM);
		}
		else {
			System.out.println("Entries in HashMap are: " + HM);
		}
		
		/*Write a Java program to check whether a map contains key-value mappings (empty) or not.*/
		
		System.out.println("Is the HashMap Empty?");
		if(HM.isEmpty()) {
			System.out.println("HashMap is Empty!");
		}
		else {
			System.out.println("Entries in HashMap are: " + HM);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapMapping HMM = new HashMapMapping();
		HMM.getKeyValue();
		HMM.getHashMapSize();
		HMM.copyMapping();
		HMM.removeAllMapping();

	}

}
