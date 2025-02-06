package study0203;

import java.util.Scanner;

public class JavaSwitch1 {

	public static void main(String[] args) {

		// switch 문
		// if 문
		
//		if(10 < 5) {
//			System.out.println("aaa");
//		}
		
//		
//		switch("가나") { 
//		case "다라": // 스위치 () 안에 타입이 문자열이면 case 뒤에도 무조건 문자열
//			System.out.println("ㄱㄴㄷㄹ");
//		}
//		
//		
//		
//		switch(3) {
//		case 1:
//			System.out.println("1을 선택");
//			break; // 해당 제어문을 강제 종료
//		case 3:
//			System.out.println("3을 선택");
//			break;
//		case 10:
//			System.out.println("10을 선택");
//			break;
//		}

		
//		int num = 15 ;
//		switch (num) {
//		case 10 :
//			System.out.println("10 선택");
//			break;
//		case 30 :
//			System.out.println("30 선택");
//			break;
//		case 20 :
//			System.out.println("case에 포현되는 데이터는 정수, 문자, 문자열");
//			break;
//		case 50 :
//			System.out.println("입력된 값에 맞는 case 실행은 "
//					+ "break; 또는 } 까지 실행");
//			break;
//		default :
//				System.out.println("case 에 없는 값 실행");
//		}
		
		
		int 점수 = 79;
		switch (점수/10) {
		case 10 :
		case 9 :
			System.out.println("A학점");
		case 8 :
			System.out.println("B학점");
		case 7 :
			System.out.println("C학점");
		default :
			System.out.println("F학점");
		}
		
		
		
		
/*
	       과제 2월 3일
	       
	       가위바위보 게임 만들기
	       1. 가위 2. 바위 3. 보
	       컴퓨터와 승패무 표시
*/      
	      int com = 0, user = 0 ;
	      Scanner scan = new Scanner(System.in);
	      System.out.print("1. 가위 2. 바위 3. 보 : ");
	      user = scan.nextInt();
	      com = (int)(Math.random()*3+1);
	      int result = user - com;
	      int win = 0, draw = 0 , lose = 0;
	      if(result == -2 || result == 1)
	    	  win++;
	      if(result == -1 || result == 2)
	    	  lose++;
	      if(result ==0)
	    	  draw++;
	      
	      switch ( user - com ) {
	      	case 0 : System.out.println("무승부");
	      	break;
	      	case -2 :	      	
	      	case 1 : System.out.println("승리");
	      	break;
	      	case 2 : 
	      	case -1 : System.out.println("패배");
	      	break;
	      }
	      
	      System.out.println(win);
	      System.out.println(draw);
	      System.out.println(lose);
	      
	      
	      
	      
	      
//	      int result = user - com;
////	      userWin = -2, 1
////	      userDraw = 0
////	      userLose = 2, -1
//	      
//	      if(result == -2 || result == 1) {
//	         System.out.println("유저 승리");
//	      }
//	      if(result == 0) {
//	         System.out.println("무승부");
//	      }
//	      if(result == 2 || result == -1) {
//	         System.out.println("유저 패배");
//	      }
	   
		
		
		
		
		
		
		
		
		
		
	}

}
