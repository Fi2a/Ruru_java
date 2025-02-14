package study0214;

public class JavaString3 {

	public static void main(String[] args) {
		
//		String str = "member"; // String str = new String("member");
//		System.out.println( str.charAt(0) );
		
		String str = new String("member");
		char[] c = {'a'};
		
		String[] names = new String[5];
		names[0] = new String("박문수");
		names[1] = "김정호";
		names[2] = "서경림";
		names[3] = "김명준";
		names[4] = "이정훈";
	
		for(int a = 0 ; a < names.length; a++) {
			System.out.println(names[a]);
		}
		
//		boolean hasName = false;
//		for( String name : names) {
//			if( name.equals("김미란"))
//				hasName = true;
//		}
//		if(hasName) System.out.println("이름 등록 됨");
//		else System.out.println("등록 되지 않은 이름");		
	
		
		
		
		
		
		
	}
}
// 참조변수 : 특정 공간의 메모리주소만 저장할 수 있는 변수
// 참조변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수
//		배열의 주소를 가지고 있는 참조변수는  참조변수이름[인덱스]  방식으로 사용
//		객체의 주소를 가지는 참조변수는  참조변수이름.xxxx  방식으로 사용