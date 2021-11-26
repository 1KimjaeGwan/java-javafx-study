package d.phone;

public class AndoridPhone extends DMBPhone{
	String url;
	
	// alt + s + a
	public AndoridPhone(String model, String color, int channel, String url) {
		super(model, color, channel);
		this.url = url;
	}

	@Override
	void sendVoice(String message) {
		super.sendVoice(message);
	}

	@Override
	void receiveVoice(String message) {
		super.receiveVoice(message);
	}
	
	
}
