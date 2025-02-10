package study0205;

import java.util.Scanner;

public class JavaLoop2 {
//	자바의 변수 종류
//	지역변수 , 클래스변수 (static) , 인스턴스변수
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
//		int a = 1;			
//		for(int i=2; i<=9; ) {
//			System.out.printf("%d * %d = %d \n",i , a , a*i);
//			a++;
//			if(a==10) {
//				i++;
//				a=1;
//			}
//		}
		
		
		
//		for(int a=2; a<=9; a++) {				
//			for(int i=1; i<=9; i++) {
//				System.out.printf("%d * %d = %d \n",a , i , a*i);
//			}		
//		}		
		
		
		for (int i=1; i <= 5; i++) {
			System.out.println("변수 i 사용 반복문" + i);
			for(int k = 1; k <=3; k++) {
				System.out.println("   변수 k 사용" + k);
			}
		}		
		
		
//		int num = 0;
//		for( ; num!=100; ) { // num 이 100 되기전까지 무한루프
//			System.out.print("정수 입력 : ");
//			num = scan.nextInt();
//		}
//		
//		while(true) {
//			
//		}		
		
		
//		for ( ; ; ) { // for 문 무한 루프
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		if(num == 0) return; // 무한 루프의 종료시점 정하기는 if 문과 break, return 으로
//		}
//		break 는 해당 제어문 (반복문, switch) 을 종료시킨다.
//		return 은 매서드를 종료
		
//		System.out.println("무한루프 끝");
	
//		for(int a = 1; true; a++) { // for 문 무한 루프
//			System.out.println(a);
//		}
		
		
		
//		for( 초기값; 조건식; 증감식 ) {
//			반복 할 내용
//		}
//		
//		초기값 -> 조건식 비교 -> 참이라면 {내용} 실행 -> 증감식
//		-> 조건식 비교 -> 참이라면 {내용} 실행 -> 증감식
//		-> 조건식 비교 -> 참이라면 {내용} 실행 -> 증감식
//		-> 조건식 비교 -> 거짓이라면 -> 종료
		
//		int sum = 0;
		
//		for( int a = 1; a <=10; a++) {
//			sum+=a*10;
//		}
		
//		for( int a = 10; a <=100; a+=10) {
//			sum+=a;
//		}
//		
//		System.out.println(sum);
		
		
		
		
		

	}

}
