package study0131;

import java.util.Scanner;

public class JavaIf2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
//	 입력한 숫자가 짝수인지 홀수인지
//	int num = 0;
//	
//	System.out.print("숫자 입력 : ");
//	num = scan.nextInt();
//	
//	if (num%2 == 0) {
//		System.out.println("짝수");
//	} else {
//		System.out.println("홀수");
//	}
	
	
//		int num = 15;
//		if(num > 0) {
//			System.out.println("양수이다.");
//		} else if(num < 0) {
//			System.out.println("음수이다.");
//		} else {
//			System.out.println("0 이다.");
//		}
		
		
//		int score = 81; // 100 ~ 90 은 A , 89 ~ 80 은 B , 79 ~ 70 은 C , 나머지는 F
//		
//		if (score >=90 && score <= 100) {
//			System.out.println("A");
//		} else if(score >=80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
		
//		1 입력하면 데이터 저장 이라고 출력
//		2 입력하면 데이터 삭제 이라고 출력
//		3 입력하면 종료 라고 출력
//		1,2,3 이 아닌 숫자는 잘못입력했습니다. 라고 출력
		
		int num = 0 ;
		
		System.out.print("숫자 입력 : "  );
		num = scan.nextInt();
		
		if (num == 1) {
			System.out.println("데이터 저장");
		}else if(num == 2) {
			System.out.println("데이터 삭제");
		}else if(num == 3) {
			System.out.println("종료");
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
/*
 	
 	
    
 */
