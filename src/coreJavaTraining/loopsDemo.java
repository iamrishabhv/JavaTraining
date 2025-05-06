package coreJavaTraining;

public class loopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for Loop - Print 0 to 10 Numbers
		int a = 1;
		for (int i=0; i<a; i++) {
			System.out.println("I am in a For Loop");
		}
		
		//While Loop - Print 0 to 10 Numbers
		int b = 1;
		int i = 0;
		while(i<b){
			System.out.println("I am in a While Loop");
			i++;
		}
		
		//Do While Loop
		int c = 1;
		int j = 4;
		do {
			System.out.println("I am in a Do-While Loop");
		}
		while(j<c);
		
		//Nested Loops
		
		for(int d=1; d<=4; d++) {
			
			for(int e=1; e<=4; e++) {
				System.out.println("I am in the Inner For Loop");
			}
			
			System.out.println("I am in the Outer For Loop");
		}
		
	}

}
