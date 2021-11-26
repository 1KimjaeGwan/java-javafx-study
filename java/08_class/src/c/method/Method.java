package c.method;
// 객체의 동작-기능들을 정의
public class Method {
//	반환형 메소드이름(매개변수들...){실행문들..}
	void methodA() {
		System.out.println("반환하는 값은 없고 기능만 수행");
	}
	
	int methodB(){
		System.out.println("int type의 +값을 반환");
		return 0;
		//System.out.println("aaaaa");
	}
	
	double methodC(int x, int y) {
		return x / y;
	}
	
	String methodD(char a, char b, char c) {
		return a+":"+b+":"+c;
		
	}
	
	public static void main(String[] args) {
		Method m1 = new Method();
		// int a = m1.methodA(); //오류
		int result = m1.methodB();
		System.out.println(result);
		//Stirng s = 0;
		//String s = m1.methodB();
		double r = m1.methodC(10, 30);
		System.out.println(r);
		
		String s = m1.methodD('심', '현', '석');
		System.out.println(s);
	}

}
