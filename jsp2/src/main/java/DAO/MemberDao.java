package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	
	private Connection conn;
	private PreparedStatement pt;
	private ResultSet rs;
	
	public MemberDao() {
		connect();
	}
	
	public boolean loginCheck (String email, String pw) {
		
		String sql = "select * from member where email = ? and password = ? ";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, email);
			pt.setString(2, pw);
			rs = pt.executeQuery();
			
			if(rs.next()) return true;
			
		} catch (SQLException e) {
			System.out.println("아디 비번 조회 실패");
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	private void connect() {

		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String id = "ruru";
			String pw = "1234";
			String url = "jdbc:mysql://210.219.170.244:3306/ruru";
			
			conn = DriverManager.getConnection(url, id, pw);
			
			
		} catch (Exception e){
			System.out.println("드라이버 접속 실패");
			e.printStackTrace();
		}
		
	}
	
	
	
}
