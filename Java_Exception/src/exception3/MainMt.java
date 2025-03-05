package exception3;

public class MainMt {

	public static void main(String[] args) {
		
		int[] arr= {10,40,50,20};			
		try {
			System.out.println( arr[5] );			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		String str= "123ab" ;
		try {
			int num = Integer.parseInt(str); // Integer.parseInt 는 문자열 -> 정수 변환
			System.out.println("정수 : " + num);		
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
		String word = "good Bye!!";
		try {
			System.out.println( word.substring( word.indexOf("B") ) );
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println( word.substring( word.indexOf("m") ) );			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
