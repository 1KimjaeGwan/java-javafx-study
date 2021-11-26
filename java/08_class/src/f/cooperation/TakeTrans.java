package f.cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Bus bus100 = new Bus(100);
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		subwayGreen.showInfo();
		
		Student studentSim = new Student("sim",5000);
		Student studentChoi = new Student("choi",10000);
		
		studentSim.takeBus(bus100);
		studentChoi.takeSubway(subwayGreen);
		
		bus100.showInfo();
		studentSim.showInfo();
		
		subwayGreen.showInfo();
		studentChoi.showInfo();
	}
}
