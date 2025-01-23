package study0122;

import java.util.Scanner;

public class JavaOp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	
		System.out.println(10 != 5);
		
//		int num;
//		
//		System.out.print(" 정수 입력 : ");
//		num = scan.nextInt();
//		
//		System.out.println("5보다 큰숫자인가 ? " +  (num > 5 ) );
//		boolean big;
//		big = num >= 10;
//		
//		System.out.println(" 10 이상인가 ? " + big );
//		
//		System.out.println(  10 == 10 ); // 두 숫자가 같다.
//		System.out.println( 10 == 13 );
//		
//		String word = "가나다"; // 문자열을 타입은 String 클래스타입
//		String word2 = new String("가나다");
//		
//		//System.out.println(word == word2);
//		System.out.println( word.equals(word2) );
//		System.out.println( 'a' > 'b');
//		// == 비교연산자는  비교하는 2개의 값이 같은 자료형인지 판별
//		
		
//		놀이동산에 가서 바이킹을 타는데 키가 140 이상만 탈 수 있다
//		int tall;
//		System.out.print("키 : ");
//		tall = scan.nextInt();
//		System.out.println(tall >= 140);
		
//		바이킹 탑승조건 : 키 140 이상 190 이하
//		비교연산자로 만들어진 조건식이 여러개인 경우 논리연산자 사용
		
//		System.out.println(tall >= 140 && tall <=190);
		
//		청소년 버스요금은 1000원이다. ( 청소년은 13세부터 19세 이하 )
//		나이를 입력받아서 청소년이면 false 아니면 true 가 출력 되게 하세요.
		int age = 0; 
		System.out.print("나이 : ");
		age = scan.nextInt();
		System.out.println(age<13 || age>19);
		
//		위에꺼를 반대로 할 때.
		System.out.println( !(age<13 || age>19) );
		
//		조건식 - 비교연산자 와 논리연산자 를 사용하여 만든 식
//		변수 와 변수 로 비교하는 연습을 해야한다.
//		total > count
		
		
		
	}

}
