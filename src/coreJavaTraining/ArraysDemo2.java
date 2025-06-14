package coreJavaTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysDemo2 {
	
	//Count even and odd numbers in array
	public void evenOdd() {
		int[] a = {7, 8, 10, 4, 14, 3, 2};
		int even = 0;
		int odd = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2==0) {
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.printf("Count of Even Numbers: %d%n", even);
		System.out.printf("Count of Odd Numbers: %d%n", odd);
	}
	
	//Difference between max and min values
	public void diffMinMax() {
		int[] a = {7, 8, 10, 4, 14, 3, 2};
		int min = a[0];
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		int diff = max - min;
		System.out.printf("Difference between Max & Min is: %d%n", diff);
	}
	
	//Average excluding max and min
	public void avgExMinMax() {
		float[] a = {7, 8, 10, 4, 14, 3, 2, 11, 12};
		float min = a[0];
		float max = a[0];
		float sum = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
			sum = sum + a[i];
		}
		float MaxMin = max + min;
		float exMinMaxSum = sum - MaxMin;
		float avg = (exMinMaxSum/(a.length-2));
		System.out.printf("Average Excluding Max & Min of the Array is: %.1f%n", avg);
	}
	
	//Check if array excludes 0 and -1
	public void natualNumberCheck() {
		int[] a = {7, -1, 10, 4, 14, 3, 0, 11, 12};
		boolean containsZeroOrMinusOne = false;
		for(int i = 0; i< a.length; i++) {
			if(a[i] == 0 || a[i] == -1) {
				containsZeroOrMinusOne = true;
			}
		}
		if(!containsZeroOrMinusOne) {
			System.out.println("Array does not contain 0 or -1");
		}
		else {
			System.out.println("Array does contain 0 or -1");
		}
	}
	
	//Check if total of 10s equals 30
	public void sumEqual30() {
		int[] a = {11, 77, 10, 54, -11, 10};
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] == 10) {
				sum = sum + a[i];
			}
		}
		if(sum == 30) {
			System.out.printf("The total sum of 10s in the Array is: %d%n", sum);
		}
		else {
			System.out.printf("The total sum of 10s in the Array is: %d%n", sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysDemo2 ad = new ArraysDemo2();
//		ad.evenOdd();
//		ad.diffMinMax();
//		ad.avgExMinMax();
//		ad.natualNumberCheck();
		ad.sumEqual30();

	}

}
