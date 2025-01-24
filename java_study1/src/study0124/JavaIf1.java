package study0124;

public class JavaIf1 {

	public static void main(String[] args) {
		
		// 바이킹 탑승 - 키가 140이상 만 탑승
		int tall = 163;
		// if문에는 조건식이 반드시 if뒤에 붙어야 한다.
		
		if (tall >= 140) { // 중괄호에는 조건에 따라 실행될 내용작성
			System.out.println("탑승 가능");
		} else { // else 는 조건식이 거짓일경우 실행
			System.out.println("탑승 불가능");
		}
		
		// 두 숫자중 큰 수는?
		int num1 = 35, num2 = 12;
		if (num1 > num2) {
			System.out.println(num1);;
		}else {
			System.out.println(num2);
		}
		
		// 철수와 민수의 중 누가 더 발이 더 큰가?
		int 철수 = 275, 민수=260;
		if (철수 > 민수) {
			System.out.println("철수");
		}else {
			System.out.println("민수");
		}
		
		// 편의점에서 도시락 사먹는데 ,가격이 5200원이다.
		// 내 통장 잔액이 4530원이라면, 얼마를 이체 해야하가??
		// (잔액이 충분하다면 이체 할 필요없다)
		int money = 4530;
		int meal = 5200;
		if (money < 5200) {
			System.out.println("이체 금액 : " + (meal-money) );
		}else {
			System.out.println("결제됨.");
		}
		
		// 바이킹 탑승 조건 - 키가 140이상 190이하만 탑승 가능
		if (tall >= 140 && tall <= 190) {
			System.out.println("탑승 가능");
		}else {
			System.out.println("탑승 불가능");
		}
		
		// 후룸라이드 탑승하려면 키가 130이상이거나 몸무게 45kg 이상만 가능
		tall=140;
		int wg=35;
		if (tall < 130 && wg < 45) {
//		if ( !(tall >= 130 || wg >= 45) ) {
			System.out.println("탑승 불가");
		} else {
			System.out.println("탑승 가능");
		}
		
		
		
		

	}

}
