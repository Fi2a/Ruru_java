package study0204;

import java.util.Scanner;

public class JavaLoop1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		6번 반복하는 반복문을 만들고 싶다.
//		1부터 시작해서 6까지 1씩 증가
		
//		정수 5부터 17까지 출력하는 반보문.
//		for(int i = 5; i <=17; i++) {
//			System.out.println(i);
//		}
		
		
		// 총합 구하기
		int sum = 0;
		
//		for (int num = 1; num <= 10; num++) {
//			
//			sum += num;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
//		두개의 정수를 입력하여 두개의 수 중 작은 숫자부터 큰 숫자까지의 합을 구하세요.
//		예) 1번째 숫자를 21 입력하고 2번째 숫자를 4 입력했다면 4부터 21까지의 합 구하기
		
//		int num1 = 0, num2 = 0;
//		int numH = 0, numL = 0; 
//		System.out.print("두 숫자 입력 : ");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		if(num1<num2) {
//			numH=num2;
//			numL=num1;
//		}else if(num2<num1){
//			numH=num1;
//			numL=num2;
//		};
//		
//		for(int num = numL; num <= numH; num++ ) {
//			sum += num;
//		}
//		System.out.println(sum);
		
//		System.out.print("숫자 입력 : ");
//		int num = scan.nextInt();
//		
//		for(int i = num; i>=1; i--) {
//			System.out.println(i);
//		}
		
		
//		for(int a = 1; a<=9; a++) {
//		System.out.println( 2 + "*" + a + " = " + (2*a) );
////		System.out.printf( "2*%d = %d \n" , a, 2*a );
//		}
		
		int num = 0;
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		for(int a = 1; a<=9; a++) {
			System.out.printf( "%d*%d = %d \n" ,num, a, num*a );
		}
		
		int coin = (int)(Math.random()*2+1);
		

	}

}

// 반복문 - for, while, do ~ while
// 반복 - 횟수를 정하고 반복하는 경우와 정하지 않고 반복하는 경우
// 주로 반복횟수가 정해진 경우에는 for 문
// 반복횟수가 정해지지않은 경우에는 while 문
