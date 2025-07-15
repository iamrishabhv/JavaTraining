package ExceptionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class DuplicateIntExceptions extends Exception{
	public DuplicateIntExceptions(String message) {
		super(message);
	}
}

public class DuplicateIntegersExceptions {
	
	/*Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.*/
	
	public static Scanner sc = new Scanner(System.in);
	public static int[] arr = new int[5];
	
	public static void getData() throws DuplicateIntExceptions {
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					throw new DuplicateIntExceptions("Duplicate Integer Found at Position: " + i + "," + j);
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i = 0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
				}
			getData();
			System.out.println("User Input Integers are: " + Arrays.toString(arr));
		}
		catch(DuplicateIntExceptions e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
