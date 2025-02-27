package store;

public abstract class Fruit { // 부모 클래스 - 추상클래스
	protected int cost; // 판매 가격
	protected int capacity; // 용량
	
	protected Fruit() {}
	protected Fruit(int c, int cp) {
		this.cost=c;
		this.capacity=cp;
	}
	
	
	
	public abstract void makeJuice(); // 과일 쥬스만들기
	public abstract void pieceFruit(); // 과일 소량 팔기
	
	public abstract String toString();

	
	
}

