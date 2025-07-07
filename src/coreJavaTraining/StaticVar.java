package coreJavaTraining;

public class StaticVar {
	
	String name;		//Instance Variables
	String address;
	static String city = "New Delhi";		//Class Variable
	
	StaticVar(String name, String address){
		this.name = name;
		this.address = address;
		this.city = city;
	}
	
	public void getAddress() {
		System.out.println(name + " " + address + " " + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv = new StaticVar("Rishabh","Chattarpur");
		sv.getAddress();

	}

}
