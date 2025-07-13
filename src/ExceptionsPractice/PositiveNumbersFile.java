package ExceptionsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception{
	public PositiveNumberException(String message) {
	super(message);
}
}

public class PositiveNumbersFile {
	
	/*Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.*/
	
	public static void CheckFileForPositiveNumbers(String filename) throws FileNotFoundException, PositiveNumberException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			int number = Integer.parseInt(sc.nextLine());
			if(number > 0) {
				throw new PositiveNumberException("Positive Number Found: " + number);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CheckFileForPositiveNumbers("src/Resources/numbers.txt");
			System.out.println("All numbers are Non-Positive");
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(PositiveNumberException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
