package coreJavaTraining;

import java.util.Scanner;

public class loopPractice {
	
	//First 10 Natural Numbers Display
	public void naturalNo() {
		for(int i=1; i<=10; i++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
	
	//Sum of First 10 Natural Numbers Display
	public void naturalNoSum() {
		int count = 0;
		System.out.println("The first 10 Natural Number are:");
		for(int i=1; i<=10; i++) {
			System.out.print(i);
			System.out.print(" ");
			count = count+i;
		}
		System.out.print("\n");
		System.out.printf("The Sum is: %d",count);
	}
	
	//Display n Terms of Natural Numbers and Their Sum
	public void nNaturalNo() {
		int count1 = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("\n");
		System.out.println("Test Data:");
		int n = scan.nextInt();
		System.out.printf("The first %d Natural Number are:",n);
		for(int i=1; i<=n; i++) {
			System.out.print(i);
			System.out.print(" ");
			count1 = count1+i;
			}
		System.out.print("\n");
		System.out.printf("The Sum of Natural Number upto %d terms: %d",n,count1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loopPractice nN = new loopPractice();
		loopPractice nNS = new loopPractice();
		loopPractice nNNS = new loopPractice();
		nN.naturalNo();
		nNS.naturalNoSum();
		nNNS.nNaturalNo();

	}

}
