package thread2;

import java.util.Random;

public class Customer implements Runnable { // 손님

	private Cafe cafe;
	private final String[] menu = {
			"아메리카노", "키위주스", "라뗴", "아인슈패너"			
	};
	private final Random random = new Random();
	
	
	public Customer(Cafe cafe) {
		this.cafe = cafe;
	}
	
	
	
	@Override
	public void run() {
		try {
		while(true) {
			String item = menu[random.nextInt(menu.length)];
			cafe.placeOrder(item);
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
