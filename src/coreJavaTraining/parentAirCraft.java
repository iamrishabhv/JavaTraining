package coreJavaTraining;

public abstract class parentAirCraft {
	
	public void engine() {					//Non-Abstracted Method
		System.out.println("Follow Engine Guidelines");
	}
	
	public void safety() {					//Non-Abstracted Method
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void bodyColor();		//Abstracted Method

}