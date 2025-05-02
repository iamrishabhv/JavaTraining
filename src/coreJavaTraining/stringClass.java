package coreJavaTraining;

public class stringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String: It is one of the prebuilt class in Java.
		
		/*
		 * 1. String Literal
		 * 2. By creating object of string class*/
		
		String a = "  Hello! Rishabh How Are You";
		String b = "Hello!";
		String ab = new String("Hello!");
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("r"));
		System.out.println(a.substring(3, 6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("Rishabh"));
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//Split
		String arr[] = a.split("!");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("H", "W"));
	}

}
