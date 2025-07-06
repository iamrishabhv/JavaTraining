package coreJavaTraining;

public class thisDemo {
	
	int a = 2;
	
	public void getData() {
		int a = 3;
		int sum = a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisDemo td = new thisDemo();
		td.getData();
	}

}
