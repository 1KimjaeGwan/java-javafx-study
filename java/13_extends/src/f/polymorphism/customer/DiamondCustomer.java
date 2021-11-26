package f.polymorphism.customer;

public class DiamondCustomer extends GoldCustomer{
	private int carID;
	
	public DiamondCustomer(int customerID, String customerName, int carID) {
		super(customerID,customerName);
		super.customerGrade = "DIA";
		super.bonusRatio = 0.03;
		super.saleRatio = 0.15;
		this.carID = carID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+" 자동차 번호는 : "+this.carID+"입니다.";
	}
	
	
}
