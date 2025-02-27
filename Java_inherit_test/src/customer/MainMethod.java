package customer;

import store.Banana;
import store.Fruit;
import store.Grape;
import store.Orange;


public class MainMethod {
	
	
	
	
	
	public static void main(String[] args) {
		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면?
		// 바나나 - 15개, 포도 - 6개, 오렌지 - 54개
		
		Banana[] ba = new Banana[15];
		
		
		
//		ba[0] = new Banana(2500,500);

		
		
		
		// 다형성 - 하나의 타입으로 여러 타입을 다룰 수 있음
		// 상속 관례, implement
		
		Fruit[] menu = new Fruit[10];
		menu[0] = new Banana(2500,350);
		menu[1] = new Grape(4000,750);
		menu[2] = new Orange(2500,550);
		menu[3] = new Banana(3500,450);
		menu[4] = new Banana(7000,900);
		menu[5] = new Grape(800,150);
		menu[6] = new Orange(500,110);
		menu[7] = new Banana(1000,140);
		menu[8] = new Grape(1600,300);
		menu[9] = new Orange(2000,440);
		
		Buyer ctm1 = new Buyer(10000); // 구매자
		System.out.println("보유금 : " + ctm1.getMoney());
		
		for( Fruit a : menu ) {
			System.out.println(a); 
			// menu[a] 실행값 
		}
		
		System.out.println( ctm1 );
		
				
	}

}

