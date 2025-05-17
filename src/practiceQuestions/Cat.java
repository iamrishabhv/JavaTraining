package practiceQuestions;

public class Cat extends Animal{
	
	public void makeSound() {
		System.out.println("The Cat Quarrels.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Cat c = new Cat();
		a.makeSound();
		c.makeSound();
	}

}
