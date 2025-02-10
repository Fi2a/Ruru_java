package study0210;

import java.util.Scanner;

public class JavaArray2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int[] a = new int[7];
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("숫자 입력 : ");
//			a[i] = sc.nextInt();
//			
//			System.out.println(a[i]);
//		}
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.printf("%d ",a[i]);
//		}
		
//		final int size = 5 ;
//		
//		int[] age = new int[size];
//		// 정적 배열은 지정된 크기를 변경 하기 어렵다.
//		// 프로그램 실행시 컴파일 과정에서 배열의 크기가 정해져 있어야 그만큼 공간을 할당 받는다
//		// 배열의 크기가 확정되지않으면 컴파일 과정에서 공간을 할당 받지 못한다.
//		// (윈도우에 의해 필요한 만큼 공간을 대여 받는데 정확한 값이 없으면 대여 못받음)
//		
//		age[0] = 10;
//		System.out.println(age[0]);
		
		
//		int[] sum = new int[3];
//		int[] a = new int[] {10,20,30};
//		int[] b = new int[] {1,5,9};
		
		// a 배열과 b 배열의 합을 sum에 저장
		
//		for (int i = 0; i < sum.length ; i++) {
//			sum[i] = a[i] + b[i];
//		}
//		
//		for (int i = 0; i < sum.length ; i++) {
//			System.out.print(sum[i] + " ");
//		}
		
		// a 와 b 배열의 데이터를 total 배열에 저장하기
		// a 배열의 값이 먼저 저장하고 이어서 b 배열의값 저장 될 수 있게
		// 저장한 뒤 total 배열 값 출력
//		int[] total = new int[10];
//		int[] a = new int[] {10,20,30,40,50};
//		int[] b = new int[] {55,44,33,22,11};
//		
//		for( int i = 0; i < total.length; i++) {
//			if(i < (total.length/2) ) 
//			total[i] = a[i];
//			else total[i] = b[i - total.length/2];
//		
//			System.out.print(total[i] + " ");
//		}
		
		
		
//		char[] name = new char[5];
//		name[0] = 'j';
//		name[1] = 'o';
//		name[2] = 'h';
//		name[3] = 'n';
		// name -> john 문자열로 저장
		// 문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다.
		// 배열이기 때문에 인덱스를 통해 문자 하나씩 입력 저장해야된다.
		// 그래서 자바에는 문자열의 사용을 편하게 하기 위해 String 클래스가 존재한다.
		// String 클래스에는 내부적으로 char 배열 생성 되도록 되어있다.
//		System.out.println(name);
//		System.out.println("member".length());
//		
//		String myName = "john";
//		System.out.println(myName);
//		myName = "설경구";
//		System.out.println(myName);
		
		
//		boolean isSame = true;
//		int[] a = new int[] {11, 20, 55};
//		int[] b = new int[] {13, 20, 55};
//		
//		for(int i = 0; i < a.length ; i++ ) {
//			if ( a[i] != b[i] ) isSame=false;			
//		}
//		if ( isSame ) 
//			System.out.println("같은 배열");
//		else
//			System.out.println("다른 배열");
		
//		char[] name1 = new char[] {'주', '동', '건'};
//		char[] name2 = new char[] {'장', '동', '건'};
//		
//		boolean isSame = true;
//		for( int i = 0; i < name1.length; i++) {
//		if(name1[i] != name2[i]) isSame = false;
//		}
//		if( isSame ) 
//			System.out.println("같은 이름");
//		else 
//			System.out.println("다른 이름");
		
		String name1 = "주동건";
		String name2 = "이동건";
		if( name1.equals(name2) ) // 문자열 비교 ( true || false ) 
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		System.out.println( name1.compareTo(name2) );
		// compareTo : 0 이라면 두 문자열 동일
		//		 양수 : 뒤의 문자열이 사전적 순서가 앞일 경우  	
		//		 음수 : 뒤의 문자열이 사전적 순서가 뒤일 경우  	
		
		int[] num = new int[] {10,20,30,40,50,60,70,80,90,100};
		
		for (int a : num) {
			System.out.println(a);
		}
		
//		for(int i=0; i < num.length; i++) {
//			System.out.println( num[i] );
//		}
		
		
		
		
		
		// 오늘의 과제
		// 랜덤 범위 1 ~ 50 
		// 랜덤  숫자 중에서 짝수 15개를 배열에 저장
		// 15개 전부 저장되면 배열 출력하시오
		// 숫자 중복 상관 없음 (중복도 없이 해보기) 
		
		
		
		
		
		
		
		
		

	}

}
