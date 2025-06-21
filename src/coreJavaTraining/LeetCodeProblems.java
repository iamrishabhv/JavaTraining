package coreJavaTraining;

public class LeetCodeProblems {
	
	public boolean Palindrome(int x) {
		String y = Integer.toString(x);
		char c = 0;
		String z = "";
		for(int i = y.length()-1; i>=0 ; i--) {
			c = y.charAt(i);
			z = z + c;
		}
		if(y.contentEquals(z)) {
			System.out.println("true");
			return true;
		}else {
			System.out.println("false");
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeetCodeProblems lp = new LeetCodeProblems();
		lp.Palindrome(123456);
//		lp.Roman();

	}

}
