package exception5;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
		
		// 오류가 발생해도 오류가 없어도 무조건 실행
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int total = 0;

		try {
			System.out.print("현금 : ");
			money = sc.nextInt();
			total = money * 5;
		} catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		} finally {
			System.out.println("총 금액 : " + total);
		}
		
		
		
		
	}

}
