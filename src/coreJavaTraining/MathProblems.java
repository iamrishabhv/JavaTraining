package coreJavaTraining;

import java.util.Arrays;
import java.util.Scanner;

public class MathProblems {
	
	//Round Up Integer Division
	public void P1() {
		int a = 345;
		int b = 2;
		int c = Math.round(a/b);
		System.out.println(c);
	}
	
	public void MyRegex() {
		String IP = "10.91.90.77";
		String myRgex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";
		if(IP.matches(myRgex)) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	//Print all leader elements in array
	public void LeaderElement() {
		int[] arr = {10, 9, 14, 23, 15, 0, 9};
		int size = arr.length;
		for(int i = 0; i<arr.length; i++) {
			int j;
			for(j = i+1; j<arr.length; j++) {
				if(arr[i] <= arr[j]) {
					break;
				}
			}
			if(j == arr.length) {
				System.out.println(arr[i]);
			}
		}
	}
	
	//
	public void replace() {
		int[] arr = {400};	//[18,6,6,6,1,-1]
		int s = arr.length;
		int max = -1;
		for(int i = s-1; i>=0; i--) {
			int current = arr[i];
			arr[i] = max;
			if(current > max) {
				max = current;
				}
			}
		System.out.println(Arrays.toString(arr));
	}
	
	public void shiftChars() {
		String s = "a1c1e1";
		char[] c = s.toCharArray();
		for(int i = 0; i<c.length; i++) {
			if(i%2 != 0) {
				char ch = c[i];
				int num = ch - '0';
				char pos = s.charAt(i-1);
				pos = (char) (pos+num);
				c[i] = pos;
			}
		}
		System.out.println(c);
	}
	
	//
	public void IntReplace() {
		long n = 2147483647;
        long count = 0;
        while(n != 1){
            if(n%2==0){
                n = n/2;
            }else {
            	if(n == 3 || ((n-1)%4) == 0) {
            		n = n-1;
            	}
            	else {
            		n = n+1;
            	}
            }
            count++;
        }
        System.out.println(count);
	}
	
	//
	public void ValidUserNameRegex() {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		String MyRegex = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
		int l = s.length();
		System.out.println(l);
//		while(n != 0) {
//			String s = sc.nextLine();
			
			if(s.matches(MyRegex)){
				System.out.println("Valid");
				}
			else {
				System.out.println("Invalid");
				}
//			n--;
//			}
		}
	
//	//Tag Content Extractor
//	public void TagContentExtractor() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathProblems MP = new MathProblems();
		MP.P1();
		MP.MyRegex();
		MP.LeaderElement();
		MP.replace();
		MP.shiftChars();
		MP.IntReplace();
		MP.ValidUserNameRegex();

	}

}
