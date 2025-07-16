package coreJavaTraining;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeCertainityTest {
	
	public void CheckPrime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Integer: ");
		int n = sc.nextInt();
		BigInteger num = BigInteger.valueOf(n);
		boolean isPrime = num.isProbablePrime(10);
		if(!isPrime) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeCertainityTest pc = new PrimeCertainityTest();
		pc.CheckPrime();

	}

}
