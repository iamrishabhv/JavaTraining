package coreJavaTraining;

public class childDemo extends parentDemo{
	
	String name = "Technical Lead QA";
	
	public childDemo() {
		super(); //Implicit call to Parent Class. If we don't specify super(), Java will automatically call the Parent Constructor.
		System.out.println("This is a Constructor in Child Class");
	}
	
	public void getData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getStringData() {
		super.getStringData();
		System.out.println("This is a Method in Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childDemo cd = new childDemo();
		cd.getData();
		cd.getStringData();

	}

}
