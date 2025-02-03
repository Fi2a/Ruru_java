package study0131;

import java.util.Scanner;

public class JavaIf3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		싸다구 주차장 주차비 결제
//		주차장의 기본 요금은 1000원 , 기본 시간은 30분
//		11분 주차해도 1000원 이다.
//		10분당 100원씩 추가 요금
//		주차 몇분 했는지 입력하여 주차요금이 얼만지 출력하세요.
		
		
		int m = 0;
		int h = 0;
		int num = 0;
		int cost = 0;
		int num2 = 0;
		
		System.out.print("주차 시간(시간) : ");
		h = scan.nextInt();
		System.out.print("주차 시간(분) : ");
		m = scan.nextInt();
		
		num = 60*h+m;
		
		
		if (num <40 && num > 0) {
			cost=1000;
		} else if (num < 120) {
			cost = 1000;
			num2 = (num-30)/10;			
		}
		
		
//		2시간 이상 주차시 기본요금 1700원
//		2시간 10분 주차하면 1800원 (10분당 100원씩 추가요금)
//		4시간 이상 주차시 기본요금은 2500원
//		4시간 15분 주차하면 2600원 (10분당 100원씩 추가요금)
//		8시간 이상 주차시 무조건 10000원
//		주차 몇시간 몇분 했는지 입력하여 주차요금이 얼마인지 출력하세요
		
//		else if (num>=120 && num<240) {
//			int num2 = (num-120)/10;
//			System.out.println(1700+(num2*100)+"원");
//		}
//		else if (num>=240 && num<480) {
//			int num2 = (num-240)/10;
//			System.out.println(2500+(num2*100)+"원");
//		}
//		else if (num>=480) {
//			System.out.println((10000)+"원");
//		}
		

		else if (num<240) {
			num2 = (num-120)/10;
			cost = 1700;
		}
		else if (num<480) {
			num2 = (num-240)/10;
			cost = 2500;
		}
		else if (num>=480) {
			cost = 10000;
		}

		
		System.out.println(cost+(num2*100)+"원");
		
		
		

	}

}
