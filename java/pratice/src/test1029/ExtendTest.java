package test1029;

class Animal{}

class Cat extends Animal{}

class Tiger extends Animal{}

public class ExtendTest {

	public static void main(String[] args) {
		Animal c = new Cat();
		Animal t = new Tiger();
		
		if(t instanceof Cat) {
			Cat cat = (Cat)t;
			System.out.println("Cat Type입니다.");
			System.out.println(cat);
		}else if(c instanceof Cat){
			Cat cat = (Cat)c;
			System.out.println("Cat Type입니다.");
			System.out.println(cat);
		}else {
			System.out.println("Cat Type이 아닙니다.");
		}
	}

}
