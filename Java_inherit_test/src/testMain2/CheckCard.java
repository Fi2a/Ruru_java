package testMain2;

public class CheckCard extends PayMethod{ // 체크카드

	public CheckCard(int a, String p) {
		super(a,p);
	}
	
	@Override
	public void processPay() {
		System.out.println(
				"체크카드결제 금액 : " + super.amount +
				" 결제일 : " + super.payDate
				);
		
	}
}
