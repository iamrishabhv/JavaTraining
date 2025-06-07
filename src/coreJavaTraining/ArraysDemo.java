package coreJavaTraining;

import java.util.Arrays;

public class ArraysDemo {
	
	public void singleDimensional() {
		int a[] = new int[5];	//This is how an Array is initialized in Java
		a[0] = 1;			//Initialized Values on a index in an Array
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int b[] = {4,5,6,7,8,9};	//This is another way of defining the array in which the memory is allocated dynamically.		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);		//Prints the values available in Array on a index.
		}
	}
	
	public void multiDimensional() {
		int a[] [] = new int[2] [3];
		a[0] [0] = 2;
		a[0] [1] = 3;
		a[0] [2] = 5;
		a[1] [0] = 4;
		a[1] [1] = 3;
		a[1] [2] = 6;
//		int b[][] = {{2,3,5},{4,3,6}};
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length+1; j++) {
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public void interviewQ1() {
		int abc[] [] = {{2,4,5},{3,4,7},{1,2,9}};
		int min = abc[0][0];
		for(int i = 0; i<abc.length; i++) {
			for(int j = 0; j<abc.length; j++) {
				if(abc[i][j] < min) {
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);		
	}
	
	public void interviewQ2() {
		int abc[] [] = {{14,34,15},{10,41,72},{13,16,6}};
		int max = abc[0][0];
		for(int i = 0; i<abc.length; i++) {
			for(int j = 0; j<abc.length; j++) {
				if(abc[i][j] > max) {
					max = abc[i][j];
				}
			}
		}
		System.out.println(max);		
	}
	
	public void interviewQ3() {
		int abc[] [] = {{14,34,15},{10,41,72},{13,16,6}};
		int min = abc[0][0];
		int mincolumn = 0;
		for(int i = 0; i<abc.length; i++) {
			for(int j = 0; j<abc.length; j++) {
				if(abc[i][j] < min) {
					min = abc[i][j];
					mincolumn = j;
				}
			}
		}
		
		int k = 0;
		int max = abc[0][mincolumn];
		while(k<3) {
			if(abc[k][mincolumn] > max) {
				max = abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}
	
	//Find duplicates in integer array
	public void interviewQ4() {
		int a[] = {5,3,1,3,4,2};
		int dup = a[0];
		for(int i = 0; i<a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					dup = a[j];
				}
			}
		}
		System.out.println(dup);
	}
	
	public void InterviewQ5() {
		int a[] = {2,4,1,6,7,8,3};
//		int temp;
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					// Logic with temp variable
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
					
					//Logic without temp varibale
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		
		for(int i = 0; i<a.length; i++) {
		System.out.print(a[i]);
		System.out.print("\t");
		}
}
	
	//Sum all values in an array
	public void PracticeQ1() {
		int a[] = {2,4,1,6,7,8,3};
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
	
	//Print a 10x10 grid of dashes
	public void PracticeQ2() {
		int a[][] = new int[10][10];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				System.out.print("-");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	//Calculate average of array elements
	public void PracticeQ3() {
		float a[] = {2,4,1,6,7,8,3};
		float sum = 0;
		float avg;
		for(int i = 0; i<a.length; i++) {
			sum = sum+a[i];
		}
		avg = sum/a.length;
		System.out.println(avg);
	}
	
	//Check if array contains a specific value
	public void PracticeQ4() {
		int a[] = {2,4,1,6,7,8,3};
		int b = 6;
		int count = 0;
		for(int i = 0; i<a.length; i++) {
				if(a[i] == b) {
					count = count+1;
				}
		}
		System.out.printf("Value is present %d time(s) in the array", count);
	}
	
	//Find index of an element in array
	public void PracticeQ5() {
		int[] a = {2,4,1,6,7,8,3};
		int b = 7;
		for(int i = 0; i<a.length; i++) {
			if(a[i] == b) {
				System.out.println(i);
			}
			else {
				i = i+1;
			}
		}
	}
	
	//Remove specific element from array
	public void PracticeQ6() {
		int[] a = {2,4,1,6,7,8,3};
		int index = 1;
		for(int i = index; i<a.length-1; i++) {
			a[i] = a[i+1];			//Wrong Logic
		}
		System.out.println(Arrays.toString(a));
	}
	
	//Copy array using iteration
	public void PracticeQ7() {
		int[] a = {2,4,1,6,7,8,3};
//		int[] b = Arrays.copyOf(a, a.length); 			//Method 2
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
	
	//Replace an element at a specific position
	public void PracticeQ8() {
		int[] a = {2,4,1,6,7,8,3};
		int b = 2;
		int c = 9;
		for(int i = b; i< b+1; i++) {
			a[i] = c;
		}
		System.out.println(Arrays.toString(a));
	}
	
	//Find max and min in an array
	public void PracticeQ9() {
		int[] a = {2,4,1,6,7,8,3,12,56,97};
		int max = a[0];
		int min = a[0];
		for (int i = 0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.printf("Min Value in the Array: %d%n",min);
		System.out.printf("Max Value in the Array: %d%n",max);
	}
	
	//Reverse an integer array
	public void PracticeQ10() {
		int[] a = {2,4,1,6,7,8,3,12,56,97};
		int[] b = new int[10];
		int n = 0;
		for(int i = a.length-1; i>=0 ; i--) {
			b[n] = a[i];
			n++;
			}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		}
	
	//Find duplicates in string array
	public void dupStringArray() {
		String[] a = {"Car","Bike","Cycle","Truck","Bike"};
		String b = a[0];
		for(int i = 0; i<a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
			if(a[i] == a[j]) {
				b = a[j];
			}
		}
	}
		System.out.println(b);
}
	
	//Common elements in two integer arrays
	public void commonIntElements() {
		int[] a = {3, 7, 8, 12, 15};
		int[] b = {5, 8, 14, 20, 3};
		int n = 0;
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					c[n] = a[i];
					n++;
				}
			}
		}
		System.out.printf("Common Elements: " + Arrays.toString(Arrays.copyOf(c, n)));
	}
	
	//Common elements in two integer arrays
	public void commonStringElements() {
		String[] array1 = {"apple", "banana", "cherry", "mango", "peach"};
		String[] array2 = {"grape", "melon", "apple", "kiwi", "cherry"};
		int count = 0;
		String[] array3 = new String[array1.length];
		for(int i = 0; i<array1.length; i++) {
			for(int j = 0; j<array2.length; j++) {
				if(array1[i].equalsIgnoreCase(array2[j])) {
					array3[count] = array1[i];
					count++;
				}
			}
		}
		System.out.printf("Common Elements: " + Arrays.toString(Arrays.copyOf(array3, count)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysDemo sd = new ArraysDemo();
//		sd.singleDimensional();
//		sd.multiDimensional();
//		sd.interviewQ1();
//		sd.interviewQ2();
//		sd.interviewQ3();
//		sd.interviewQ4();
//		sd.InterviewQ5();
//		sd.PracticeQ1();
//		sd.PracticeQ2();
//		sd.PracticeQ3();
//		sd.PracticeQ4();
//		sd.PracticeQ5();
//		sd.PracticeQ6();
//		sd.PracticeQ7();
//		sd.PracticeQ8();
//		sd.PracticeQ9();
//		sd.PracticeQ10();
//		sd.dupStringArray();
//		sd.commonIntElements();
		sd.commonStringElements();
		
	}
}