package inner2;

public class MainMt {

	public static void main(String[] args) {
		
		LocalClass lc = new LocalClass();
		
		lc.getBirth();
		// 지역 내부클래스는 해당 메서드를 호출해야 사용가능
		
		Item item = new Item();
		item.sale();
		
		Item shoes = new Item() {
			@Override
			public void sale() {
				System.out.println("신발 판매");
			}
		}; // 익명 클래스 정의와 객체 생성 (오버라이딩)
		// Item 클래스가 부모클래스		
		shoes.sale();
		Item shoes1 = new Item() {
			@Override
			public void sale() {
				make();
				System.out.println("신발 판매");
			}			
			
			public void make() { // 익명클래스에서 메서드 만들면 내부에서만 사용가능
				System.out.println("신발 만들기");
			}
		}; // 익명클래스 정의와 객체 생성
		shoes1.sale();
//		shoes1.make(); // 외부에선 사용 불가
		
		Animal dog = new Animal() {
			@Override
			public void eat() {
				System.out.println("댕댕냠냠");
			}
		}; // 인터페이스를 implements 한 익명클래스 정의와 객체
		
		dog.eat();
		
		
		
		
	}
}
@FunctionalInterface
interface Animal { // Animal 인터페이스 정의
	public void eat(); // 추상메서드
}




