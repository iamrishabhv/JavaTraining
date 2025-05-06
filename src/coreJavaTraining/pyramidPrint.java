package coreJavaTraining;

public class pyramidPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pyramid Print -  Ascending Order
		int l = 1;
		for (int m=0; m<5; m++) {			// for (int m=1; m<5; m++)
			for(int n=4; n>=5-m; n--) {		//Another logic: for(int n=1; n<=m; n++)
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
		System.out.println();
		}
		
		//Pyramid Printing - Descending Order
		int k = 1;
		for(int i=0; i<5; i++) {

			for(int j=1; j<=5-i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		
		//Pyramid Printing
		for(int s=1; s<=4; s++) {
			for(int t=1; t<=s; t++) {
				System.out.print(t);
				System.out.print("\t");	
			}
			System.out.println();
		}
		
		//Pyramid Printing - Multiples of 3
		int u = 3;
		int count = u;
		for(int s=1; s<=4; s++) {
			for(int t=1; t<=s; t++) {
				System.out.print(count);
				System.out.print("\t");
				count  = count + u;
			}
			System.out.println();
		}
	}

}
