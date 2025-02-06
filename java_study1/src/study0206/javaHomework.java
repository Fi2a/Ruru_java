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
		int user = 0 , com = 0 , sum = 0;
		int i = 0;
		do {
			System.out.print("나 몇개 ? : ");
			user = scan.nextInt();
			
			i += user;
			
			if(user==2) {
				System.out.printf("나 : %d, %d", i-1, i);
			}
				
				
			
			
			i += com;
			
			
		} while(sum!=31);
		
		

	}

}
