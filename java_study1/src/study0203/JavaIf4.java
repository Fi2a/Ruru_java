package study0203;

import java.util.Scanner;

public class JavaIf4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Math.random() 은 0.0000 ~ 부터 0.99999 ~ 까지 이다.
//		곱하기 계산과 더하기 계산으로 범위를 지정 할 수 있다.
		
//		int num = (int)(Math.random()*10)+1;
//		
//		System.out.println(num);
		
		
//		int user = 0 , coin = 0 ;
//		System.out.print("1.앞면, 2.뒷면 : ");
//		user = scan.nextInt();
//		
//		coin = (int)(Math.random()*2+1);
//		
//		if(coin==user) {
//			System.out.println("맞춤");
//		}else {
//			System.out.println("틀림");
//		}
		

		
		
//		컴퓨터가 동전을 15개 가지고 있다.
//		컴퓨터가 제시한 동전 갯수가 짝수인지 홀수인지 맞추는 게임을 만드세요.
		
//		int coin = (int)(Math.random()*15+1);
//		System.out.print("1. 짝수 or 2. 홀수 : ");
//		int user = scan.nextInt();
//		
//		
//		
//		if(coin%2==1 && user == 2) {
//			System.out.println("맞춤");
//		}else if(coin%2==0 && user == 1) {
//			System.out.println("맞춤");
//		} else{
//			System.out.println("틀림");
//		}	
		
		
		
		
//		주사위게임 ( 육면체 )
//		컴퓨터가 주사위를 던진다.
//		주사위값이 3 이하면 작은값, 4 이상이면 큰값
//		1. 작다, 2. 크다
//		주사위값이 작은값인지 큰값인지 맞추기
		
		int com = 0, user = 0;
		com = (int)(Math.random()*6+1);
		System.out.print("1. 작다, 2. 크다 : ");
		user=scan.nextInt();
		
		if(com<=3 && user == 1) {
			System.out.println("작은값 정답");
		} else if (com >=4 && user == 2) {
			System.out.println("큰값 정답");
		} else {
			System.out.println("오답");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
