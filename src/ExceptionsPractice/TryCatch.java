package ExceptionsPractice;

public class TryCatch {
	
	/*Write a Java program that throws an exception and catch it using a try-catch block.*/
	
	public static int divideNumbers(int dividend, int divisor) {
		if(divisor == 0) {
			throw new ArithmeticException("Cannot divide number by Zero");
		}
		return dividend/divisor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divideNumbers(8,0);
			System.out.println("Result: " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
