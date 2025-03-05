package inner2;

public class NoneName {
	
	Object ob = new Object() {
		public int hashCode(int a) {
			return 10;
		}
	};	// 익명 클래스 정의와 메서드정의를 
		// 동시에 하면서 객체생성까지
	
	void myInner() {
		
	}
	
	
}
