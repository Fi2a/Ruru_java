package customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import java.sql.*;

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

		
/*
  		자바 프로그램에서 데이터베이스 사용하기
  		1. 데이터베이스와 연결하기 위한 드라이버 로드
  		2. 계정 로그인
  		3. 쿼리문 작성하여 주고 받기 하기
  			 		 
 */
		
		
		
		
		// 다형성 - 하나의 타입으로 여러 타입을 다룰 수 있음
		// 상속 관례, implement
		
		Fruit[] menu = new Fruit[10];
		
		// 데이터베이스 연결하기 ( 드라이버 로드 )
		// com.mysql.cj.jdbc.Driver - 클래스 경로  		 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		// 계정 로그인 - 주소, DB명, 계정명, 비밀번호
		String u = "Ruru";
		String p = "1234";
		String url = "jdbc:mysql://localhost:3306/Ruru";
		// 주소/DB명
		
		// 데이터베이스와 연결한 객체를 저장 해둬야 한다.
		Connection conn = null; // 데이터베이스 연결 객체 저장할 곳
		
		try {
			conn = DriverManager.getConnection(url,u,p);
		} catch (SQLException e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		}
		
		// 쿼리문 작성하여
		String sql = "select * from store_menu1";
		
		// 작성한 쿼리문을 데이터베이스에 보내려면
		// Statement, PreparedStatement
		
		Statement st = null; // 쿼리문 보낼 떄 필요
		ResultSet rs = null; // 조회 결과 받을 떄 필요
		
		try {
			st = conn.createStatement(); // 쿼리문 전송하기 위한 준비
			rs = st.executeQuery(sql); // 쿼리문 보내고 결과 받기
			
			// rs.next() 를 통해서 조회된 결과값이 존재하는지 확인
			for (int i = 0; rs.next() ; i ++) {
				
				int cost = rs.getInt("cost"); // 금액
				int cap = rs.getInt("capacity");	  // 용량
				String type = rs.getString("fruit_type"); // 과일종류
				
				if( type.equals("banana") ) {
					menu[i] = new Banana(cost,cap);  
				}
				if( type.equals("grape") ) {
					menu[i] = new Grape(cost,cap);  
				}
				if( type.equals("orange") ) {
					menu[i] = new Orange(cost,cap);  
				}
				
			}
			
		} catch (SQLException e) {
			System.out.println(" 쿼리문 조회 실패 ");
			e.printStackTrace();
		}

		// 데이터베이스에서 조회한 데이터들을 바나나, 포도, 오렌지 객체로 저장될 수 있게 하기.
		
		
		
//		menu[0] = new Banana(2500,350);
//		menu[1] = new Grape(4000,750);
//		menu[2] = new Orange(2500,550);
//		menu[3] = new Banana(3500,450);
//		menu[4] = new Banana(7000,900);
//		menu[5] = new Grape(800,150);
//		menu[6] = new Orange(500,110);
//		menu[7] = new Banana(1000,140);
//		menu[8] = new Grape(1600,300);
//		menu[9] = new Orange(2000,440);
		
		Buyer ctm1 = new Buyer(10000); // 구매자
//		System.out.println( ctm1 );

		
		for ( int i = 0; i < menu.length; i++) {
			System.out.println(	(i+1) + ". " + menu[i]);
		}
		
		// 몇번 음료 사먹을지 고르기
		Scanner sc = new Scanner(System.in);
		System.out.print("구매 번호 : ");
		int num = sc.nextInt();
		
		// 결제 진행하고 언제 주스를 사먹었는지 어떤 주스인지 기록
		ctm1.setMoney( ctm1.getMoney() - menu[num-1].getCost() );
		// ctm1.getMoney() == 10000 , menu[num-1].getCost() == menu[num-1].cost
		
		ctm1.setBuyDate( new Date() );
		ctm1.setItem( menu[num-1] );
		
		System.out.println(ctm1);
		
		
		
		
		
				
	}

}

