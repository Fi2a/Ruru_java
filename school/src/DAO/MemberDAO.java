package DAO;

import java.sql.SQLException;

public class MemberDAO extends DBconnect{

	public boolean userIdAndPassword(String mId, String mPw) {
		// 입력한 아이디와 비밀번호로 테이블 조회하기
		String sql = "select * from member1 where member_id='" + mId + "' and password='" + mPw + "'";
		
		try {
			st = conn.createStatement();	// 쿼리문 보낼 수 있게 statement 생성
			rs = st.executeQuery(sql);		// statement 로 쿼리문 보내고 결과 받기
			if( rs.next() ) { // 조회결과가 있다면 next 는 true 리턴, 없으면 false
				return true;  // 로그인 성공 했으니 true 반환
			}			
		} catch (SQLException e) {
			System.out.println("아이디비번 조회 실패");
			e.printStackTrace();
		}
		
		
		return false; // 로그인 실패 false 반환
	}
	
	
	
}
