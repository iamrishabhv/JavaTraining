package coreJavaTraining;

public class Firstclass {
	
	static int a = 45;
	
	//Methods
	public void getData() {
		System.out.println("I am in a Method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firstclass fn = new Firstclass();
		secondClass sc = new secondClass();
		fn.getData();		//Objects being called from First Class
		sc.setData();		//Objects being called from Second Class
		System.out.println(fn.a);	
		System.out.println(a);
		System.out.println("Hi");
		System.out.println("Hello World!");
		//desrcffsg

	}

}
