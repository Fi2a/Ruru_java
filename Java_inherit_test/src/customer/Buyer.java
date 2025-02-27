package customer;

import store.Fruit;

public class Buyer {
	private int money;
	private Fruit item; // 구매한 음료 또는 컵과일 저장 변수
	
	public Buyer(int money) { // Buyer 객체생성시 동작할 생성자메서드
		this.money = money;
	}
	
	
	// set, get 메서드
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Fruit getItem() {
		return item;
	}
	public void setItem(Fruit item) {
		this.item = item;
	}
	
	
	public String toString() {
		return ("보유머니 : " + money+"원");
	}
	

	
}

