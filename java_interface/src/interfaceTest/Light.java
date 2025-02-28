package interfaceTest;

public class Light implements Remotecon{ // 스마트 전구

	@Override
	public void button() {
		
		boolean power = false;
		power = !power;
		
		System.out.println("전구 전원 : " + power);
		
		
	}

}
