package g.abstract1;

public abstract class Animal {
	
	// 분류
	String kind;
	
	public void breath() {
		System.out.println(kind+"가 숨을 쉰다.");
	}
	
	public abstract void sound();
		
	
}
