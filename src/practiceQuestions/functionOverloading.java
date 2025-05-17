package practiceQuestions;

public class functionOverloading {
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionOverloading fO = new functionOverloading();
		fO.getData(2);
		fO.getData("Hello");
	}

}
