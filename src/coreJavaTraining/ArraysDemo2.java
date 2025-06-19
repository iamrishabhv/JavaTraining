package coreJavaTraining;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	//Separate 0s and 1s in an array of 0s and 1s
	public void move01() {
		int[] a = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		int pos = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] != 1) {
				a[pos] = a[i];
				pos++;
			}
		}
		while(pos < a.length) {
			a[pos] = 1;
			pos++;
		}
		System.out.println(Arrays.toString(a));
	}
	
	//Find smallest and second smallest in an array
	public void smallest2() {
		  int[] a = {4,1,1,2,5,2};
		  Arrays.sort(a);
		  if (a.length < 2) {
		    System.out.printf("Not enough elements to find second smallest");
		  }
		  int min = Integer.MAX_VALUE;
		  int min2 = Integer.MAX_VALUE;
		  for (int i = 0; i < a.length; i++) {
		    if (a[i] < min) {
		      min2 = min;
		      min = a[i];
		    }
		    if (a[i] > min && a[i] < min2) {
		      min2 = a[i];
		    }
		  }
		  
		  if(min2 == Integer.MAX_VALUE) {
			  System.out.printf("No Second Element");
		  }
		  else {
		  System.out.printf("First Smallest Element is: %d%n", min);
		  System.out.printf("Second Smallest Element is: %d%n", min2);
		  }
	}
	
	//Rotate an array clockwise by one position
	public void arrayRotaion() {
		int[] a = {1, 2, 3, 4, 5, 6};
		int d = 1;
		int pos = 0;
		int num= 0;
		while(pos < d) {
			num = a[a.length-1];
			for(int j = a.length-1; j>0; j--) {
				a[j] = a[j-1];
			}
			a[0] = num;
			pos++;
		}
		System.out.println(Arrays.toString(a));
	}
	
	//Separate even and odd numbers in an array
	public void evenOddArray() {
		int[] a = {7, 8, 10, 4, 14, 3, 2};
		int pos = 0;
		int[] b = new int[a.length];
		Arrays.sort(a);
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2==0) {
				b[pos] = a[i];
				pos++;
			}
		}
		for(int i =0; i<a.length; i++) {
			if(a[i]%2 != 0) {
				b[pos] = a[i];
				pos++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
	
	//Find maximum product of two integers in an array
	public void maxProduct() {
		int[] nums = {17, 8, 10, 4, 14, 3, 21};
		int x = 0;
		int y = 0;
		int pro = 0;
		for(int i = 0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if((nums[i] * nums[j] > pro) && (i != j)) {
					x = nums[i];
					y = nums[j];
					pro = x*y;
					}
			}
		}
		System.out.printf("Pair is (%d,%d), Maximum Product: %d", x,y,pro);
	}
	
	//Generate all permutations of a distinct integer array
	public void permutationArray() {
		int[] nums = {1, 2, 3, 4};
		int c = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j< nums.length-1; j++) {
					c = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = c;
					System.out.println(Arrays.toString(nums));
			}
		}
	}
	
	//Program to find the Number of 2's from 1 to 100
	
	public void find2() {
		int count = 0;
		for(int num = 1; num<=100; num++) {
			int OnesDigit = num%10;
			int TensDigit = (num/10)%10;
			int HundredsDigit = (num/100)%10;
			int ThousandsDigit = (num/1000)%10;
			int TenThousandsDigit = (num/10000)%10;
			if(OnesDigit == 2) {
				count++;
			}
			if(TensDigit == 2) {
				count++;
			}
			if(HundredsDigit == 2) {
				count++;
			}
			if(ThousandsDigit == 2) {
				count++;
			}
			if(TenThousandsDigit == 2) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	//Binary Array
	public void binaryArray() {
		int[] a = {0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0};
		int curr_len = 0;
		int max_len = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] == 0) {
				curr_len++;
			}
			else {
				max_len = Math.max(max_len, curr_len);
				curr_len = 0;
			}
		}
		max_len = Math.max(max_len, curr_len);
		System.out.print(max_len);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysDemo2 ad = new ArraysDemo2();
		ad.evenOdd();
		ad.diffMinMax();
		ad.avgExMinMax();
		ad.natualNumberCheck();
		ad.sumEqual30();
		ad.move01();
		ad.smallest2();
		ad.arrayRotaion();
		ad.evenOddArray();
		ad.maxProduct();
		ad.permutationArray();
		ad.find2();
		ad.binaryArray();

	}

}
