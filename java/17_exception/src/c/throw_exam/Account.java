package c.throw_exam;

public class Account {

	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			String message 
			= "잔고부족 오류 : "+(money - balance)+"원 모자람";
			throw new BalanceInsufficientException(message);
		}
		balance -= money;
	}
}
