package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import vo.Answer;

public class AnswerDAO extends DBconnect {

	public ArrayList<Answer> answer() {
		
		ArrayList<Answer> answer = new ArrayList<>();
		
		String sql = "select * from answer";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while( rs.next() ) {
				Answer ans = new Answer( rs.getInt("id"), rs.getInt("age"), rs.getInt("ans1"), rs.getInt("ans2"), rs.getInt("ans3") );
				answer.add(ans);				
			}
		} catch (SQLException e) {
			System.out.println("답변 출력 실패");
			e.printStackTrace();
		}
		
		return answer;
		
	}
	
	
	
	public void savedata(int id, int age , int ans1, int ans2 , int ans3) {
	
		String sql = "insert into answer(qt_id, member_id, choice, date) values (" + id +", " + age + ", " + ans1 + " , '" + ans2 + ", " + ans3 + " ')";
		
		try {
			st = conn.createStatement();	// 쿼리문 보낼 수 있게 statement 생성
			st.executeUpdate(sql);
						
		} catch (SQLException e) {
			System.out.println("데이터 전송 실패");
			e.printStackTrace();
		}
	}
	
}
