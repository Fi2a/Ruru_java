package testMain;

public class Square extends Diagram{

	public Square(int w, int h) {
		super(w,h);
	}
	
	@Override
	public void draw() {
//		int size = super.width*
//				super.height;
		System.out.println(
				"밑변 "+super.width+
				"높이 "+super.height+
				"인 사각형을 그린다."
				);
	}
	
}
