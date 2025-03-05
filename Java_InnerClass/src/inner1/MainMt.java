package inner1;

public class MainMt {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.innerView();		//	내부클래스가 노출안됨
		t.setNum(10);		//	내부클래스가 노출안됨
		
		t.a.num = 10; 		//  내부클래스가 노출됨
		
		t.setYear(100);
		
		// 정적 내부클래스를 노출하면서 객체 만들기
		Test.Dog dof = new Test.Dog();
		
		Test.origin(); // 클래스 메서드 실행은 객체없이 가능하다.
		

	}

}
