package coreJavaTraining;

public class pyramidPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pyramid Print -  Ascending Order
		int l = 1;
		for (int m=0; m<4; m++) {
			for(int n=4; n>=4-m; n--) {
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
		System.out.println();
		}
		
		//Pyramid Printing - Descending Order
		int k = 1;
		for(int i=0; i<4; i++) {

			for(int j=1; j<=4-i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
	}

}
