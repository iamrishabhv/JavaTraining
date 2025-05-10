package practiceQuestions;

import java.util.Scanner;

public class methodsPractice {
	
	//Find Smallest Number Among Three
	public void smallNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number: ");
		int c = sc.nextInt();
		if(a<b && a<c) {
			System.out.printf("The smallest value is: %d", a);
			}
		else if(b<a && b<c) {
			System.out.printf("The smallest value is: %d", b);
		}
		else {
			System.out.printf("The smallest value is: %d", c);
		}
		}
	
	//Compute Average of Three Numbers
	public void avgNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number: ");
		int c = sc.nextInt();
		int avg = (a+b+c)/3;
		System.out.printf("The average value is: %d", avg);
	}
	
	//Find Middle Character(s) of String
	public static String middleString() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String a = sc.nextLine();
		int pos;
		int len;
		if(a.length()%2==0) {
			pos = a.length()/2-1;
			len = 2;
		}
		else {
			pos = a.length()/2;
			len = 1;
		}
		return a.substring(pos, pos + len);
	}
	
	//Compute Future Investment Value
	public void compoundInvest() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Investment Amount: ");
		double a = sc.nextInt();
		System.out.print("Enter rate of interest: ");
		double b = sc.nextInt();
		System.out.print("Enter number of years: ");
		double c = sc.nextInt();
		b = b*0.01;
		int n = 12;
		for(int i = 1; i<=c; i++) {
		double A = a* Math.pow(1 + b/n, n*i);
		System.out.printf("Future Value for Year %d: %.2f%n", i, A);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsPractice sN = new methodsPractice();
		methodsPractice aN = new methodsPractice();
		methodsPractice mS = new methodsPractice();
		methodsPractice cI = new methodsPractice();
		sN.smallNumber();
		aN.avgNumber();
		System.out.printf("The middle character in the string: " + middleString());
		cI.compoundInvest();
	}

}
