package c.method;

public class MethodOverloading {

	public void mehtodA() {
		System.out.println("methodA 호출");
	}
	
	public void methodA(int a) {
		System.out.println("methodA 호출 : "+a);
	}
	
	public void methodA(double a) {
		System.out.println("methodA 호출 : "+a);
	}
	
	public void methodA(int a, int b) {
		System.out.println("methodA 호출 : "+a+"b : "+b);
	}
	
	public void methodA(int a, double b) {
		System.out.println("methodA 호출 : "+a+"b : "+b);
	}
	
	public void methodA(double a, int b) {
		System.out.println("methodA 호출 : "+a+"b : "+b);
	}
	
	String methodB(char a, char b, char c) {
		return a+":"+b+":"+c;
	}
	void methodf(String s, int a, double... d) {}
	
	String methodB(char... a) {
		String result = null;
		for(int i = 0; i<a.length; i++) {
			result += a[i]+":";
		}
		return result;
	};
	
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		String result = m1.methodB('최', '기', '근');
		System.out.println(result);
		result = m1.methodB('A');
		System.out.println(result);
		result = m1.methodB('A','B');
		System.out.println(result);
		result = m1.methodB('A','B','C','D','E');
		System.out.println(result);
		
	}

}
