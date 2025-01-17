package study0117;

public class JavaType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=20;
		float pi=3.14f;
		
		pi = num; // pi(float) = num(float) - 자동 형변화
		num = (int)pi;  // num(int) = pi(int) - 강제 형변화 / 일시적 타입 변환
		
		
		System.out.println();
		
		
	}

}
