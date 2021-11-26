package f.polymorphism.method;

public class RunVehicle {
	
	void runVehicle(Vehicle vehicle) {
		vehicle.run();
	}
	
	void runBus(Bus bus) {
		bus.run();
	}
	
	void runTexi(Texi texi) {
		texi.run();
	}
	
	public static void main(String[] args) {
		RunVehicle rv = new RunVehicle();
		Bus bus = new Bus();
		rv.runBus(bus);
		
		Texi texi = new Texi();
		rv.runTexi(texi);
		
		rv.runVehicle(texi);
		rv.runVehicle(bus);
		Motorcycle mc = new Motorcycle();
		rv.runVehicle(mc);
	}

}

class Motorcycle extends Vehicle{
	public void run() {
		System.out.println("오토바이가 두 바퀴로 달립니다.");
	}
}