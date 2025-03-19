package thread2;

public class Cafe {
	private Order order;
	private boolean orderPlace = false; // 주문 여부
	
	public synchronized void placeOrder(String menu) throws InterruptedException { // 매장주문
		while( orderPlace ) { // 손님 대기
			wait();
		}
		order = new Order(menu);
		System.out.println( "손님 매장주문 : " + order.getOrderId() + " - " + order.getMenu() );
		orderPlace = true;
		notify(); // 주문이 들어가면 give() 메서드의 대기 해제
	}
	
	public synchronized Order give() throws InterruptedException {
		while( !orderPlace ) { // 주몬 들어올 때 까지 대기
			wait();
		}
		orderPlace = false;
		notify();
		
		return order;
	}
	
	
}

//public void takeOrder (String menu) { // 포장주문
//	order = new Order(menu);
//	System.out.println( "손님 포장주문 : " + order.getOrderId() + " - " + order.getMenu() );
//}