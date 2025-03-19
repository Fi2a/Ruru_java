package thread1;

public class Create extends Thread {

	public static Dino egg;
	
	public static void hatch(Dino dino) {
		egg = dino;
	}
	
	@Override
	public void run() {
		
		Dino myEgg = null; // 지역변수
		
		while(true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			
			// egg 에 값이 들어오고 myEgg 가 null 인 경우는 공룡알 부화 시작안한상태
			// egg 에 값이 들어왔지만 myEgg 변수가 값을 가진 경우는 부화 시작한 상태
			if( egg != null && myEgg == null ) {
				myEgg = egg;	// run 메서드 내부 변수에 값 전달
				egg = null;		// 값 전달 했으니 다시 null
				System.out.println(myEgg.getName() +  " 부화 시작");
				try {
					Thread.sleep( myEgg.getTime() * 1000 );
				} catch (InterruptedException e) {}
					System.out.println(myEgg.getName() + " 공룡 태어남" );
				myEgg = null;
			}
		}
	}
	
}

// 스레드에서 처음 실행되는 메서드는 run 이다.
// 즉, run 메서드가 종료되면 스레드는 사라진다.

