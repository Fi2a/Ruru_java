package study0210;

import java.util.Scanner;

public class JavaHomework {

	public static void main(String[] args) {
		
	/*
	 	과제 - 숫자 야구
	 	1~9 중에 임의의 숫자 3개를 뽑아낸다. (중복없이)
	 	3개의 숫자를 맞추기 해야한다.
	 	예) 	임의의 숫자 - 7 1 8
	 		입력 : 1 2 3
	 		결과 : 0 스트라이크 1볼 2아웃
	 		입력 : 4 7 9
	 		결과 : 0 스트라이크 1볼 2아웃
	 		입력 : 4 1 8
	 		결과 : 2 스트라이크 0볼 1아웃
	 */
		
		Scanner scan = new Scanner(System.in);
		
		
//		int rn1 = (int)(Math.random()*9+1);
//		int rn2 = (int)(Math.random()*9+1);
//		int rn3 = (int)(Math.random()*9+1);
		
		
		int rd1 = 0;
		int rd2 = 0;
		int rd3 = 0;
		
	
		
		do {
			rd1 = (int)(Math.random()*9+1);
			rd2 = (int)(Math.random()*9+1);
			rd3 = (int)(Math.random()*9+1);
		} while ( !(rd1 != rd2 && rd2 != rd3) ); // 3개의 숫자가 중복없이 1~9 중의 하나의 숫자를 가진다.
		
		while(true) { // 숫자 맞출 때 까지 반복해야 하니 무한루프
			System.out.print("숫자 3개 입력 : ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int str = 0 , ball = 0;
			
			
//			스트라이크인 경우
			if( a == rd1) str++;
			if( b == rd2) str++;
			if( c == rd3) str++;
			
//			볼인 경구
			if( a == rd2 || a == rd3) ball++;
			if( b == rd1 || b == rd3) ball++;
			if( c == rd1 || c == rd2) ball++;
			
			System.out.printf("%d스트라이크 %d볼 %d아웃 \n",str,ball,3-str-ball);
			
			if( str == 3) {
				System.out.println("유저 승리");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
//		for ( int rd1 = (int)(Math.random()*9+1); rd1<=9; rd1++) {
//			for ( int rd2 = (int)(Math.random()*9+1); rd2<=9; rd2++) {
//				for ( int rd3 = (int)(Math.random()*9+1); rd3<=9; rd3++) {
		
//		while(true) {
//			
//			System.out.print("숫자 3개 입력 : ");
//			a = scan.nextInt();
//			b = scan.nextInt();
//			c = scan.nextInt();
//			
//					if(rd1 != rd2 && rd2 != rd3) {
//						int st = 0;
//						int ball = 0;
//						int out = 0;
//						if(a==rd1 || b==rd2 || c==rd3) {
//							st++;
//						}else if(a==rd2 || a==rd3 || b==rd1 || b==rd3 || c==rd1 || c==rd2) {
//							ball++;
//						}else {
//							out++;
//						}
//						
//						System.out.printf(" %d스트라이크 %d볼 %d아웃 \n ",st,ball,out);
//						
//						
//					}
//					
//					if(rd1 == a && rd2 == b && rd3 == c) {
//						System.out.println("유저 승리");
//						break;
//					}
//					
//					
//					
//		
//		
//			
//				}
//						
//						
//				
//					
				
			
		
		
		
		
		
			
			
			
		}
		

}
