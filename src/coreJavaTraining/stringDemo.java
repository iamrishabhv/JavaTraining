package coreJavaTraining;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "Hello";
		String c = a.concat("World");
		System.out.println(c);
		String s = new String("Hello");
		String s1 = new String("Hello");
		
		//StringBuffer and StringBuilder -- These are Mutable classes.
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb); //HelloWorld
		sb.insert(2, "She");
		System.out.println(sb);	//HeShelloWorld
		sb.replace(5, 7, a);
		System.out.println(sb);	//HeSheaaoWorld
		sb.reverse();	//dlroWoaaehSeH
		System.out.println(sb);
		
		//StringBuilder - This is not thread safe i.e., it is non-syncronized. It is faster.
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.reverse();
		System.out.println(sb1);
	}

}
