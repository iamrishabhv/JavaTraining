package coreJavaTraining;

public class AustralianTraffic implements CentralTrafficInterface,ContinentTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTrafficInterface gG = new AustralianTraffic();
		gG.greenGo();
		gG.redStop();
		gG.yellowWait();
		
		AustralianTraffic at = new AustralianTraffic();
		at.walking();
		
		ContinentTraffic ct = new AustralianTraffic();
		ct.TrainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Implementation");
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Implementation");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol Implementation");
	}
	
	public void walking() {
		System.out.println("Walking Implementation");
	}

}
