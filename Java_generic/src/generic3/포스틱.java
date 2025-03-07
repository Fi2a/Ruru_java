package generic3;

public class 포스틱 extends Snack{

	public 포스틱(String sN, int p) {
		super(sN, p);
	}
	
	@Override
	public String toString() {
		return snackName + ", 가격 : " + price;
	}
	
}
