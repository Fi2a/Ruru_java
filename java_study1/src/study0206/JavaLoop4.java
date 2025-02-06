package study0206;

import java.util.Scanner;

public class JavaLoop4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		1번 문제
		
		int user= 0 ;
		int sum = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		do {
			System.out.print("숫자 입력 : ");
			user = scan.nextInt();
			sum+=user;		
			
		}while(user != 0);
		System.out.println("합계 : " + sum);
		
//		2번 문제
	
//		userWin = -2, 1
//		userLose = -1, 2
//		userDraw = 0
		
		do {
			System.out.print("1. 가위 2. 바위 3. 보 : ");
			int com = (int)(Math.random()*3+1) ;
			user = scan.nextInt();
			int result = user - com;
			if(result == -2 || result == 1) {
				System.out.println("승리");
				win++;
				}
			if(result == -1 || result == 2) {
				System.out.println("패배");
				lose++;
			}
			if(result == 0) {
				System.out.println("무승부");
				draw++;
			}
		} while (win!=10);
		System.out.println("진 횟수 : " + lose + "    비긴 횟수 : " + draw);
		
//		3번 문제
		
		int user1 = 0;
		int user2 = 0;
		int com1 = 0;
		int com2 = 0;
		
		for(int game = 1; game<=5; game++) {
			user1 = (int)(Math.random()*6+1);
			user2 = (int)(Math.random()*6+1);
			com1 = (int)(Math.random()*6+1);
			com2 = (int)(Math.random()*6+1);
			
			int userSum = user1 + user2;
			int comSum = com1 + com2;				
			
			if(user1 == user2 || com1 == com2 ) {
				if(user1 == user2) {
					win++;
					System.out.println("승리");
				}
				else {
					System.out.println("패배");
					lose++;
				}
			} else if( userSum > comSum ) {
				System.out.println("승리");
				win++;				
			} else if ( userSum < comSum) {
				System.out.println("패배");
				lose++;
			} else {
				System.out.println("무승부");
				draw++;
			}	
			
		}
		System.out.println(win+"승 "+lose+"패 "+draw+"무" );
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int user = 0 ;
//		do {
//			System.out.print("1. 가위 2. 바위 3. 보 : ");
//			user = scan.nextInt();
////			if( user>=1 && user <=3 ) break;
//		}while ( !( user>=1 && user <=3 ) 
//				);
//		
//		System.out.println("가위바위보 진행");
		
		
		
		
//		int a = 10;
//		do {
//			System.out.println(" do ~ while 문");
//			a++;
//		}while ( a < 15);
		
//		초기값 -> { 내용 } -> 조건식 비교 -> 참이면 -> { 내용 } 
		
		
		
		
//		int i = 1;
//		while(i<=3) {
//			int k =1;
//			while(k<=2) {
//				System.out.println("i="+i+"  k="+k); 
//				k++;
//			}
//			i++;
//		}
		
		
		
		
//		for(int i = 1; i <= 3; i++) {
//			for(int k=1; k<=2; k++) {
//				System.out.println("i="+i+"  k="+k); 
//			}
//		}
		
		
		
	}

}
