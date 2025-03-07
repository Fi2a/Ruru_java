package generic3;

public class 예감 extends Snack{
	
	public 예감 (String sN, int p) {
		super(sN, p);
	}
	
	@Override
	public String toString() {
		return snackName + ", 가격 : " + price;
	}
	
}
