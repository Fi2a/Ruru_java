package study0210;

import java.util.Scanner;

public class JavaArray1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 변수 :	 값을 저장하기 위한 메모리 공간
		
		// 배열 :	 같은 데이터 타입의 연속적인 메모리 공간
		//		 다른말로 -> 변수공간 여러개를 연속적으로 사용
		
		// 자바 배열 선언 방법
		int[] arr = new int[5]; // 5개 공간으로 이루어진 배열 선언
		int[] arr2 = new int[] {1,20,50,15}; // 4개 공간 배열 선언
		
		// 배열 공간 변경 불가능
		
		// 자바 배열 사용법
		
		arr[2] = 20; // 3번째 공간에 20 저장
		arr[0] = 10;
		arr[1] = 30;
		arr[3] = 40;
		arr[4] = 60;
	
		// 배열의 각각의 공간을 표현하려면 인덱스로 표현해야한다.
		// 인덱스는 0부터 시작한다.
		// 그래서 반복문의 초기값은 0으로 지정하면 된다.
		// 반복문의 조건식은 배열인덱스의 마지막 까지 표현 될 수 있게 하면 된다.
		// 배열의 크기(공간갯수)가 8이라면 마지막 인덱스는 7
		// 조건식은 i<=7 하면 된다.		
		for(int i = 0; i<=3; i++) {
			System.out.println(arr2[i]);
		}
		
		int [] apple = new int[10];
		// 참조변수를 사용하려면 배열인 경우 인덱스를, 객체인경우는 .접근연산자 를
		
		// 배열에 데이터 입력
		for (int i = 0; i <= 9; i++	) {
			System.out.print("숫자 입력 : " );
			apple[i] = sc.nextInt();
		}
		// ==		
		for (int i = 0; i < apple.length; i++	) { // apple.length 는 배열의 크기 (공간갯수)
			System.out.print("숫자 입력 : " );
			apple[i] = sc.nextInt();
		}
		
		
	}

}
