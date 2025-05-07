package coreJavaTraining;

import java.util.Scanner;

public class stringDemo {
	
	//Write a Java program to create a distinct identifier for a given string.
	public void distinctIdentifier() {
		Scanner sc = new Scanner(System.in);
		String d = sc.nextLine();
		System.out.println(d.hashCode());
	}
	
	//Write a Java program to get the index of all the characters of the alphabet.
	public void alphaChars() {
		String str = "The quick brown fox jumps over the lazy dog.";
		
		int a = str.indexOf("a", 0);
        int b = str.indexOf("b", 0);
        int c = str.indexOf("c", 0);
        int d = str.indexOf("d", 0);
        int e = str.indexOf("e", 0);
        int f = str.indexOf("f", 0);
        int g = str.indexOf("g", 0);
        int h = str.indexOf("h", 0);
        int i = str.indexOf("i", 0);
        int j = str.indexOf("j", 0);
        int k = str.indexOf("k", 0);
        int l = str.indexOf("l", 0);
        int m = str.indexOf("m", 0);
        int n = str.indexOf("n", 0);
        int o = str.indexOf("o", 0);
        int p = str.indexOf("p", 0);
        int q = str.indexOf("q", 0);
        int r = str.indexOf("r", 0);
        int s = str.indexOf("s", 0);
        int t = str.indexOf("t", 0);
        int u = str.indexOf("u", 0);
        int v = str.indexOf("v", 0);
        int w = str.indexOf("w", 0);
        int x = str.indexOf("x", 0);
        int y = str.indexOf("y", 0);
        int z = str.indexOf("z", 0);

        // Display the results of all the indexOf method calls.
        System.out.println(" a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.println(a + " " + b + " " + c + " " + d + " " +
                           e + " " + f + " " + g + " " + h + " " +
                           i + " " + j + "\n");

        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.println(k + " " + l + " " + m + " " + n + " " +
                           o + " " + p + " " + q + " " + r + " " +
                           s + " " + t + "\n");

        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.println(u + " " + v + " " + w + " " + x + " " +
                           y + " " + z);
		
		}
	
	public void strDemo(){
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringDemo sd = new stringDemo();
		stringDemo ac = new stringDemo();
		stringDemo se = new stringDemo();
		sd.distinctIdentifier();
		ac.alphaChars();
		se.strDemo();
	}

}
