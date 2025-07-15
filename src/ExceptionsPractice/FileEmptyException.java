package ExceptionsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileEmpty extends Exception{
	public FileEmpty(String message) {
		super(message);
	}
}

public class FileEmptyException {
	
	/*Write a Java program that reads a file and throws an exception if the file is empty.*/
	
	public static void CheckFileContents(String filename) throws FileNotFoundException, FileEmpty {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		if(!sc.hasNextLine()) {
			sc.close();
			throw new FileEmpty("File is Empty");
			}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			CheckFileContents("src/Resources/NoContentFile");
			System.out.println("File is not empty");
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(FileEmpty e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
