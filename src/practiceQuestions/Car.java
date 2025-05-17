package practiceQuestions;

public class Car extends Vehicle{
	
	public void drive() {
		System.out.println("Repairing a car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		Car c = new Car();
		v.drive();
		c.drive();
	}

}
