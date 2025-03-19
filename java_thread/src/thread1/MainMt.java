package thread1;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
//		MyThread th1 = new MyThread("홍인택");
//		th1.start();
//		
//		MyThread th2 = new MyThread("윤찬혁");
//		th2.start();
////		Test test = new Test();
////		test.testfor();
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + " main 메서드 " );
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		Dino[] 알 = new Dino[] {
				new Dino("티라노사우루스", 10),
				new Dino("밸로시랩터", 4),
				new Dino("프테라노돈", 6),
				new Dino("스테고사우루스", 7)
		};
		
		// 알 갯수만큼 스레드 만들기
		Create[] device = new Create[알.length];
		for( int i = 0; i < 알.length; i++ ) {
			device[i] = new Create();
		}
		
		device[0].start();
		device[1].start();
		device[2].start();
		device[3].start();
		
		// 부화 시킬 공룡을 선택해 부화를 진행한다
		// 스레드를 통해 각 공룡별 시간만큼 동작하도록 한다
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<알.length; i++) {
			System.out.print("1~4 중 하나 : ");
			int select = sc.nextInt();
			
			System.out.println( (i+1) + "번 부화장치 가동"  );
			
			Create.hatch( 알[select-1] );
			
			System.out.println("계속 ? ( 1 - 계속 ) : ");
			int sel =sc.nextInt();
			if( sel != 1 ) {
				break;
			}
			
		}
		
		
		
		
	}

}


/*
  	프로세스 - 운영체제에서 프로그램을 실행시키는 단위 / 운영체제 - 윈도우 등등	
  		운영체제에서 프로그램을 실행시키려면 관리가 필요
  		운영체제에 의해 프로그램이 실행 되는 것이고 
  		각 프로그램의 메모리는 운영체제로 부터 할당받음
  		모든 프로세스는 고유한 아이디를 가지고 있음
  		이런 아이디를 프로세스라 한다	
  		
  	스레드 - 프로세스의 명령처리 단위
  	
  	원 스레드의 장점
  		- 컴퓨터의 자원 소모 감소
  		- 컴퓨터 처리량 증가
  		- 명령코드 실행에서 충돌 방지
  		- 오류가 발생해도 예외처리가 쉽다.
  		
  	멀티 스레드 장점
  		- cpu 코어 컨텍스트 스위칭 값 감소
  		- 데이터 주고 받는것이 간단해짐
  		- 응답 시간 단축
  		- 네트워크 환경에 적합
  		
  	스레드 의 생명 주기
  	1. new ( 스레드 생성 )
  	2. runnable 상태 ( 실핼 준비 )
  	3. running 상태 ( 실행 )
  		- suspend , wait , sleep 에 걸리면
  		   -> 대기 상태
  		- 대기 상태에서 resume , notify , sleep time up 
  		   -> 실행 준비 상태로 변경
  	4. terminated 상태 ( 소멸 )
  		
  		
 */
