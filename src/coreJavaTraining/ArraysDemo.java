package coreJavaTraining;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysDemo sd = new ArraysDemo();
//		sd.singleDimensional();
//		sd.multiDimensional();
		sd.interviewQ1();
		
		
	}
}