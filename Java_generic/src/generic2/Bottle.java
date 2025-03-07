package generic2;

public class Bottle< T extends Alcohol > { // 제네릭 타입 을 사용하는 클래스
	T item;
	
	public void make(T item) {
		this.item = item;
		System.out.println( item + " 만들기");
	}
	
	public T getItem() {
		return this.item;
	}
	
	
}

// 제네릭 타입의 제한
// T extends 부모클래스명	->	부모와 자식 클래스만 가능
// T super 클래스명		->	해당 클래스와 클래스의 부모만 가능

//	?  -> 와일드카드
// <?> == 아무 타입이든 가능 
// <? extends 부모클래스명> == 부무와 자식 타입만 가능 