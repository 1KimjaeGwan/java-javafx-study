package d.phone;

public class IPhone extends Phone{
	String url;

	
	// alt + s + a
	public IPhone(String model, String color, String url) {
		super(model, color);
		this.url = url;
	}
}
