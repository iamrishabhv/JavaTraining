package coreJavaTraining;

public class StaticVar {
	
	String name;		//Instance Variables
	String address;
	static String city;		//Class Variable
	static int i;			//Static Variable
	
	static {							//Static Block
		city = "New Delhi";
		i = 0;
	}
	
	StaticVar(String name, String address){
		this.name = name;
		this.address = address;
		this.city = city;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(name + " " + address + " " + city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv1 = new StaticVar("Rishabh","Chattarpur");
		StaticVar sv2 = new StaticVar("Shivani","Chattarpur");
		sv1.getAddress();
		sv2.getAddress();

	}

}
