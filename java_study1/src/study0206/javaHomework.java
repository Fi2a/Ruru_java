package study0206;

import java.util.Scanner;

public class javaHomework {

	public static void main(String[] args) {

		/*
		 	베스킨라빈스 31 게임 만들기
		 	나와 컴퓨터 둘이서 진행, 31을 제시하는쪽이 패배
		 	나 부터 시작.
		 	숫자를 몇개 제시할것인지 갯수를  입력하면 자동으로 숫자가 나온다.
		 	컴퓨터는 랜덤을 이용해서 몇개 제시할거인지 해야한다.
		 	숫자는 1개부터 3개까지 가능.		 
		 */
		
		Scanner scan = new Scanner(System.in);
		int user = 0 , com = 0, i = 0;
		do {
			System.out.print("나 몇개 ? : ");
			user = scan.nextInt();
			
			i += user;
			
			switch (user) {
			case 1 : System.out.println("나 : " + i); break;
			case 2 : System.out.printf("나 : %d, %d \n", i-1, i); break;
			case 3 : System.out.printf("나 : %d, %d %d\n", i-2, i-1, i); break;		
			}
			
			if(i==31) {
				System.out.println("유저 패배"); break;
			}
			
			com = (int)(Math.random()*3+1);	
				
			i += com;
			
			switch (com) {
			case 1 : System.out.println("컴퓨터 : " + i); break;
			case 2 : 
				if(i-2==30 || i-2==29 ) {
					i-=1; // 30일때 2 입력해서 31 초과 방지, 29일때 2 입력해서 자살 방지
					System.out.println("컴퓨터 : " + i);
					break;
				}
				System.out.printf("컴퓨터 : %d, %d \n", i-1, i); break;
			case 3 : 
				if(i-3==30 || i-3==29) {
					i-=2; // 30일때 3 입력해서 31 초과 방지
					System.out.println("컴퓨터 : " + i);
					break;
				}
				
				System.out.printf("컴퓨터 : %d, %d, %d\n", i-2, i-1, i); break;
			}
			
			if(i==31) {
				System.out.println("컴퓨터 패배"); break;
			}
			
			
			
		} while(i<31);
		
		

	}

}
