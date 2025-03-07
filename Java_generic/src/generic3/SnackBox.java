package generic3;

public class SnackBox<T extends Snack> {
	
	T snack;
	
	public void makeBox(T snack) {
		
		System.out.println(snack + " 박스 만들기");
		
	}
	
	
}
