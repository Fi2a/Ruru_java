package generic3;

public class 매운새우깡 extends Snack {

	public 매운새우깡 (String sN, int p) {
		super(sN, p);
	}
	
	@Override
	public String toString() {
		return snackName + ", 가격 : " + price;
	}
	
}
