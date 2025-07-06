package coreJavaTraining;

public class constructDemo {
	
	public constructDemo() {
		//This is a Default Constructor
		System.out.println("This is a Default Constructor");
	}
	
	public constructDemo(int a, int b) {
		//This is a Parameterized Constructor
		System.out.println("This is a Parameterized Constructor");
	}
	
	public void getData() {
		System.out.println("This is a Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructDemo cd1 = new constructDemo();	//Object is Initialized --> This will check the Default Constructor
		constructDemo cd2 = new constructDemo(3,4);	//This will check the Parameterized Constructor

	}

}
