package thread2;

public class Barista implements Runnable {

	private final Cafe cafe; // 바리스타가 일하는 카페
	
	public Barista (Cafe cafe) { // 바리스타가 일하는 카페를 부여
		this.cafe = cafe;
	}
	
	
	@Override
	public void run() {
		try {
			while(true) {
				Order order = cafe.give();
				System.out.println( "바리스타 제조 : " + order.getOrderId() + " - " + order.getMenu() );
				Thread.sleep(3000);
				
				System.out.println(" 바리스타 제조완료 : " + order.getMenu() );
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
	

	