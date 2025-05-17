package practiceQuestions;

public class childClass extends parentClass{
	
	public void color() {
		System.out.println(color);
	}
	
	public void audioSystem() {
		System.out.println("Child Audio System");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass cd = new childClass();
		cd.color();
		cd.breakes();			
		cd.audioSystem();	//it will call the method from Child Class only

	}
}