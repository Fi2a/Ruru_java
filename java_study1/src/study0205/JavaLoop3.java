package study0205;

import java.util.Scanner;

public class JavaLoop3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int com=(int)(Math.random()*50+1);
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = scan.nextInt();
//			if (com == num) {
//				System.out.println("정답");
//				break;
//			}
//			if (com > num) {
//				System.out.println("업");
//			}
//			if (com < num) {
//				System.out.println("다운");
//			}
//		}
		
		// 오늘의 과제
		   //  1~50 중 하나를 내가 입력한다.
		   //  내가 입력한 숫자를 컴퓨터가 맞춰야한다. (random 사용)
		   //  무작위로 맞추는게 아니고  범위를 좁히면서  맞출 수 있도록 해야한다.
		      
		      int user = 0 ;		      
		      System.out.print("숫자 입력 : ");
		      user = scan.nextInt();
		      
		      int range = 50;
		      int low = 0, high = 50;
		      int com = (int)(Math.random()*50+1);
		      while(true) {
		         if(user>com) {
		            System.out.println("업 " + com);
		            low=com;
		            range = high - low;
		            System.out.println("범위 : " + low + "~"+high);
		            com = com + (int)(Math.random()*range+1);   
		            
		         } else if(user<com) {
		            System.out.println("다운 "+ com);
		            high=com-1;                           
		            range = high - low;
		            System.out.println("범위 : " + low + "~"+high);
		            com = com - (int)(Math.random()*range-+1);
		            
		         }
		         if(user==com) {
		            System.out.println("정답");
		            break;
		         }
		         
		      }
		      
		      
		     
		
		
//		동전 앞뒤 맞추기 게임
//		내 돈이 바닥 날 때 까지 게임진행
//		System.out.print("돈 얼마? : ");
//		int money = scan.nextInt();
//		final int 판돈 = 1000;
//		int win = 0;
//		
//		while (true) {
//			int coin = (int)(Math.random()*2+1); // 1 앞 2 뒤
//			System.out.print("1. 앞면 , 2. 뒷면 : ");
//			int user = scan.nextInt();
//			if(user == coin) {
//				System.out.println("정답");
//				win++;
//			} else {
//				System.out.println("땡");
//			}
//			money -= 판돈; // 1번 진행시 1000원씩 감소	
//			if(money < 판돈) break;
//		}
//		System.out.println("남은 돈 : " + money);
//		System.out.println("이긴 횟수 : " + win);
		
		
		
		
		
		
//		for( 초기값; 조건식; 증감식 ) 
//		반복횟수가 정해져있는 경우 for 문이 가독성이 좋다
//		반복횟수가 없는경우 while 문이 가독성이 좋다
		
//		for(int a= 1; a<=10; a++) {
//			System.out.println(a);
//		}		
//		==
//		int a = 1; // while 문 초기값
//		while(a<=10) { // while 문 조건식
//			System.out.println(a);
//			a++; // while 문 증감식
//		}

	}

}
