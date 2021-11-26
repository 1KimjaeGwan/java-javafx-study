
public class Car {

	int speed;
	int gear;
	String color;
	
	void speedUp() {
		speed+=10;
	}
	
	void speedDown() {
		speed-=10;
	}
	
	String showInfo() {
		return "Car[color=" + color+", speed="+speed+", gear="+gear+"]";
	}
		
	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
		// 호출 시 speed field의 값 10 증가
		myCar.speedUp();
		myCar.gear = 2;
		System.out.println(myCar.showInfo());
		// 호출 시 speed field의 값 10 감소
		myCar.speedDown();
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
	}

}
