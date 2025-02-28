package innerTest;

public class Car {
	private Tire tire;
	
	public Car ( Tire tire ) {
		this.tire = tire;
	}

	public Tire getTire() { // Tire << private
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	// 포함관계에서 클래스객체 생성시기
	
}
