package g.abstract1;

public class AnimalTest {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Animal animal = new Cat();
		animal.breath();
		animal.sound();
		
		animal = new Dog();
		animal.breath();
		animal.sound();
		
		// 이름이 없는 클래스(익명클래스)
		Animal tiger = new Animal() {
			@Override
			public void sound() {
				System.out.println("냐옹 어흥");
			}
			
		};
		
		tiger.kind = "호랑이";
		tiger.breath();
		tiger.sound();
		
		
		
	}
}
