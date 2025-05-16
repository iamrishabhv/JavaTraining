package practiceQuestions;

import java.util.Arrays;
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
	
	//Calculate Triangle Area
	public void areaTriangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of 1st Side: ");
		float s1 = sc.nextFloat();
		System.out.println("Enter the length of 2nd Side: ");
		float s2 = sc.nextFloat();
		System.out.println("Enter the length of 3rd Side: ");
		float s3 = sc.nextFloat();
		if(s1+s2 > s3 && s2+s3 > s1 && s1+s3 > s2) {
			float s = (s1 + s2 + s3)/2;							//Formula for Calculating Semi-Parameter of a Triangle
			double A = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));		//Formula for Calculating the Area of a Triangle
			System.out.printf("The area of the triangle is %f", A);
		}
		else {
			System.out.printf("The given sides do not form a valid triangle.");
		}
	}
	
	//Prime Number Check
	public static boolean isPrime(int num) {
		if(num <= 1)
			return false;
		if(num == 2)
			return true;
		if(num % 2 == 0)
			return false;
		for(int i=3; i<=Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
	
	public void checkPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = sc.nextInt();
		if(isPrime(num)) {
			System.out.println(num + " is a Prime Number");
		}
		else {
			System.out.println(num + " is not a Prime Number");
		}
	}
	
	//Count Occurrences of Digit '2' in Integer
	public void checkDigit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		  String a = sc.nextLine();
		  int digitCount = 0;
		  for (int i = 0; i < a.length(); i++) {
		    if (a.charAt(i) == '2') {
		      digitCount++;
		    }
		  }
		  if (digitCount > 0) {
		    System.out.printf("The no. of Digit 2 in the given Number are: %d",digitCount);
		  } else {
		    System.out.println("There are no Digit 2 in the given Number");
		  }
		}
	
	//Check Consecutive Integers
	public void checkConsecutiveInts(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Integer: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Integer: ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd Integer: ");
		int c = sc.nextInt();
		if(b-a == 1 && c-b == 1) {
			System.out.println("Consecutive Integers");
		}
		else {
			System.out.println("Not Consecutive Integers");
		}
	}
	
	//Check If One Integer is Midpoint of Others
	public void midPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Integer: ");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd Integer: ");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd Integer: ");
		int c = sc.nextInt();
		
		int[] num = {a,b,c};
		Arrays.sort(num);
		if((num[1] - num[0]) == (num[2] - num[1])) {
			System.out.printf("Mid-Point: %d",num[1]);
		}
		else {
			System.out.printf("There is no Mid-Point");
		}
	}
	
	//Extract First Digit of Integer
	public void firstDigit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer(positive/negative): ");
		String a = sc.nextLine();
		char b = a.charAt(0);
		System.out.printf("Extract the first digit from the said integer: %c", b);
	}
	
	//Display Factors of 3 in Integer
	public void factor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer: ");
		int n = sc.nextInt();
		int result = n;
		while(result % 3 == 0) {
			System.out.print("3 * ");
			result = result / 3;
		}
		System.out.print(result);
	}
	
	//Check If All Digits in Integer Are Even
	public static boolean evenInts(int num) {
		String a = Integer.toString(Math.abs(num));
		for(int i = 0; i < a.length(); i++) {
			int digit = a.charAt(i) - '0';
			if(digit % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	
	public void evenInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int a = sc.nextInt();
		if(evenInts(a)) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
	}
	
	//Check If All Characters Are Vowels
	public void checkVowels() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be Checked: ");
		String a = sc.nextLine();
		String b = a.toLowerCase();
		for(int i = 0; i < b.length(); i++) {
			char ch = b.charAt(i);
			if("aeiou".indexOf(ch) == -1) {
				System.out.println("False");
				return;
			}
		}
		System.out.println("True");
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
		methodsPractice aT = new methodsPractice();
		methodsPractice iP = new methodsPractice();
		methodsPractice cD = new methodsPractice();
		methodsPractice cCI = new methodsPractice();
		methodsPractice mP = new methodsPractice();
		methodsPractice fD = new methodsPractice();
		methodsPractice f = new methodsPractice();
		methodsPractice eI = new methodsPractice();
		methodsPractice cV = new methodsPractice();
		sN.smallNumber();
		aN.avgNumber();
		System.out.printf("The middle character in the string: " + middleString());
		cI.compoundInvest();
		Pn.pentagonalNumber();
		cP.charPrint();
		cLY.checkLeapYear();
		vP.validatePassword();
		nM.nMatrix();
		aT.areaTriangle();
		iP.checkPrime();
		cD.checkDigit();
		cCI.checkConsecutiveInts();
		mP.midPoint();
		fD.firstDigit();
		f.factor();
		eI.evenInteger();
		cV.checkVowels();
	}

}
