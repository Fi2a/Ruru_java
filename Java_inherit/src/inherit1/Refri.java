package inherit1;

public class Refri extends Product { // 냉장고
	
	@Override
	public void power() { // 추상메서드 구현
		onOff =!onOff;
		System.out.println("냉장고 전원 : " + onOff);
	}
	

}

// 부모클래스가 추상메서드를 가지고 있는 추상클래스라면
// 자식클래스에게 추상메서드 상속시키기 떄문에
// 자식클래스도 추상메서드를 가지고 있는것과 같다.