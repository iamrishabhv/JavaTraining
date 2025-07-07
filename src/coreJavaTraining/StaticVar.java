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
	
	/*Static Methods only contains Static Variables. Non-Static Variables cannot be part of the Static Methods.
	 * As the variable city is a static variable defined above, only it can be part of the static method.*/
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv1 = new StaticVar("Rishabh","Chattarpur");
		StaticVar sv2 = new StaticVar("Shivani","Chattarpur");
		sv1.getAddress();
		sv2.getAddress();			//ObjectName.Non_Static_Method_Name
		/*Static Methods can only be called with Class Name while non-static methods can be called using object names only.
		 * We can only instantiate any static variable using class name. However to instantiate any non-static variable
		 * we have to use the object name only.*/
		StaticVar.getCity();		//ClassName.Static_Method_Name
		StaticVar.city = "Mumbai";	//ClassName.Static_Variable_Name
		sv1.address = "Juhu";		//ObjectName.Non_Static_Variable_Name

	}

}
