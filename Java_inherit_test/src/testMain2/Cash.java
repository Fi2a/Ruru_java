package testMain2;

public class Cash extends PayMethod{ // 현금결제

	public Cash(int a, String p) {
		super(a,p);
	}

	@Override
	public void processPay() {
		System.out.println(
				"현금결제 금액 : " + super.amount +
				" 결제일 : " + super.payDate
				);
	}
}
