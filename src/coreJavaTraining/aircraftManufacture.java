package coreJavaTraining;

public class aircraftManufacture extends parentAirCraft{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aircraftManufacture ac = new aircraftManufacture();
		ac.engine();
		ac.safety();
		ac.bodyColor();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Yellow color body");
	}

}
