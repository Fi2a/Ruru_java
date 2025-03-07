package generic3;

public class MainMt {

	public static void main(String[] args) {

		포스틱 p1 = new 포스틱("포스틱", 1500);
		포스틱 p2 = new 포스틱("포스틱", 3500);
		
		SnackBox<Snack> pBox = new SnackBox<>();
		pBox.makeBox(p1);
		pBox.makeBox(p2);
		
		예감 y1 = new 예감("예감", 2000);
		
		SnackBox<Snack> yBox = new SnackBox<>();
		yBox.makeBox(y1);
		
		매운새우깡 m1 = new 매운새우깡("매운새우깡", 1500);
		매운새우깡 m2 = new 매운새우깡("매운새우깡", 3000);
		
		SnackBox<Snack> mBox = new SnackBox<>();
		
		mBox.makeBox(m1);
		mBox.makeBox(m2);
		
		
		
	}

}
