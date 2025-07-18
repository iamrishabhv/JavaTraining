package coreJavaTraining;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPractice {
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		BigInteger numA = sc.nextBigInteger();
		BigInteger numB = sc.nextBigInteger();
		BigInteger sum = numA.add(numB);
		BigInteger multiply = numA.multiply(numB);
		System.out.println(sum);
		System.out.println(multiply);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigIntegerPractice BI = new BigIntegerPractice();
		BI.getData();

	}

}
