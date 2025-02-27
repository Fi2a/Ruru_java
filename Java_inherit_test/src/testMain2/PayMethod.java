package testMain2;

public abstract class PayMethod {
	protected int amount;
	protected String payDate;
	
	protected PayMethod() {}
	protected PayMethod(int a, String p) {
		this.amount = a;
		this.payDate = p;
	}
	
	public abstract void processPay();
	

}
