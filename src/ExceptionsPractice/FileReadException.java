package ExceptionsPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadException {
	
	/*Write a Java program to create a method that reads a file and throws an exception if the file is not found.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("/coreJavaTraining/src/Resources/file.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException F) {
			System.out.println("File not found: " + F.getMessage());
		}

	}

}
