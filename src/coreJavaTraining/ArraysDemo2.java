package coreJavaTraining;

public class ArraysDemo2 {
	
	//Count even and odd numbers in array
	public void evenOdd() {
		int[] a = {7, 8, 10, 4, 14, 3, 2};
		int even = 0;
		int odd = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2==0) {
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.printf("Count of Even Numbers: %d%n", even);
		System.out.printf("Count of Odd Numbers: %d%n", odd);
	}
	
	//Difference between max and min values
	public void diffMinMax() {
		int[] a = {7, 8, 10, 4, 14, 3, 2};
		int min = a[0];
		int max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		int diff = max - min;
		System.out.printf("Difference between Max & Min is: %d%n", diff);
	}
	
	//Average excluding max and min
	public void avgExMinMax() {
		float[] a = {7, 8, 10, 4, 14, 3, 2, 11, 12};
		float min = a[0];
		float max = a[0];
		float sum = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
			sum = sum + a[i];
		}
		float MaxMin = max + min;
		float exMinMaxSum = sum - MaxMin;
		float avg = (exMinMaxSum/(a.length-2));
		System.out.printf("Average Excluding Max & Min of the Array is: %.1f%n", avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysDemo2 ad = new ArraysDemo2();
//		ad.evenOdd();
//		ad.diffMinMax();
		ad.avgExMinMax();

	}

}
