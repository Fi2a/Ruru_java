package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	public Connection conn;
	public Statement st;
	public ResultSet rs;
	
	public DBconnect() {
		connection();
	}
	
	private void connection() {
		try {
			// 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 계정 로그인	
			String user="ruru";
			String password="1234";
			String url ="jdbc:mysql://localhost:3306/survey";
			conn = DriverManager.getConnection(url,user,password);
			
		}catch(Exception e) {
			System.out.println("드라이버 로드 및 접속 실패");
		}
		
	}
}