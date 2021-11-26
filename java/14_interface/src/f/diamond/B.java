package f.diamond;

public interface B {
	
	default void methodA() {
		System.out.println("B method A");
	}
	
	void methodB();
}
