package study;

public class JavaMain {

	public static void main(String[] args) {
		
		
		// 데이터 저장 - 변수
		// 같은 타입인 많은 양의 데이터 - 배열
		
		// 이름 , 나이 , 직업 , 몸무게 , 시력 , 생년월일
		// 100명의 데이터를 저장하기 위해서는 서로 다른 종류의 데이터이기에
		// 100의 크기인 1차원 배열 6개를 만들어야 한다.
		
		
//		struct member { // 구조체 - member 타입
//			String name;
//			int age;
//		}
//		member info; // member 타입의 변수 info
//		info.name = "머시기";
//		info.age = 24;
//		member[] mem = new member[100]; // member 타입의 mem 이라는 1차원 배열
		

//		기본데이터 타입으로 선언한 변수는 데이터 저장이 직접 가능
//		int, char, float 등
//		배열 또는 클래스 타입으로 선언한 변수는 참조변수이다.
//		참조변수에는 메모리주소를 저장한다.
//		그래서 자바에서는 new 연산자를 통해서 공간을 할당받아 그 공간의 주소에 저장한다.
		
		Member info = new Member();
		info.name = "김유신";
		info.age = 29;
		info.eyes = 1.5f;
		System.out.println(info.name);
		
		
		Member my = new Member(); // 인스턴스 생성 ( 객체 생성 )
		my.name = "박문수";
		my.age = 25;
		System.out.println(my.age);
		
		// 동물 종류 , 동물 이름 , 나이
		// 동물 종류에는 개, 고양이, 닭, 토끼, 코끼리 등등
		// 동물이름은 볼트 , 렉스 , 웅이, 꼬끼오, 총총이 등등
		// 나이는 하고싶은거 아무거나
		
		Animal animal = new Animal();
		animal.type = "개";
		animal.name = "여름이";
		animal.age = 11;
		System.out.println(animal.name);
		System.out.println(animal.type);
		System.out.println(animal.age);
		
		
		
	}
}

class Animal {
	String type;
	String name;
	int age;
}



class Member  {  // 클래스 정의 - 클래스 안의 내용으로 데이터 저장이 될 수 있게 만든다고 정의만 한 것.
	String name; // 이름 저장
	int age;	 // 나이 저장
	float eyes;  // 시력 저장
}




// 클래스 - 데이터 저장, 기능구현




// 클래스 - 사용자 정의 데이터 타입
// class 클래스이름 {	} 
// 클래스이름의 첫글자는 대문자로

// 프로그래밍 명명 규칙 (name rule)
// 1. 카멜 표기법
//	- 첫문자를 제외하고 단어의 첫글자를 대문자로 표현
// 예) myVisitorCount
//	  함수, 인스턴스, 객체, 변수 

// 2. 스네이크 표기법
//	- 모든 단어 사이에 _ 를 붙여서 이름 짓기
// 예) my_visitor_count
//    데이터베이스 의 테이블명, 컬럼명

// 3. 파스칼 표기법
//	- 카멜 표기법과 유사하지만 첫문자 부터 대문자로 표기
// 예) MyVisitorCount
//	  객체지향 언어의 클래스나 constructor 명

// 4. 케밥 표기법
//	- 카멜표기법과 달리 소문자로 표현하며 다넝아 단어사이에 - 붙이기
// 예) my-visitor-count
//    css 의 class 명, web url








