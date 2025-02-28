package interfaceTest;

public class Aircon implements Remotecon { // 에어컨

	@Override
	public void button() {

		boolean power = false;
		power = !power;
		
		System.out.println("에어컨 전원 : " + power);
		
	}

}
