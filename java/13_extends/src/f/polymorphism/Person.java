package f.polymorphism;

public class Person {
	String name;
	int age;
	int weight;
	int height;
	
	public Person() {}
	
	// alt + s / a
	public Person(String name, int age, int weight, int height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// alt + s / s / s
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
