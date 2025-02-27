package testMain2;

public class CreditCard extends PayMethod{ // 신용카드

	public CreditCard(int a, String p) {
		super(a,p);
	}

	@Override
	public void processPay() {
		System.out.println(
				"신용카드결제 금액 : " + super.amount +
				" 결제일 : " + super.payDate
				);
	}
}
