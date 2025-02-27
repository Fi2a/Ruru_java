package testMain2;

public class Account extends PayMethod{ // 계좌이체

	public Account(int a, String p) {
		super(a,p);
	}

	@Override
	public void processPay() {
		System.out.println(
				"계좌이체 금액 : " + super.amount +
				" 결제일 : " + super.payDate
				);
	}
	
}
