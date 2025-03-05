package exception1;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
		// 예외처리 - 코드실행에 있어서 예외적인 부분을 처리하기 위한 방법
		// 예외적 상황이 발생하는것은 올바른 실행이 이루어 지지 않아서
		// 오류 또는 에러가 발생한다.
		// 자바에서 예외처리는 오류에 대한 처리다.
		// 예외처리는 오류를 해결하는 방법이 아닌 회피하는 방법
		
		int a = 10 ;
		Scanner sc = new Scanner(System.in);
		
		try { // 오류가 예상되는 코드를 try { } 안에 작성
			System.out.print("a 변수 입력 : ");
			a = sc.nextInt();
			System.out.println("나누기 전"); // 오류 발생 전의 코드는 실행됨
			System.out.println( a / 2 );
			System.out.println("나누기 후 ");
		} catch(ArithmeticException e) {
			System.out.println("0 나누기 ㄴㄴ");
		} catch(Exception e) {
			System.out.println("정수 입력하셈");
		}
		// try 구문에서 오류가 발생하면 catch 구문이 실행
		// catch 구문이 실행되려면 발생한 오류를 처리할 수 있는 클래스를 가지고 있어야한다.
		System.out.println("프로그램 종료");
		
			
		
		
			
		

	}

}
