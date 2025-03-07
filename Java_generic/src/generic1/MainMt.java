package generic1;

public class MainMt {

	public static void main(String[] args) {
		
		Drink<String> d = new Drink<String>();
		d.name = "a";
		d.ml = 25;
		
		d.a("b");
		
		
		Integer m; 	 // int 기본타입의 자바 클래스명
		Character c; // char 기본타입의 자바 클래스명
		
//		위 두개 외엔 앞에 대문자만

		Float f;	 // float 기본타입의 자바 클래스명
		Double db; 	 // double 기본타입의 자바 클래스명
		Byte bt;	 // byte 기본타입의 자바 클래스명
		Short s;	 // short 기본타입의 자바 클래스명
		Long l;		 // long 기본타입의 자바 클래스명
		Boolean bl;	 // boolean 기본타입의 자바 클래스명
		
		
	}

}


/*
 	 generic - 속의, 속명 ( 일반적으로 불리는 이름 )
 	 		 - 클래스 내부에서 사용할 데이터 타입을 외부에서 저장하는 방법
 	   		 - 제네릭 타입으로는 무조건 클래스타입과 인터페이스 두가지만 가능
 	   		 	-> int : Interger 클래스
 */