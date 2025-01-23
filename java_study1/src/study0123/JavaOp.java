package study0123;

import java.util.Scanner;

public class JavaOp {

	public static void main(String[] args) {
		//	조건연산자
		//	(조건식) ? 참일경우 실행 내용 : 거짓일 경우 실행 내용
		Scanner scan = new Scanner(System.in);
//	
//		System.out.println( (9 > 5) ? "5보다 크다 ": "5보다 작다" );
//		
//		String result = (9 > 5) ? "5보다 크다 ": "5보다 작다" ;
//		System.out.println(result);
//		
//		
//		int age = 16;
//		System.out.println((age <19) ? 1000 : 1500);
//		
//		int price = (age <19) ? 1000 : 1500;
//		System.out.printf("나이 : %d살 , 버스요금 : %d원 \n",age,price);
//		
//		
//		System.out.print("첫번째 숫자 : ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자 : ");
//		int num2 = scan.nextInt();
//		
//		int res = ( num1 > num2 ) ? num1 : num2 ;
//		// 조건식이 참이라면 res = num1 수행
//		// 조건식이 거짓이라면 res = num2 수행
//		
//		System.out.println("두숫자 중 큰 숫자는 : " + res);
//		
//		// 두 숫자를 입력받아서 두 수가 같으면 같다 , 같지않다 출력
//		System.out.print("첫번째 숫자 : ");
//		num1 = scan.nextInt();
//		System.out.print("두번째 숫자 : ");
//		num2 = scan.nextInt();
//		String res1 = (num1==num2) ? "같다" : "같지 않다";
//		System.out.println(res1);
	
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		//입력한 정수가 양수냐 음수냐
//		String res = (num > 0) ? "양수" : (num == 0) ? "0이다" : "음수" ;
//		System.out.println(res);
		
		// 바이킹을 타기 위해서는 키가 135 이상이여야 한다.
		// 바이킹 탑승여부를 출력하세요.
		
//		System.out.print("키 : ");
//		int tall = scan.nextInt();
//		
//		String res = (tall >= 135) ? "탑승 가능" : "탑승 불가능";
//		System.out.println(res);
		
//		System.out.print("1. 파미향짬봉 2. 쿠켄 돈가스 3. 공주순대 : ");
//		int select = scan.nextInt();
//		int price = (select == 1) ? 9000 : 0;
//		price = (select == 2) ? 8000 : price;
//		price = (select == 3) ? 6500 : price;
//		
//		System.out.println(price);
		
		// 정수 세개를 키보드를 통해 입력받기
		// 세 정수 중에서 가장 큰 정수를 출력하세요
		// 두개가 같은 경우, 세개가 같은 경우는 배제
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = scan.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		max = (max > num3) ? max : num3;
		
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

//	사칙연산자 : +, - , *, /, %
//	복합대입뎐산자 : +=, -=, *=, /=, %= 
//	예) a = a + 123;  -> a += 123;
//	증감연산자 : ++, --
//	비교연산자 : 비교연산자를 통해 조건식을 만든다. 조건식은 참 또는 거짓의 결과
//			  ==, ===, !=, !==
//	논리연산자 : && (and), || (or), ! (not)
//	논리연산자 는 참이나 거짓을 가지고 연산한다.
//	예) a > 6 && b < 4 && b >0 || c > 10

