package interfaceTest;

public class MainMt {

	public static void main(String[] args) {
		
		Remotecon [] rcon = new Remotecon[] {
				new Light(),
				new Tv(),
				new Aircon()
		};
		
		for ( Remotecon con : rcon) {
			con.button();
			con.button();
		}
		
		
//		Remotecon 전구 = new Light();
//		Remotecon 티비 = new Tv();
//		Remotecon 에어컨 = new Aircon();
//		
//		
//		전구.button();
//		전구.button();
//		
//		티비.button();
//		티비.button();
//		티비.button();
//		
//		에어컨.button();
		
		
		
		
	}

}
