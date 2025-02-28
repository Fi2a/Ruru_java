package interfaceTest;

public class Light implements Remotecon{ // 스마트 전구
	
	boolean power = false;
	
	@Override
	public void button() {
		
		power = !power;
		
		System.out.println("전구 전원 : " + power);
		
		
	}

}
