package coreJavaTraining;

public class ExceptionsDemo {
	
	int a = 10;
	int b = 8;
	int c = 0;
	int[] arr = new int[5];
	
	public void getData() {
		try {
			int remainder = b/c;
			System.out.println(remainder);
			System.out.println(arr[7]);
			}
		catch(ArithmeticException ae) {
			System.out.println("This is Arithmetic Exception");
			}
		catch(ArrayIndexOutOfBoundsException ie) {
			System.out.println("This is Array Index Out Of Bounds Exception");
		}
		catch(Exception e) {
		System.out.println("This is the General Exception Block");
		}
		finally {
			System.out.println("This blocks executes regardless of the exception");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionsDemo ED = new ExceptionsDemo();
		ED.getData();

	}

}
