package generic2;

public class MainMt {

	public static void main(String[] args) {
		
//		Bottle<String> b1 = new Bottle<String>();
		// Bottle 클래스의 제네릭 타입은 String
		// T item => String item
//		b1.make("레몬소주");
		
		Soju sj = new Soju("참이슬", "진로", 16);
		Wine wn = new Wine("디안느소비뇽", "앙드레뤼통", 12);
		Makgeolli mg =new Makgeolli("공주밤막걸리", "사곡양조원", 6);
		
		Bottle<Soju> 참이슬 = new Bottle<>();
		참이슬.make( sj );

		Bottle<Wine> 소비뇽 = new Bottle<>();
		소비뇽.make( wn );
		
		Bottle<Makgeolli> 밤막걸리= new Bottle<>();
		밤막걸리.make( mg );
		
		Bottle<Alcohol> 소주병 = new Bottle<>();
		소주병.make( sj );
		
//		Bottle<Toy> 티니핑 = new Bottle<>();
//		티니핑.make( new Toy() );
		
		Service 은호 = new Service();
		은호.drink(참이슬);
		
		Service 수영 = new Service();
		수영.drink(밤막걸리);
		
		
		
	}

}

/*
 	제네릭 - 클래스 내부에 사용할 타입을 외부에서 지정하는 방법
 		Member<Admin> a = new Member<>();
 		-> Member 클래스 내부에 Admin 이라는 타입을 사용한다.
 		-> Member 클래스는 class Member<T> 로 정의 되어 있어야한다.
 		-> 클래스내부의 인스턴스 변수나 인스턴스 메서드의
 		   매개변수타입 또는 반환타입을 제네릭 타입으로 표현 가능하다.
 		   
 		Member<Admin> a = new Member<>(); 은 Member 클래스의 객체 생성이다.
 		
 		- 제네릭을 사용하는 클래스인경우 해당 클래스의 참조변수들은
 		  Member<Admin> 까지를 타입으로 인지한다.
 		- 제네릭에서는 상하관계가 없다.
 			( 제네릭 타입으로 부모클래스나 자식클래스를 사용해도 대입 연산 X )
 		- 제네릭을 사용하므로 타입에 대한 예외 상황을 방지 할 수 있다.
 			(컴파일 과정에서 발생할 수 있는 오류 최소화)
 		- 제네릭 사용범위제한은 extends 와 super 이다.
 		- 메서드에만 제네릭 사용 되는 경우 와일드카드(?)를 사용하는게 여러 타입처리 가능
 		- 와일드 카드의 범위 제한은 extends, super 이다.
 		
 
 */

