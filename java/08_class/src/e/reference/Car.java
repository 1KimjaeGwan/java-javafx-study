package e.reference;

public class Car {
	String company;
	String model;
	
	Engine engine;
	
	//Car(){}
	
	void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}

class Engine{
	int maxSpeed;
	int rpm;
}