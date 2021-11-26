package c.return_type;

interface MyInterface{
	int method(int x , int y , String s);
}

public class RamdaReturnExam {

	public static void main(String[] args) {
		MyInterface i = new MyInterface() {
			@Override
			public int method(int x, int y, String s) {
				System.out.println(s);
				return x * y;
			}
		};
		
		int result = i.method(10, 5, "곱셈연산");
		System.out.println("result : " + result);
		
		i = (a,b,s)->{
			System.out.println(s);
			return a + b;
		};
		result = i.method(10, 20, "덧셈연산");
		System.out.println("result : " + result);
		
		
		/*
		Thread t = new Thread(()->{
				
		});
		*/
		
		
		
	}
}
