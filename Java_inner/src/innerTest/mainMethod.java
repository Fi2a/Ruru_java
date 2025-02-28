package innerTest;

public class mainMethod {

	public static void main(String[] args) {
		
		Tire tire = new Tire();
		tire.setInch( 18 );
		
		Car car = new Car( tire ) ;
		
		System.out.println( car.getTire().getInch() );
		
	}

}

// 상속 관계와 포함관계
//  사람	  개발자 == 상속
//	과일   오렌지 == 상속
//  자전거  체인 == 포함
