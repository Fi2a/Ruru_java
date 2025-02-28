package interfaceTest;

public class Aircon implements Remotecon { // 에어컨
	
	boolean power = false;

	@Override
	public void button() {

		power = !power;
		
		System.out.println("에어컨 전원 : " + power);
		
	}

}
