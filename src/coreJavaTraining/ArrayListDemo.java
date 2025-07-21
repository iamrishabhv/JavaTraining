package coreJavaTraining;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> A = new ArrayList<String>();
		A.add("Rishabh");		//add method can be used to add to the ArrayList
		A.add("Java");
		System.out.println(A);
		A.add(0, "Student");	//this is another example of add method in which index can be provided as argument to add the specified String on a provided index.
		System.out.println(A);
		/*Below are the methods that can be used to remove and manipulate the existing list either by providing index or object
		A.remove(0);
		A.remove("Java");
		System.out.println(A);*/
		System.out.println(A.contains("Rishabh"));	//To check if a given object is present in the Array List or not. It return true or false.
		System.out.println(A.indexOf("Java"));		//to get the index of the provided object
		System.out.println(A.isEmpty());			//to check if the ArrayList is empty or not. It returns true or false.

	}

}
