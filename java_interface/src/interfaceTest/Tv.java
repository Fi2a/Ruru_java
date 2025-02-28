package interfaceTest;

public class Tv implements Remotecon { // 스마트 TV

	@Override
	public void button() {
		
		boolean power = false;
		power = !power;
		
		System.out.println("TV 전원 : " + power);
		
	}

}
