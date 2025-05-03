package coreJavaTraining;

import java.util.Scanner;

public class changingChars {
	
	//Using String Literal Method
	public void charChange() {
		String a = "Rishabh";
		System.out.println(a.replace("h", "L"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changingChars cc = new changingChars();
		Scanner s = new Scanner(System.in);
		StringBuilder t = new StringBuilder(s.nextLine());
		System.out.println(t.replace(2, 4, "LL"));
		cc.charChange();

	}

}
