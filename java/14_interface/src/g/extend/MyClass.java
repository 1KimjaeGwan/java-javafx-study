package g.extend;

public class MyClass implements C{

	@Override
	public void printA() {
	}

	@Override
	public void printB() {
	}

	@Override
	public void printC() {
	}
	
	public static void main(String[] args) {
		A a = new A() {
			@Override
			public void printA() {
				System.out.println("기능~!");
			}
		};
		
		A a1 = new Aclass();
		a1.printA();
		
	}

	
	
	
}
	