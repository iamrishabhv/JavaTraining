package coreJavaTraining;

import java.util.Scanner;

public class JavaSubArray {
	
	public void getCount() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements in the array: ");
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for(int m = 0; m<arr.length; m++) {
			int sum = 0;
			for(int p = m; p<arr.length; p++) {
				sum = sum + arr[p];
				if(sum < 0) {
					System.out.println("(" + arr[m] + "," + arr[p] + ")");
					count++;
				}
			}
		}
		System.out.println("Total Negative Sub Arrays are: " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaSubArray JS = new JavaSubArray();
		JS.getCount();

	}

}
