package inherit1;

public class Tv extends Product { // 자식클래스
	
	public Tv() {
		super(); // 부모클래스의 생성자메서드가 반드시 먼저 실행된다.
				 // super 는 부모클래스의 객체를 의미한다 
		System.out.println("자식클래스생성");
	}
	public Tv(String brand, int price, String name) {
		super(brand, price, name);
//		super.brand = brand ; // 부모클래스가 있는 경우
//		super.price = price ; // this 보단 super 로
//		super.name = name;	  // 붙여주는게 좋다.
	}
	
	// 오버라이딩
	// 상속관계인 경우 혹은 인터페이즈 implements 인 경우에 사용
	// 성립 조건
	// 1. 메서드의 원형은 그대로 유지
	// 2. 내용만 변경한다.
	// 3. 상속 또는 implements 인 경우에만 가능
	
	@Override
	public void power() {
		onOff  = !onOff;
		System.out.println("TV 전원 : " + onOff);
	}
	
	
	
	
	
	
	
//	boolean onOff = false;
//	
//	public void power() {
//		 power 메서드 실행 시 onOff 가 false면 true 로 변경,
//		 true 면 false 로 변경하려면 올바른 코드는? 
//		onOff = !onOff;
//		System.out.println("전원 : " + onOff);
//		
//	}
}
