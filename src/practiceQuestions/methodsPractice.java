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
	
	//Display First 50 Pentagonal Numbers
	public void pentagonalNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Terms: ");
		int n = sc.nextInt();
		int a = 1;
		for(int i = 1; i<=n; i++) {
			int Pn = a*(3*a-1)/2;
			System.out.print(Pn + "\t");
			a++;
			}
	}
	
	//Print Characters Between Two Characters
	public void charPrint() {
		char c = 40;
		for(int i=1; i<=126; i++) {
			System.out.print(c + "\t");
			c++;
		}
	}
	
	//Check Leap Year
	public void checkLeapYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int y = sc.nextInt();
		if((y%4==0 && y%100!=0) || y%400==0) {
				System.out.println("This is a Leap Year");
			}
			else {
				System.out.println("This is NOT a Leap Year");
			}
		}
	
	//Validate Password
	public void validatePassword() {
		System.out.println("A password must have at least eight characters.");
		System.out.println("A password consists of only letters and digits.");
		System.out.println("A password must contain at least two digits");
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Password (You are agreeing to the above Terms and Conditions.): ");
		String a = sc.nextLine();
		if(a.length() >= 10 && a.matches("[a-zA-Z0-9]+")) {
			int digitCount = 0;
			for(int i=0; i<a.length(); i++) {
				if(Character.isDigit(a.charAt(i))) {
					digitCount++;
				}
			}
			
		if(digitCount >=2) {
				System.out.printf("Password is Valid: %s",a);
			}
		}
		else {
			System.out.printf("Password is Invalid: %s",a);
	}
	}
	
	//Display n-by-n Matrix (Identity Matrix)
	public void nMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsPractice sN = new methodsPractice();
		methodsPractice aN = new methodsPractice();
		methodsPractice mS = new methodsPractice();
		methodsPractice cI = new methodsPractice();
		methodsPractice Pn = new methodsPractice();
		methodsPractice cP = new methodsPractice();
		methodsPractice cLY = new methodsPractice();
		methodsPractice vP = new methodsPractice();
		methodsPractice nM = new methodsPractice();
		sN.smallNumber();
		aN.avgNumber();
		System.out.printf("The middle character in the string: " + middleString());
		cI.compoundInvest();
		Pn.pentagonalNumber();
		cP.charPrint();
		cLY.checkLeapYear();
		vP.validatePassword();
		nM.nMatrix();
	}

}
