package f.polymorphism;

public class PersonExample {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(bank.toString());
		
		Person person = new Person("최기근", 26, 70, 184);
		System.out.println(person.toString());
		System.out.println("=======================");
		System.out.println(bank);
		System.out.println(person);
		Bank badBank = null;
		System.out.println(badBank);
		
		Person s = new Student("이순신", 500, 90, 185, "3반", "45번", "2");
		System.out.println(s);
		// s.study();
		
		Person t = new Teacher("최기근", 26, 70, 184, "ESD-84", "체육", "2");
		System.out.println(t);
		//t.teach();
		Teacher t1 = (Teacher)t;
		t1.teach();
		
		Teacher t2 = null;
		if(s instanceof Teacher) {
			System.out.println("Teacher Type");
			t2 = (Teacher)s;
			t2.teach();
		}else {
			System.out.println("Teacher Type이 아닙니다.");
		}
	}
}
