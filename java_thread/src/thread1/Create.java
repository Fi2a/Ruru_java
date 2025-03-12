package thread1;

public class Create extends Thread {

	public static Dino egg;
	
	public static void hatch(Dino dino) {
		egg = dino;
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
			
			if( egg != null ) {
				System.out.println("부화 시작");
				try {
					Thread.sleep( egg.getTime() * 1000 );
				} catch (InterruptedException e) {}
					System.out.println(egg.getName() + " 공룡 태어남" );
					egg = null;
				
			}
		}
	}
	
}

// 스레드에서 처음 실행되는 메서드는 run 이다.
// 즉, run 메서드가 종료되면 스레드는 사라진다.

