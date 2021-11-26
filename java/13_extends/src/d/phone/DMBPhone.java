package d.phone;

public class DMBPhone extends Phone {
	
	int channel;
	
	public DMBPhone() {
		super();
	}
	
	public DMBPhone(String model, String color, int channel) {
		super(model,color);
		/*
		super.model = model;
		super.color = color;
		*/
		this.channel = channel;
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널이 : "+this.channel+"로 변경 되었습니다.");
	}
	
	void turnOnDMB() {
		System.out.println("DMB를 켭니다.");
	}
	
	void turnOffDMB() {
		System.out.println("DMB를 끕니다.");
	}
}
