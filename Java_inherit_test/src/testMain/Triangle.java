package testMain;

public class Triangle extends Diagram{

	public Triangle(int w, int h) {
		super(w,h);
	}
	
	@Override
	public void draw() {
//		int size = super.width*super.height/2;
		System.out.println(
				"밑변 "+ super.width +
				"높이 " + super.height +
				"인 삼각형을 그린다."
				);
	}
	
}
