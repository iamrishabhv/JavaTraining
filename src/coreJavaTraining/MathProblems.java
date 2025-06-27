package coreJavaTraining;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathProblems {
	
	public static final Scanner sc = new Scanner(System.in);
	
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
	
	//Tag Content Extractor
	public void TagContentExtractor() {
		String line = "qqoNVOmJDG@6IBDZoEmk9337LswEL&TQnLCuR`04XD%1t{G)Jmi_iNEXKwp&<iBKMbDGtF4v@coLsF1_LqgTJ3cSp& 3a~I&Q(j0h_w~Vk(oBZCL#vhYY9%c><wkjkTvAuA8Zk}n_l7Si\"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>bMUGux)5n7L={M}e^`0xlSm5ce}ehiE}CJ6y0KPd~~B~ak5$PTdPGv}QnXpw6n9V8wVCVaTRTgLKkeF</wkjkTvAuA8Zk}n_l7Si\"-pfm`M8YE3F}4`YQyChgC3uRbyTvu>haZQKlWPxlRqXXkKHo=FDofc6$_S-GWA&m0zT*D~uorf_nAF^ym*U&6hGAI)s<XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><FbTSC#F104{py9Xl6s{yi-R~}k5Fv4i1kCgmBY7P=vVj-j48xUg8x9BCxl~Y><lyxRRMqnMBGj1_d7Qqh5Ebn7 aMb{Q0Dm){9~I0DTS8BZ7+bui~)rQ\"2Yb4f>EeZWvJvHIk</XshvNhnnNbeVDuxRcQAgTpWZ-kqIps-@@}Uwq0J3Z06Y5mZgB9><BkkZV631Pnj}#%TWhZn@Y><kXjDpTvLA^tnXYb`h+cA J2";
//		String line = in.nextLine();
		Pattern pattern = Pattern.compile("<([a-zA-Z0-9_@#%\\-^~+=:.`\\\"'\\\\{}()$!&* ]+)[^>]*>(.*?)</\\1>",Pattern.DOTALL);
		Matcher matcher = pattern.matcher(line);
                        // System.out.println(matcher.group(1));
		boolean found  = false;
		while(matcher.find()){
			String Content = matcher.group(2).trim();
			if(!Content.isEmpty()){
				System.out.println(Content);
				found = true;
				}
			}
		if(!found){
			System.out.println("None");
			}
		}
	
	//SHA Hash Function
    
    public void hashFunction() throws NoSuchAlgorithmException{
//            String s = sc.nextLine();
    	String s = "K1t4fo0V";
        MessageDigest MD = MessageDigest.getInstance("SHA-256");
        byte[] message = MD.digest(s.getBytes(StandardCharsets.UTF_8));
        BigInteger num = new BigInteger(1, message);
        StringBuilder hexString = new StringBuilder(num.toString(16));
        while( hexString.length() < 64) {
        	hexString.insert(0, 0);
        }
        System.out.println(hexString);
    }
    
    //Round Up Integer Division
    public void M1() {
    	int theory = 350;
    	int practical = 90;
    	int total = 500;
    	int marks = ((theory+practical)*100)/total;
    	System.out.println(marks);
    }
    
    //Split Whole and Fractional Parts
    public void M2() {
//    	Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	double fractional_part = a%1;
    	double whole_part = a - fractional_part;
    	System.out.printf("Fractional Part is = %.3f%n", fractional_part);
    	System.out.printf("Whole Part is = %.3f%n", whole_part);
    }
    
    //Check if Double is Integer
    public void M3() {
//    	Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	if(a%1 == 0) {
    		System.out.printf("It's not a double number");
    	}
    	else {
    		System.out.printf("It's a double number");
    	}
    }
    
    //Count Absolute Distinct Values in Array
    public void M4() {
    	int[] a = {-1, -1, 0, 2, 2, 3, 0, 1, 5, 9};
    	int count = 0;
    	for(int i = 0; i<a.length; i++) {
    		boolean isUnique = true;
    		for(int j = 0; j<i; j++) {
    			if(Math.abs(a[i]) == Math.abs(a[j])) {
    				isUnique = false;
    				break;
    			}
    		}
    		if(isUnique) {
				count++;
		}
    	}
    	System.out.println(count);
    }
    
    //Reverse an Integer
    public void M5() {
    	System.out.print("Enter your Number: ");
    	int a = sc.nextInt();
    	String s = Integer.toString(a);
    	char[] c = s.toCharArray();
    	for(int i = c.length-1; i>=0; i--) {
    		System.out.print(c[i]);
    	}    	
    }

	public static void main(String[] args) throws NoSuchAlgorithmException {
		MathProblems MP = new MathProblems();
		MP.P1();
		MP.MyRegex();
		MP.LeaderElement();
		MP.replace();
		MP.shiftChars();
		MP.IntReplace();
		MP.ValidUserNameRegex();
		MP.TagContentExtractor();
		MP.hashFunction();
		MP.M1();
		MP.M2();
		MP.M3();
		MP.M4();
		MP.M5();

	}

}
