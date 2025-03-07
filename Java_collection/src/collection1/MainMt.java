package collection1;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		
		// 배열에 정수를 추가로 저장할 수 있게 하기.
		
		MyArray a = new MyArray(); 
		a.add(100);
		a.add(20);
		a.add(52);
		a.add(60);
		
		System.out.println(a.arr[0]);
		System.out.println(a.arr[1]);
		
		System.out.println( a.get(3) );
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(1234);
		list.add("고구마");
		list.add("감자");
		list.add(3.114);
		
		System.out.println( list.size() ); // 크기 - 배열에 데이터 저장된 갯수
		
		System.out.println( list.get(2) ); // 인덱스 위치 출력
		
		System.out.println( list.indexOf("포카칩")  ); // 배열에 특정데이터 ㅇㄷ?
		
		list.remove(0); // 인덱스를 지정하여 해당 데이터 삭제
		list.remove("포카칩"); // 삭제 할 데이터 입력하여 삭제
		System.out.println( list );
		
	}	
	
}


/*
 		자바 컬렉션 프레임워크
 		자료구조와 알고리즘을 클래스화 시켜놓은것
 		자료구조 - 데이터를 저장관리하는 방법
 		알고리즘 - 저장된 데이터를 가공하는방법
 		
 		Collection					Map
 			List						HashMap
 				ArrayList				TreeMap 				
 				LinkedList				Properties
 				Vector
 				Stack
 				Queue
 			Set
 				HashSet
 				TreeSet
 
*/
