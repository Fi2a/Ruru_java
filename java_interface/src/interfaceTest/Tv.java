package interfaceTest;

public class Tv implements Remotecon { // 스마트 TV
	
	boolean power = false;

	@Override
	public void button() {
		
		power = !power;
		
		System.out.println("TV 전원 : " + power);
		
	}

}
