package e.protected1.b;

import e.protected1.a.*;

public class D extends A//B
{
	A a1 = new A();
	D(){
		// a1.a = 100;
		super.a = 100;
		// a1.methodA();
		// 부모의 methodA()
		super.methodA();
		// 자기자신의 오버라이딩된 methodA()
		methodA();
		// 자기자신의 오버라이딩된 methodA()
		this.methodA();
		
		super.methodB();
	}
	
	// final 키워드가 붙어있는 부모 메소드는
	// 자식 객체에서 재정의 불가
	// protected void methodB() {}
	
	
	@Override
	protected void methodA() {
		System.out.println("D class의 methodA");
	}
	
	public static void main(String[] args) {
		new D();
	}
}
